package study.GraphGeneral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IslandsII {

    public static void main(String[] args) {

       int m = 3, n = 3;
       int[][] positions = {{0,0},{0,1},{1,2},{2,1}};
       numIslands2(m,n, positions);


    }

    public static List<Integer> numIslands2(int m, int n, int[][] positions) {

        int maxIsland =0;

        int[][] grid = new int[m][n];

        List<Integer> list= new ArrayList<>();

        for(int i =0 ;i < m ;i++){
            Arrays.fill(grid[i], 0);
        }

        for(int i =0; i < positions.length; i++){
            int minIsland = maxIsland+1;

            if(positions[i][0] >0 && grid[positions[i][0] -1][positions[i][1]] != 0)
                minIsland = Math.min(grid[positions[i][0] -1][positions[i][1]], minIsland);

            if(positions[i][0] < m-1 && grid[positions[i][0] +1][positions[i][1]] != 0)
                minIsland = Math.min(grid[positions[i][0] +1][positions[i][1]], minIsland);

            if(positions[i][1] >0 && grid[positions[i][0]][positions[i][1]-1] != 0)
                minIsland = Math.min(grid[positions[i][0]][positions[i][1]-1], minIsland);

            if(positions[i][1] <n-1 && grid[positions[i][0]][positions[i][1]+1] != 0)
                minIsland = Math.min(grid[positions[i][0]][positions[i][1]+1], minIsland);

            maxIsland = Math.max(maxIsland,minIsland);
            grid[positions[i][0]][positions[i][1]] = minIsland;

            list.add(minIsland);

        }

        return list;

    }
}
