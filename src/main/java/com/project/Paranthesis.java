package com.project;

public class Paranthesis {
	public boolean balParanthesis(String s){
	    int count = 0;
		for(int i=0; i<s.length(); i++){
			if (s.charAt(i) == ')' && count == 0 ) {
				return false;
			}
			if( s.charAt(i)== '('){
				count++;
			} else if ( s.charAt(i)== ')'){
				count--;
			}
		}		 
		if (count ==0) {
			return true;
		} else {
			return false;
		}
	}

}
