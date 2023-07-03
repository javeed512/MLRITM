package com.mlr;

public class Honda extends Car{
	
	
	public static void main(String[] args) {
		
		Car car = 	new Honda();
			
			car.setFuelType("CNG");
			car.setNoOfSeats("4");
			
			System.out.println(car.getFuelType()+"  "+car.getNoOfSeats());
			
			
		
	}
	

}
