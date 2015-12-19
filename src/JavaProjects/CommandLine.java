package JavaProjects;

import java.util.Scanner;

public class CommandLine {
	public String getValue(){
		Scanner s = new Scanner(System.in);
		String a = s.next();
		s.close();
		return a;
	}

}
