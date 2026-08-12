class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        int left=0;
        int right=0;
        Set<Character> set = new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxlength=Math.max(maxlength,right-left);
            }
                
                
            else{
                while(set.contains(s.charAt(right))){
                
                 set.remove(s.charAt(left));
                    left++;
                    
                }
            }
        }
        return maxlength;
    }
}