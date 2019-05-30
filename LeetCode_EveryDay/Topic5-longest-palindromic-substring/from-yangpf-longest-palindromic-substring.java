//暴力解法
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)   return "";
        for(int i=s.length();i>0;i--){
            for(int j=0;j<=s.length()-i;j++){
                String str=s.substring(j,j+i);
                if(isHuiWen(str))    return str;
            }
        }
        return null;
    }
    public boolean isHuiWen(String s){
        if(s.length()==1)   return true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))   return false;
        }
        return true;
    }
}

//动态规划
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0)   return "";
        boolean[][] dp=new boolean[s.length()][s.length()];
        int max=-1;
        String res="";
        for(int j=0;j<s.length();j++){
            for(int i=0;i<=j;i++){
                // if(i==j){
                //     dp[i][j]=true;
                // }
                if(s.charAt(i)==s.charAt(j) && j-i<=2){
                    dp[i][j]=true;
                }
                else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                }
                if(dp[i][j] && j-i+1>=max){
                    max=j-i+1;
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}
