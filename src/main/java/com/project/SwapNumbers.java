package com.project;

public class SwapNumbers {

	/*
	 * public static void main(String[] args) { method1(5,6); }
	 * 
	 * public static void method1(int x,int y ){
	 * 
	 * System.out.println("Before Swapping " + "x = " + x + "," + "y = " + y); x
	 * = x + y; y = x - y; x = x - y; System.out.println("After Swapping " +
	 * "x = " + x + "," + "y = " + y); }
	 */

	// member variable
	private int x;
	private int y;

	public SwapNumbers(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void swap() {
		x = x + y;
		y = x - y;
		x = x - y;
		return;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void swap2() {
		int c = x;
		x = y;
		y = c;

	}

}
