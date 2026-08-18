class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0;
        long k = 1;

        while (k * (k - 1) / 2 < n) {
            long remaining = n - k * (k - 1) / 2;
            if (remaining % k == 0) {
                count++;
            }
            k++;
        }

        return count;
    }
}