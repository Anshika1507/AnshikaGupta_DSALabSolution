package com.greatlearning.balancedparenthesis;

import java.util.Stack;

public class BalancedParenthesis {
	public boolean ParenthesisBalanced(String expr)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<expr.length(); i++)
		{
			char x = expr.charAt(i);
			
			if(x =='(' || x =='{' || x =='[')
			{
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char chk;
			switch(x) {
			case')':
				chk = stack.pop();
				if(chk != '(')
					return false;
				break;
				
			case'}':
				chk = stack.pop();
				if(chk != '{')
					return false;
				break;
				
			case']':
				chk = stack.pop();
				if(chk != '[')
					return false;
				break;
			}
		}
		return(stack.isEmpty());
	}

}
