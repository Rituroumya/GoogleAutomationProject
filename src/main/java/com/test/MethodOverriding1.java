package com.test;

public class MethodOverriding1 extends MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding1 mo = new MethodOverriding1();
		mo.animal();
		mo.flower();
		mo.veggies();
		mo.bird();
	}
	//public void animal()
	//{
	//	System.out.println("the animal is elephant");
	//}
	public void flower()
	{
		System.out.println("the flower is lily");
	}
	public void veggies()
	{
		System.out.println("the veggie is eggplant");
	}

}



