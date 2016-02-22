package com.project;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
	
	public int dataInStream(){
		int c =0;
		DataInputStream ds = new DataInputStream(System.in);
		try {
			System.out.println("first number: ");
			
			String n = ds.readLine();
			int a = Integer.parseInt(n);
			
			System.out.println("second number: ");
			
			String n1 = ds.readLine();
			int b = Integer.parseInt(n1);
			

			c = a * b;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return c;
	}

}
