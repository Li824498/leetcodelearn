package L7BackTracking;

public class Leet32_37 {
    public static void main(String[] args) {

    }
    static class Solution {
        public void solveSudoku(char[][] board) {
            solveSudokuHelper(board);
        }

        public boolean solveSudokuHelper(char[][] board) {
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++){
                    if(board[i][j] == '.') {
                        for(char k = '1'; k <= '9'; k++) {
                            if(isValid(i, j, k, board)){
                                board[i][j] = k;
                                boolean result = solveSudokuHelper(board);
                                if(result) {
                                    return true;
                                }
                                board[i][j] = '.';
                            }
                        }
                        return false;
                    }
                    // if (board[i][j] != '.'){ // 跳过原始数字
                    //     continue;
                    // }
                    // for (char k = '1'; k <= '9'; k++){ // (i, j) 这个位置放k是否合适
                    //     if (isValid(i, j, k, board)){
                    //         board[i][j] = k;
                    //         if (solveSudokuHelper(board)){ // 如果找到合适一组立刻返回
                    //             return true;
                    //         }
                    //         board[i][j] = '.';
                    //     }
                    // }
                }
            }
            return true;
        }
        public boolean isValid(int row, int col, char k, char[][] board) {
            for(int j = 0; j < 9; j++) {
                if(board[row][j] == k) {
                    return false;
                }
            }
            for(int i = 0; i < 9; i++) {
                if(board[i][col] == k) {
                    return false;
                }
            }
            int startRow = (row / 3) * 3;
            int startCol = (col / 3) * 3;
            for(int i = startRow; i < startRow + 3; i++) {
                for(int j = startCol; j < startCol + 3; j++) {
                    if(board[i][j] == k) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
