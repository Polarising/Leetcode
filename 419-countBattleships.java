public class Solution {
    public int countBattleships(char[][] board) {
        // //method 1
        // if(board == null || board.length == 0 || board[0].length == 0){
        //     return 0;
        // }
        // int row = board.length;
        // int column = board[0].length;
        
        // int[][] temp = new int[row+2][column+2];
        // int number = 0;
        
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<column; j++){
        //         char ch = board[i][j];
        //         if(ch == 'X'){
        //             if(temp[i][j+1] != 0){
        //                 temp[i+1][j+1] = temp[i][j+1];
        //             }else if(temp[i+1][j] != 0){
        //                 temp[i+1][j+1] = temp[i+1][j];
        //             }else{
        //                 number++;
        //                 temp[i+1][j+1] = number;
        //             }
        //         }else{
        //             temp[i+1][j+1] = 0;
        //         }
        //     }
        // }
        // return number;
        
        //method 2
        if(board == null || board.length == 0 || board[0].length == 0){
            return 0;
        }
        int row = board.length;
        int column = board[0].length;
        
        int count = 0;
        //we only need to cound how many head cells of the battleships
        //must meet 3 rules: cell=='X',no left cell or left cell is '.', no up cell or up cell is '.'
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                char ch = board[i][j];
                if(ch == 'X' && (i==0 || board[i-1][j]=='.') && (j==0 || board[i][j-1]=='.')){
                    count++;
                }
            }
        }
        return count;
    }
}