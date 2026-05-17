class Solution {
    int m;
    int n;
    int[][] direction = {{1,0},{0,1},{-1, 0}, {0, -1}};
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0) && find(i, j, 0, board, word)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean find(int i, int j, int idx, char[][] board, String word){
        if(idx == word.length()) return true;
        if(i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '$'){
            return false;
        }
        if(board[i][j] != word.charAt(idx)) return false;

        char temp = board[i][j];
        board[i][j] = '$';

        for(int[] dir : direction){
            int i_ = i + dir[0];
            int j_ = j + dir[1];

            if(find(i_, j_, idx+1, board, word)) return true;
        }

        board[i][j] = temp;
        return false;
    }
}