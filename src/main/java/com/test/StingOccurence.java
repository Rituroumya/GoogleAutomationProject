package com.test;

public class StingOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "ramarao";
//char ch[]=name.toCharArray();

for (int i = 0; i<name.length(); i++)
{
	int count = 0;
	for(int j=0;j<name.length();j++)
			{
	if (name.charAt(i)==name.charAt(j))		
	
			{
		count++;
			}
}
	System.out.println(name.charAt(i)+  " occured " + count);
}
	}
	
}
