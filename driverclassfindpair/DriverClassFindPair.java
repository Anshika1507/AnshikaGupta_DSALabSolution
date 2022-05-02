package com.greatlearning.driverclassfindpair;

import java.util.Scanner;

import com.greatlearning.findpair.FindPair;

public class DriverClassFindPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum ");
		int sum = sc.nextInt();
		
		FindPair.Node root = null;
		
		FindPair fp = new FindPair();
		
		root = fp.insert(root, 40);
	    root = fp.insert(root, 20);
	    root = fp.insert(root, 60);
	    root = fp.insert(root, 10);
	    root = fp.insert(root, 30);
	    root = fp.insert(root, 50);
	    root = fp.insert(root, 70);
	 
	    fp.findPair(root, sum);
	    
	    sc.close();

	}

}
