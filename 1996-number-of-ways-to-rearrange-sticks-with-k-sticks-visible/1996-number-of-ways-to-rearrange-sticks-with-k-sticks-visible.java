class Solution {
    private static final int MOD = 1_000_000_007;

    public int rearrangeSticks(int n, int k) {
        long[][] dp = new long[n + 1][k + 1];

        dp[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                dp[i][j] = (dp[i - 1][j - 1] + (long) (i - 1) * dp[i - 1][j]) % MOD;
            }
        }

        return (int) dp[n][k];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna