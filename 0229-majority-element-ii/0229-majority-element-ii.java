class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        int key = nums[i];
        map.put(key, map.getOrDefault(key, 0)+1);
       }
       for(Map.Entry<Integer, Integer> pair: map.entrySet()){
           if(pair.getValue()>nums.length/3){
            list.add(pair.getKey());
           }
       }
       return list;
       
    }
}