package com.test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Hello, I am Ritu";
	 String[] str = name.split(" ");
	 String totalWord = "";
	 for (int j=0;j<str.length;j++)
	 {
		 String word = str[j];
		 String rev="";
		 for (int i=word.length()-1;i>=0;i--)
	    {
		 rev=rev+word.charAt(i);
		
		}
	 totalWord=totalWord+rev+" ";
	 }
	 System.out.println("final output is: "+totalWord);

	}

	
}

