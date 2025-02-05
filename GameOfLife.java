package study.array;

public class GameOfLife {

    public static void main(String[] args) {
        int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        gameOfLife(board);
    }

    public static void gameOfLife(int[][] board) {

        int[][] updatedBoard= new int[board.length][board[0].length];


        for(int i =0; i < board.length; i ++ ){

            for(int j = 0; j <board[0].length;j++ ){
                int livesNearby = livesNeighbourHood(board, i,j);

                if(board[i][j] == 1 && (livesNearby <2 || livesNearby >3)){
                    updatedBoard[i][j] =0;
                }else if (board[i][j] == 0 && livesNearby ==3) {
                    updatedBoard[i][j] =1;

                }else{
                    updatedBoard[i][j]=board[i][j];
                }
            }
        }

        for(int r =0 ; r < board.length; r++){
            board[r] = updatedBoard[r].clone();
        }


    }

    public static int livesNeighbourHood(int[][] board, int i, int j){
        int lives = 0;

        if(i >0) lives+=board[i-1][j] ;
        if(i < board.length-1) lives+= board[i+1][j];
        if(i >0 && j > 0) lives+=board[i-1][j-1];
        if(j>0) lives+=board[i][j-1];
        if(j <board[0].length-1 ) lives+=board[i][j+1];
        if(i < board.length-1 && j < board[0].length-1) lives+=board[i+1][j+1];
        if(i<board.length -1 && j > 0) lives+=board[i+1][j-1];
        if(i>0 && j < board[0].length-1) lives+=board[i-1][j+1];

        return lives;

    }
}
