class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int right=0;
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
               char c = s1.charAt(i);
               map1.put(c, map1.getOrDefault(c, 0) + 1);
            }

        while(right<s2.length()){

           map2.put(s2.charAt(right),map2.getOrDefault(s2.charAt(right),0)+1);

           if(right-left+1 == s1.length()){

               if(map2.equals(map1)){
                return true;
               }

               map2.put(s2.charAt(left),map2.get(s2.charAt(left))-1);
               if (map2.get(s2.charAt(left)) == 0) {
               map2.remove(s2.charAt(left));
                }
               left++;

           }
           right++;
        }
        return false;
    }
}