class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";       
             }

             Map<Character,Integer> window = new HashMap<>();
             Map<Character,Integer> need = new HashMap<>();

             for(int i=0;i<t.length();i++){
                char ch = t.charAt(i);
                need.put(ch,need.getOrDefault(ch,0)+1);
             }

             int left=0;
             int right=0;
             int required = need.size();
             int formed =0;
             int minlength = Integer.MAX_VALUE;
             int start=0;

             while(right<s.length()){
                 
                 char c = s.charAt(right);
                 window.put(c,window.getOrDefault(c,0)+1);

                 if(need.containsKey(c)&&window.get(c).equals(need.get(c))){
                    formed++;
                 }
                 while(formed==required){
                    if(right-left+1<minlength){
                        minlength =right-left+1;
                        start=left;
                    }
                 

                 char leftchar = s.charAt(left);

                 
                 window.put(leftchar,window.get(leftchar)-1);


                 if(need.containsKey(leftchar)&& window.get(leftchar)<need.get(leftchar)){
                    formed--;
                 }

                 
                 left++;
                 }
                 right++;

             }

             if(minlength==Integer.MAX_VALUE){
                return "";
             }
             return s.substring(start,start+minlength);
             
    }
}