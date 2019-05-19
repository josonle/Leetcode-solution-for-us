import java.util.ArrayList;

class solveSudu {
    public void solveSudoku(char[][] board) {
        ArrayList<int[]> arr = new ArrayList<>();
        //先判断哪些可以填数
        for(int i=0;i<board.length;i++){
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]=='.'){
                    arr.add(new int[]{i,j});
                }
            }
        }
        backtrack(0,arr,board);
    }
    //回溯填入数
    public boolean backtrack(int i,ArrayList<int[]> arr,char[][] board){
        if(i==arr.size())
            return true;
        for(char c='1';c<='9';c++){
            if(check(arr.get(i),c,board)){
                board[arr.get(i)[0]][arr.get(i)[1]] = c;
                if(backtrack(i+1,arr,board))//看插入c是否保证其余空也能够插入
                    return true;
                board[arr.get(i)[0]][arr.get(i)[1]] = '.';//不能插入c，重新填空
            }
        }
        return false;
    }
    //判断能否填入c
    //indexs存了横纵坐标，
    public boolean check(int[] indexs,char c,char[][] board){
        int row = indexs[0],col = indexs[1];
        for(int i=0;i<board.length;i++){
                if(board[row][i] == c||board[i][col] == c)
                    return false;
        }
        int subRow = row/3*3, subCol = col/3*3;
        for(int m=subRow;m<subRow+3;m++){
            for(int n=subCol;n<subCol+3;n++){
                if(board[m][n]==c) return false;
            }
        }
        return true;
    }
}