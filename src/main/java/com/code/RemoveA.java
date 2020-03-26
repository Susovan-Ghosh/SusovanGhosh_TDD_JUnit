package com.code;

public class RemoveA {
	
	String remove(String s) {
		int length=s.length();
		String result="";
		if(length==1 && s.charAt(0)!='A')
			result=s;
		else if(length>=2 && !s.equals("AA")) {
			char firstChar=s.charAt(0);
			char secondChar=s.charAt(1);
			if(firstChar!='A')
				result+=firstChar;
			if(secondChar!='A')
				result+=secondChar;
			result+=s.substring(2);
		}
		return result;
	}
	
}
