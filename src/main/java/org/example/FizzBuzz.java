package org.example;

public class FizzBuzz implements IFizzBuzz{
	private int Number;
	
	public FizzBuzz() {}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	@Override
	public void ShowResult() {
		for(int i = 1; i <= 100; i++) {
			this.Number = i;
			if(Number % 3 == 0 && Number % 5 != 0) {
				System.out.println("Fizz");
			}else if(Number % 5 == 0 && Number % 3 != 0) {
				System.out.println("Buzz");
			}else if(Number % 3 == 0 && Number % 5 == 0) {
				System.out.println("FizzBuzz");
			}else {
				System.out.println(Number);
			}
		}
	}
}
