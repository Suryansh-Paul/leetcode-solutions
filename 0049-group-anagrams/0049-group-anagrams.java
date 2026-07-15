class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     

     Map<String, List<String>> map = new HashMap<>();
     for(int i=0;i<strs.length;i++){
        String current = strs[i];
        char[] ch =current.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
       
        if(map.containsKey(key)){
            map.get(key).add(current);
        }
        else{
            List<String> list = new ArrayList<>();
            list.add(current);
            map.put(key,list);
        }


     }

     return new ArrayList<>(map.values());








        
    }
}