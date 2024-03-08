class Solution {
    public int countDigits(int n) {
        int m = n;
        int c = 0;

        // Handle the case when n is 0 separately
        if (n == 0) {
            return 1;
        }

        while (n > 0) {
            if (n % 10 != 0 && m % (n % 10) == 0) {
                c++;
            }
            n /= 10;
        }
        return c;
    }
}
