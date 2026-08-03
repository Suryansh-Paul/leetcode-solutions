class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                 count2++;
            }
            else if(count1==0){
                candidate1 = nums[i];
                count1++;
            }
             else if(count2==0){
                candidate2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

List<Integer> list = new ArrayList<>();
int count_1=0;
int count_2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count_1++;
            }
            else if(nums[i]==candidate2){
                count_2++;
            }
        }
        if(count_1>nums.length/3){
            list.add(candidate1);
        }
        if(count_2>nums.length/3){
            list.add(candidate2);
        }
      
        return list;
    }
}