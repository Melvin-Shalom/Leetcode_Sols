package Leetcode_Sols.Soln_0009;

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        long xed = 0;
        int y = x;

        while (y > 0) {
            xed = xed * 10 + y % 10;
            y /= 10;
        }

        return xed == x;
    }
}
