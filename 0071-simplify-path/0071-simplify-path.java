class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] chunks = path.split("/");
        for(String chunk : chunks){
            if( chunk.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(chunk.equals(".")){
                continue;
            }
            else if(chunk.equals("")){
                continue;
            }
            else{
                stack.push(chunk);
            }
        }   

        StringBuilder sb = new StringBuilder();
        for(String dir : stack){
            sb.append("/").append(dir);
        }
        return sb.length()==0 ? "/" : sb.toString();
       
    }
}