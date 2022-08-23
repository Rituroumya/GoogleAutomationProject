package com.test;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(10)
		{
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
	
		break;
		case 3:
			System.out.println("Wednesday");
		break;
		case 4:
			System.out.println("Thrusday");
		break;
		case 5:
			System.out.println("Friday");
		break;
		case 6:
			System.out.println("Satuday");
		break;
		case 7:
			System.out.println("Sunday");
		
		break;
		default :
			System.out.println("Please check number");
		}
		for(int i=1; i<=8;i++)
		{
			if (i==5)
					{
					continue;
					}
			{
				System.out.println(i);
			}
		}

	}

}
