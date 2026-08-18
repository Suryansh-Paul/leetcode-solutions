class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(String op : operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(op.equals("+")){
                stack.push(stack.peek()+stack.get(stack.size()-2));
            }
            else{
                int num= Integer.parseInt(op);
                stack.push(num);
            }
        }
        for(int i=0;i<stack.size();i++){
            sum = sum + stack.get(i);
        }

        return sum;
    }
}