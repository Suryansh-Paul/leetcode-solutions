class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix =0;
        int count=0;
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            prefix+= nums[i];
            int needed = prefix - k;
            if(map.containsKey(needed)){
              count += map.get(needed);
            }
             map.put(prefix , map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}