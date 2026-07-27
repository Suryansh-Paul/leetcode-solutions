class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longestseq =0;
        for(int num: set){
              
            if(set.contains(num-1)){
                continue;
            }
            else{
                int current = num;
                int count =1;
              
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longestseq = Math.max(longestseq, count);
            }
             
        }
      return longestseq;
    }
   
      
}