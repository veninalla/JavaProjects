package com.project;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	
	
	
	public void writeFile(String fileName) throws FileNotFoundException{
		FileOutputStream out = new FileOutputStream(fileName);
		BufferedOutputStream bw = new BufferedOutputStream(out);
		try {
			out.write("this is the test58".getBytes());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			bw.close();
			out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
		

}
