package Leetcode_Sols.Soln_0268;

class Solution {
  public int missingNumber(int[] nums) {
    int ans = nums.length;

    for (int i = 0; i < nums.length; ++i)
      ans ^= i ^ nums[i];

    return ans;
  }
}

