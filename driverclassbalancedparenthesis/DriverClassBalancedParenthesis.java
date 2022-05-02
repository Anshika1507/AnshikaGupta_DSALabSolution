package com.greatlearning.driverclassbalancedparenthesis;

import java.util.Scanner;

import com.greatlearning.balancedparenthesis.BalancedParenthesis;

public class DriverClassBalancedParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BalancedParenthesis bp = new BalancedParenthesis();
		
		System.out.println("Enter the string of parenthesis: ");
		String expr = sc.nextLine();
		
		if(bp.ParenthesisBalanced(expr))
			System.out.println("The entered String has Balanced Brackets ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
			
		sc.close();

	}

}
