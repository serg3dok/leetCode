package com.serg3d.NumberOfIslands;

import java.util.Map;

/**
 * Created by Sergey on 9/21/2016.
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 */
public class Solution {

    public static void main(String[] args) {
        char[][] grid = {   {0, 1, 0, 0, 0},
                            {0, 0, 1, 1, 0},
                            {0, 1, 1, 0, 0},
                            {0, 0, 0, 1, 0}
                        };

        System.out.println(numIslands(grid));
        
    }

    public static int numIslands(char[][] grid) {
        //System.out.println(grid.length);
        //System.out.println(grid[0].length);
        //int[][] gridNumbers = new int[grid.length][grid[0].length];

        int islands = 0;
        int num = 0;
        boolean prev = false;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    if (prev == false) {
                        islands++;
                        prev = true;
                        continue;
                    }
                    prev = false;
                }


                if (grid[i][j] == '0')  {
                    //gridNumbers[i][j] = 0;
                    continue;
                } else {

                    //gridNumbers[i][j] = ++num;

                }

                }
            }

        return islands;
    }
}
