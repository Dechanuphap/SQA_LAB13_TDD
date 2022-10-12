package org.example;

public class FizzBuzz implements IFizzBuzz{
	
	public FizzBuzz() {}
	
	@Override
	public void ShowResult(int Number) {
		if(Number >= 1 && Number <= 100) {
			if(Number % 3 == 0 && Number % 5 != 0) {
				System.out.print("Fizz");
			}else if(Number % 5 == 0 && Number % 3 != 0) {
				System.out.print("Buzz");
			}else if(Number % 3 == 0 && Number % 5 == 0) {
				System.out.print("FizzBuzz");
			}else {
				System.out.print(Number);
			}
		}else {
			System.out.print("Please enter the integer number range 1-100!");
		}
	}
}
