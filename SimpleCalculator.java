package day1;

public class SimpleCalculator {
	private double firstNumber;
	private double secondNumber;

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getFirstNumber() {
		return this.firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getSecondNumber() {
		return this.secondNumber;
	}

	public double getAdditonResult() {
		return firstNumber + secondNumber;
	}

	public double getSubtractionionResult() {
		return firstNumber - secondNumber;
	}

	public double getMultiplicationResult() {
		return firstNumber * secondNumber;
	} 

	public double getDivisionResult() {
		if (secondNumber == 0) {
			return 0;
		}
		return firstNumber / secondNumber;

	}

}
