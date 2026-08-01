class Solution {
    public int firstMissingPositive(int[] nums) {
        int smallest =1;
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(nums[i]<1 || i>0 && nums[i]==nums[i-1] ){
            continue;
         }
         else if(nums[i]==smallest){
            smallest++;
         }
         else{
            return smallest;
         }
       }
       return smallest;
    }
}