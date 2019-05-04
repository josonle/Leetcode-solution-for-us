class Solution {
    public int romanToInt(String str) {
        if(str.length()==0||str==null)
			return 0;
		int values[]={1000,500,100,50,10,5,1};
        String roman ="MDCLXVI";
        int result = 0;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++) {
        	int index = roman.indexOf(arr[i]);
        	if(i+1<arr.length) {//判断下一个是否会构成类似IV这种
        		String tmp = str.substring(i, i+2);
        		switch (tmp) {
				case "IV":
					result += 4;
                    i++;
					break;
				case "IX":
					result += 9;
                    i++;
					break;
				case "XL":
					result += 40;
                        i++;
					break;
				case "XC":
					result += 90;
                        i++;
					break;
				case "CD":
					result += 400;
                        i++;
					break;
				case "CM":
					result += 900;
                        i++;
					break;
				default:
					result += values[index];
					break;
				}
        	}else {//没有下一个字符
        		result += values[index];
			}
        }
        return result;
    }
}