package arraysandstrings;
/***
 * Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false

Example 4:

Input: s = "([)]"
Output: false

Example 5:

Input: s = "{[]}"
Output: true

 

Constraints:

    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

 */

import java.util.Stack;


public class ValidParenthesis {
	
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(c ==')' && stack.size()>0 && stack.peek()=='(' )
                stack.pop();
            else if(c =='}' && stack.size()>0 && stack.peek()=='{' )
                stack.pop();
            else if(c ==']' && stack.size()>0 && stack.peek()=='[' )
                stack.pop();          
            else
                stack.add(c);
            
            System.out.println("stack contains " + stack);
        }
        
        return stack.size()==0 ? true : false;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("(]"));

	}

}
/**
 * 
    Time complexity : O(n)O(n)O(n) because we simply traverse the given string one character at a time and push and pop operations on a stack take O(1)O(1)O(1) time.
    Space complexity : O(n)O(n)O(n) as we push all opening brackets onto the stack and in the worst case, we will end up pushing all the brackets onto the stack. e.g. ((((((((((.

 */
