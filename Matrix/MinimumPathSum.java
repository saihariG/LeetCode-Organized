package Matrix;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {

        int rows = grid.length;
        int col = grid[0].length;

        // The idea is we can either choose the min value of left cell or top and add the value to current cell
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < col ; j++) {
                if(i == 0 && j == 0) {
                    continue;
                }
                else if(i == 0 && j > 0 ) { // traversing first row
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                }
                else if(i > 0 && j == 0) { // traversing first column
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }
                else {
                    int minCost = Math.min(grid[i][j-1] , grid[i-1][j]);
                    grid[i][j] = grid[i][j] + minCost;
                }
            }
        }
        return grid[rows-1][col-1];
    }
}
