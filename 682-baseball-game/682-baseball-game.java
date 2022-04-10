class Solution {
    public int calPoints(String[] ops) {
      Stack<Integer> stack = new Stack();
        
        for(String op:ops){
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        
        
        int totalScore = stack.stream().reduce(0, (subtotal, element) -> subtotal + element);
        return totalScore;
    }
}