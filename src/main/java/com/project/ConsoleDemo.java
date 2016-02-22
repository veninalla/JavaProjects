package com.project;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleDemo {
	    int a;
	    int b;
	    int c;

	public int consoleDiv(){
		
	   InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value a: ");
		a = scan.nextInt();
		
		System.out.println("Enter the value b: ");
		b = scan.nextInt();
		return c = a / b; 

		
		
		
		
		
}

}