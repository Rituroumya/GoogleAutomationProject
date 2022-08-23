package com.test;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Ritu";
		System.out.println(name1);
		String name2 = "Das";
		System.out.println(name1.concat(name2));
		String name3 = "hello";
		String name4 = "Good Morning";
		String name5 = "See You";
		String name6 = "JAVA";
		String name7 = "  welcome to USA  ";

		System.out.println(name3.length());
		System.out.println(name3.toUpperCase());
		System.out.println(name4.replace('o', 'u'));
		System.out.println(name5.endsWith("u"));
		System.out.println(name5.equals(name6));
		System.out.println(name6.charAt(2));
		System.out.println(name6.hashCode());
		System.out.println(name5.contains("ee"));
		System.out.println(name4.replaceAll("Morning", "Night"));
		System.out.println((name7).trim());
		System.out.println(name6.toLowerCase());
		System.out.println(name4.startsWith("a"));
		char ch[]=name1.toCharArray();
		for (int i=ch.length-1;i>=0;i--)
		{
		
			System.out.print(ch[i]);
		}
	}

}
