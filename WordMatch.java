package study.backtracking;

public class WordMatch {

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {

        for(int i=0; i < board.length;i++){

            for(int j=0; j < board[0].length;j++){

                if(board[i][j] == word.charAt(0) ){
                    boolean[][] isvisted = new boolean[board.length][board[0].length];
                    if(helper(board, i, j, word, 0, isvisted)) return true;
                }
            }
        }
        return false;

    }

    public static boolean helper(char[][] board, int i , int j, String word, int w , boolean[][] isvisted){

        if(w >= word.length()){return true;}

        if(i <0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(w)  || isvisted[i][j]){
            return false;
        }

        // if(w ==  -1 && board[i][j] ==word.charAt(w)){
        //     return true;
        // }
        isvisted[i][j] = true;

        int[] rowOffsets = { 0, 1, 0, -1 };
        int[] colOffsets = { 1, 0, -1, 0 };

        for(int d =0; d < 4 ;d++){
            if(helper(board, i+rowOffsets[d], j+colOffsets[d],word, w+1 , isvisted)) return true;

        }
        isvisted[i][j] = false;

        return false;

    }
}
