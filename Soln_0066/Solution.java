package Leetcode_Sols.Soln_0066;

class Solution {
    public int[] plusOne(int[] dignow) {
    for (int i = dignow.length - 1; i >= 0; i--) {
      if (dignow[i] < 9) {
        ++dignow[i];
        return dignow;
      }
      dignow[i] = 0;
    }

    int[] ans = new int[dignow.length + 1];
    ans[0] = 1;
    return ans;
    }
}

