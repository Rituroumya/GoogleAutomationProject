package com.test;

public class Park extends AnimalZoo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Park pr = new Park();
		pr.veggie();
		pr.flower();
		pr.friut();
		pr.lion();
		pr.monkey();
		pr.tiger();
		
		}
    public void flower()
       {
    	System.out.println("Hello We are the flower garden");
       }
    public void friut()
    {
 	System.out.println("Hello We are the fruit garden");
    }
    public void veggie()
    {
 	System.out.println("Hello We are the vegetable garden");
    }
}
