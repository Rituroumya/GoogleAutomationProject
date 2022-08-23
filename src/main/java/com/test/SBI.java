package com.test;

public class SBI implements RBI{

	public static void main(String[] args) {
		
		SBI loan = new SBI();
		loan.businessLoan();
		loan.educationLoan();
		loan.personalLoan();
		loan.homeLoan();
		// TODO Auto-generated method stub

	}

	public void educationLoan() {
		System.out.println("the education loan is 5%");
		
	}

	public void homeLoan() {
		System.out.println("the home loan is 4.5%");

		// TODO Auto-generated method stub
		
	}

	public void personalLoan() {
		System.out.println("the personal loan is 10%");

		// TODO Auto-generated method stub
		
	}

	public void businessLoan() {
		System.out.println("the business loan is 9%");

		// TODO Auto-generated method stub
		
	}

}
