package study.graphdfs;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadder {

    public static void main(String[] args) {
        System.out.println(out());
    }

    public static int out() {
//        int[][] board ={{-1,-1,-1,-1,-1,-1}, {-1,-1,-1,-1,-1,-1}, {-1,-1,-1,-1,-1,-1},{-1,35,-1,-1,13,-1}, {-1,-1,-1,-1,-1,-1},
//                {-1,15,-1,-1,-1,-1}};

        int[][] board = {{-1,-1,-1,46,47,-1,-1,-1},
                         {51,-1,-1,63,-1,31,21,-1},
                         {-1,-1,26,-1,-1,38,-1,-1},
                         {-1,-1,11,-1,14,23,56,57},
                         {11,-1,-1,-1,49,36,-1,48},
                         {-1,-1,-1,33,56,-1,57,21},
                         {-1,-1,-1,-1,-1,-1,2,-1},
                         {-1,-1,-1,8,3,-1,6,56}};

        int[] bd = createBoard(board);
        int n = bd.length;
        int[] isVisted = new int[n];

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        int steps = 0;
        while(!q.isEmpty()){
            int size = q.size();

            for(int j =0 ; j < size ;j++){
                int ptr = q.poll();
                if(ptr == n-1) return steps;
                for(int i =1 ; i <= 6 ; i++){
                    if(ptr+i == n-1) return steps+1;
                    else if(isVisted[ptr+i] == 0 && ptr+ i < n){

                        if(bd[ptr+i] == -1  ){
                            q.offer(ptr+i);
                        } else {
                            int jump = bd[ptr+i];
                            if(isVisted[jump] ==0){
                                if(jump == n-1) return steps+1;
                                q.offer(jump);
                            }

                        }
                        isVisted[ptr+i] = 1;
                    }
                }
            }
            steps++;
        }
        return -1;

    }

    public static int[] createBoard(int[][] board){
        int n = board.length;
        int[] bd = new int[n*n +1];

        boolean  traverseRight = true;
        int row = n-1;
        int col = 0;

        for(int i = 1 ; i < bd.length; i++){
            bd[i] = board[row][col];
            if(traverseRight == true && col < n-1){
                col++;
            }else if(traverseRight == true && col ==n-1){
                if(row >0 ) row--;
                traverseRight = false;
            }else if(traverseRight == false && col > 0){
                col --;
            }else if(traverseRight == false && col ==0){
                traverseRight = true;
                if(row >0 ) row--;
            }
        }
        return bd;
    }
}
