class Solution {
    public int pivotInteger(int n) {
        int total = n * (n + 1) / 2;
        int prefix = 0;

        for (int i = 1; i <= n; i++) {
            prefix += i;
            if (prefix == total - prefix + i) {
                return i;
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna