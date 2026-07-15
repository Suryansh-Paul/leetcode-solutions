class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null|| strs.length == 0){
            return "";
        }



        String firststr= strs[0];
        for(int i=0;i<firststr.length();i++){
            for(int j=1;j<strs.length;j++){
                String currentstr = strs[j];
                if(i==currentstr.length()){
                    return firststr.substring(0,i);
                }
                else if(firststr.charAt(i)!=currentstr.charAt(i)){
                    return firststr.substring(0,i);
                }
            }
        }
           
      return firststr;

   }
}