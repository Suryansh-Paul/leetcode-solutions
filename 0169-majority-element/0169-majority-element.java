class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
            int frequency= map.get(key);
            if(frequency > nums.length/2){
                return key;
            }
        }
        
       return -1; 
    }
}