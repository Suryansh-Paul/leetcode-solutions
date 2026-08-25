class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
              boolean currentalive = true;
            if(stack.isEmpty()){
                stack.push(asteroid);
            }
            else{
                while(!stack.isEmpty() && asteroid<0 && stack.peek()>0){
                    if(Math.abs(stack.peek())>Math.abs(asteroid)){
                        currentalive = false;
                        break;
                    }
                    else if(Math.abs(asteroid)>Math.abs(stack.peek())){
                        stack.pop();
                        
                    }
                    else{
                        stack.pop();
                        currentalive = false;
                        break;
                    }
                   
                }
                if(currentalive == true){
                 stack.push(asteroid);
                }
            }
        }
        int[] res= new int[stack.size()];
        for(int i = res.length -1;i>=0;i--){
            res[i] = stack.pop();
        }
        return res;
    }
}