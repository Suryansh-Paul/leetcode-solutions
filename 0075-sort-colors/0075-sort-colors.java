class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        int k=0;
        for(int num : nums){
            count[num]++;
        }
        while(count[0]>0){
            nums[k]= 0;
            k++;
            count[0]--;
        }
          while(count[1]>0){
            nums[k]= 1;
            k++;
            count[1]--;
        }
          while(count[2]>0){
            nums[k]= 2;
            k++;
            count[2]--;
        }
        
    }
}