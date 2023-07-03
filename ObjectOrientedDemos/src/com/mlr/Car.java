package com.mlr;

public class Car extends Object{
	
	private String fuelType;
	private String  noOfSeats;
	
	public Car() {
		
		
	}
	
	public Car(String fuelType, String noOfSeats) {
		super();
		this.fuelType = fuelType;
		this.noOfSeats = noOfSeats;
	}

		

	
	

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Car [fuelType=" + fuelType + ", noOfSeats=" + noOfSeats + "]";
	}

	public static void main(String[] args) {
		
	Car  car1 =	new  Car("petrol","7");
		
		System.out.println(car1);
		
		Car car2 = new Car();
		
			car2.setNoOfSeats("5");
			
			System.out.println(car1.getFuelType() +" "+car1.getNoOfSeats());
		
		
	}

}
