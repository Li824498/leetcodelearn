package L7BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet31_51 {
    public static void main(String[] args) {

    }

    static class Solution {
        List<List<String>> res = new ArrayList<>();
        public List<List<String>> solveNQueens(int n) {
            char[][] chessboard = new char[n][n];
            for(char[] c : chessboard) {
                Arrays.fill(c, '.');
            }
            backtracking(n, 0, chessboard);
            return res;
        }
        public void backtracking(int n, int row, char[][] chessboard) {
            if(row == n) {
                res.add(Array2List(chessboard));
                return;
            }

            for(int col = 0; col < n; col++) {
                if(isVaild(row, col, n, chessboard)) {
                    chessboard[row][col] = 'Q';
                    backtracking(n, row+1, chessboard);
                    chessboard[row][col] = '.';
                }
            }
        }
        public List<String> Array2List(char[][] chessboard) {
            List<String> list = new ArrayList<>();
            for(char[] c : chessboard) {
                list.add(String.copyValueOf(c));
            }
            return list;
        }
        public boolean isVaild(int row, int col, int n, char[][] chessboard) {
            for(int i = 0; i < row; i++) {
                if(chessboard[i][col] == 'Q') {
                    return false;
                }
            }
            for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if(chessboard[i][j] == 'Q') {
                    return false;
                }
            }
            for(int i = row - 1, j = col + 1; i >= 0 && j <= n - 1; i--, j++) {
                if(chessboard[i][j] == 'Q') {
                    return false;
                }
            }
            return true;
        }
    }
}