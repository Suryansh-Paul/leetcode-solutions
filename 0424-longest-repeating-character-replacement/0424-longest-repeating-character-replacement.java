class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int answer=0;
        int maxfreq=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(right<s.length()){
               char c = s.charAt(right);

            map.put(c, map.getOrDefault(c, 0) + 1);

            maxfreq = Math.max(maxfreq, map.get(c));

             int windowlength= right-left+1;
             if(windowlength-maxfreq<=k){
              answer = Math.max(answer,right-left+1);
           }
              else{
              map.put(s.charAt(left),map.get(s.charAt(left))-1);
              left++;
              }
              right++;
        }
        return answer;
    }
}