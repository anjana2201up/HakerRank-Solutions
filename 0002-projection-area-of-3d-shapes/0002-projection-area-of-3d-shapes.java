class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xy = 0, yz = 0, zx = 0;

        for (int i = 0; i < n; i++) {
            int rowMax = 0;
            int colMax = 0;

            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) xy++;
                rowMax = Math.max(rowMax, grid[i][j]);
                colMax = Math.max(colMax, grid[j][i]);
            }

            yz += rowMax;
            zx += colMax;
        }

        return xy + yz + zx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna