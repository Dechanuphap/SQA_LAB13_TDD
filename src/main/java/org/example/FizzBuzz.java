package org.example;

public class FizzBuzz implements IFizzBuzz{
	
	public FizzBuzz() {}
	
	@Override
	public void ShowResult(int Number) {
		if(Number >= 1 && Number <= 100) {
			if(Number % 3 == 0 && Number % 5 != 0) {
				System.out.println("Fizz");
			}else if(Number % 5 == 0 && Number % 3 != 0) {
				System.out.println("Buzz");
			}else if(Number % 3 == 0 && Number % 5 == 0) {
				System.out.println("FizzBuzz");
			}else {
				System.out.println(Number);
			}
		}else {
			System.out.println("Please enter the integer number range 1-100!");
		}
	}
}
