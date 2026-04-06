class Solution {
    public boolean exist(char[][] board, String word) {
        //your code goes here
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(func(i, j, 0, board, word)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean func(int i, int j, int ind, char[][] board, String word){
        if(ind == word.length() || word.length() == 1) return true;
        if(board[i][j] == ' ' || board[i][j] != word.charAt(ind)) return false;

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean ans = false;
        if(i + 1 < board.length){
            ans = ans || func(i + 1, j, ind + 1, board, word);
        }
        if(i - 1 >= 0){
            ans = ans || func(i - 1, j, ind + 1, board, word);
        }
        if(j + 1 < board[0].length){
            ans = ans || func(i, j + 1, ind + 1, board, word);
        }
        if(j - 1 >= 0){
            ans = ans || func(i, j - 1, ind + 1, board, word);
        }

        board[i][j] = temp;
        return ans;
    }
}