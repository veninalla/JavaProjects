package com.project;


public class FibonacciSeries {

	// 0 1 1 2 3 5 8 13 21
	public int[] generateFS(int n) {
		int[] nums = new int[n];
		nums[0] = 0;
		nums[1] = 1;
		for (int i = 2; i < n; i++) {

			nums[i] = nums[i - 1] + nums[i - 2];

		}
		return nums;
	}
}
