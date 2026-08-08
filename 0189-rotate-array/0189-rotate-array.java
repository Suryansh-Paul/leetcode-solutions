class Solution {
    public void rotate(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        k=k%nums.length;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        int l= 0;
        int r = k-1;
         while (l < r) {
            int temp1 = nums[l];
            nums[l] = nums[r];
            nums[r] = temp1;

            l++;
            r--;
        }
        int start = k;
        int end =nums.length-1;
         while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        
    }
}