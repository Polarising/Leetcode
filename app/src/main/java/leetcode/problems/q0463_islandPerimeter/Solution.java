package leetcode.problems.q0463_islandPerimeter;

public class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
        	return 0;
        }

        int row = grid.length;
        int column = grid[0].length;
        int count = 0;

        for (int i=0; i<row ; i++) {
        	for (int j=0; j<column ; j++ ) {
        		if(grid[i][j]==1){
        			//up
        			if(i==0 || grid[i-1][j]==0){
        				count++;
        			}
        			//down
        			if(i==row-1 || grid[i+1][j]==0){
        				count++;
        			}
        			//left
        			if(j==0 || grid[i][j-1]==0){
        				count++;
        			}
        			//right
        			if(j==column-1 || grid[i][j+1]==0){
        				count++;
        			}
        		}
        	}
        }
        return count;
    }
}
