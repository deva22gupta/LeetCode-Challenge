class Solution {
    static Character START_CHARACTER  = '(';
    static Character END_CHARACTER = ')';
    
    
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<s.length();i++) {
            if(stack.isEmpty()) {
                stack.push(i);
            }
            else if(s.charAt(i)==Solution.END_CHARACTER && s.charAt(stack.peek())==Solution.START_CHARACTER) {
                stack.pop();
            }else {
                stack.push(i);
            } 
        }
        int end=s.length();
        int start=0;
        int longestValidParentheses = 0;
        if(stack.isEmpty())
            return s.length();
        else {
            while(!stack.isEmpty()) {
            start = stack.pop();
            longestValidParentheses = Math.max(end-start-1,longestValidParentheses);
            end=start;
            }
        }
        longestValidParentheses = Math.max(end-0,longestValidParentheses);
        return longestValidParentheses;
    }
    
 
}