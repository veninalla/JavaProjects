package com.project;

public class Pattern {
	public static void main(String[] a) {
		printPattern(10);
	}

	public static void printPattern(int n) {

		for (int i = 1; i <= n; i++) {
			for(int j=1; j <= i; j++) {
			  System.out.print("*");
			}
			System.out.println();
		}
	}
}
