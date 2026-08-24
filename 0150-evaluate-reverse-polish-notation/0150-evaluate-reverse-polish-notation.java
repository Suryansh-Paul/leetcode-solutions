class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       for(String token : tokens){
        if(token.equals("+")){
            int a = stack.pop();
            int b = stack.pop();
            int res = a+b;
            stack.push(res);
        }
         else if(token.equals("-")){
            int a = stack.pop();
            int b = stack.pop();
            int res = b-a;
            stack.push(res);
        }
        else if(token.equals("*")){
            int a = stack.pop();
            int b = stack.pop();
            int res = a*b;
            stack.push(res);
        }
        else if(token.equals("/")){
            int a = stack.pop();
            int b = stack.pop();
            int res = b/a;
            stack.push(res);
        }
        else{
            int num = Integer.parseInt(token);
            stack.push(num);
         }
       }
      return stack.peek();
    }
}