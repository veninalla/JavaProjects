package com.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public int BuffReader() {
		int c = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			String s1 = br.readLine();
			int n = Integer.parseInt(s);
			int n1 = Integer.parseInt(s1);
			c = n - n1;
		} catch (IOException e) {

			e.printStackTrace();
		}
		return c;

	}

}
