package com.GarbageCollection;

import java.util.Scanner;

public class StringProblem {
	
	public String findMatching(String str, String res) {
		if(str.length() != res.length())
			return "";
		else {
			int pos = getUnderscorePos(str);
			if(str.substring(0, pos).equalsIgnoreCase(res.substring(0, pos))) {
				if(str.substring(pos+1, str.length()).equalsIgnoreCase(res.substring(pos+1, res.length()))) {
					return str.substring(0,pos)+ res.charAt(pos) + str.substring(pos+1,str.length())+":";
				}
			}
			return "";			
		}
	}
	
	public int getUnderscorePos(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '_') {
				return i;
			}
		}
		return -1;
	}

	public String getString(String str, String matching[]) {
		String res = "";
		for(String s : matching) {
			res += findMatching(str, s);				
		}
		return res;
	}
	
	public static void main(String []args) {
		StringProblem obj = new StringProblem();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3[] = s2.split(":");
		System.out.println(obj.getString(s1, s3).toUpperCase());
		sc.close();
	}
	
	
}
