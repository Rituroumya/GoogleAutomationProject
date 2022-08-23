package com.test;

public class PolymerphismPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymerphismPractice1 pp1 = new PolymerphismPractice1();
		pp1.vehicle();
		pp1.vehicle(7);
		pp1.vehicle("bus", 20);
		pp1.vehicle("car", 5);
		

	}
    public void vehicle()
    {
    	System.out.println("people can travel in the vehicle");
    }
    public void vehicle(int people)
    {
    	System.out.println("total no of people can travel is " + people );
    }
    public void vehicle(String vehiclename, int people)
    {
    	System.out.println("vehicle name is " +vehiclename+ " total no of people can travel is " + people);
    }
}


