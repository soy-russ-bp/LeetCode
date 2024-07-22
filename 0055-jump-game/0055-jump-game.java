class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                // If current index is greater than the maximum reach, return false
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= n - 1) {
                // If the maximum reach is greater than or equal to the last index, return true
                return true;
            }
        }
        
        return maxReach >= n - 1;
    }
}

