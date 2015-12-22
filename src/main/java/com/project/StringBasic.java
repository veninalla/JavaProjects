package com.project;

public class StringBasic {
	public String reverseStr(String s) {
        StringBuilder str = new StringBuilder();
		for (int i=s.length()-1; i>=0; i--) {
		     str.append(s.charAt(i));
		}
		return str.toString();
	}

	public String convertsString(String s){
		String a[] = s.split(" ");
		for(int i=0; i<a.length; i++){
			a[i]=a[i]+(i+1);
		}
		return String.join(" ", a);
		
	}
	public String reverseSentence(String s){
		String a[] = s.split(" ");
		for(int i=0; i<a.length; i++){
			a[i]=reverseStr(a[i]);
		}
		return String.join(" ", a);
		
	}
	public boolean palindrome(String s){
		String r = reverseStr(s);
		if(s.equalsIgnoreCase(r)){
		    return true;
		}else{
			return false;
		}
		
		
	}
	
	
}