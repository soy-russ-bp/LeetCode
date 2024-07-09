import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        
        while (i < j) {
            if (nums[i] == 0) {
                i++;
                continue;
            }
            if (nums[j] == 0) {
                j--;
                continue;
            }

            int sum = nums[i] + nums[j];
            
            if (sum < k) {
                i++;
            } else if (sum > k) {
                j--;
            } else { // sum == k
                count++;
                nums[i] = 0; // Mark as removed
                nums[j] = 0; // Mark as removed
                i++;
                j--;
            }
        }
        
        return count;
    }
}

