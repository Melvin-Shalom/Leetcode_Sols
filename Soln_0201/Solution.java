class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int Noww = 0;

        while (m != n) {
        m >>= 1;
        n >>= 1;
        ++Noww;        }

        return m << Noww;

    }
}

