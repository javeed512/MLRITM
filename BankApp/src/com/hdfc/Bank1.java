package com.hdfc;

public abstract class Bank1 implements IBank{

	@Override
	public void deposit() {
		System.out.println("Deposit done");
		
	}

	public abstract void withdraw();

	
	
	
}
