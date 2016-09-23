package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public static boolean isEven(int iValue) {
		int evenRemainder;
		evenRemainder = iValue % 2;
		if (evenRemainder == 1) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isEven() {
		return isEven(getiValue());
	}

	public static boolean isOdd(int iValue) {
		int oddRemainder;
		oddRemainder = iValue % 2;
		if (oddRemainder == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isOdd() {
		return isOdd(getiValue());
	}

	public static boolean isPrime(int iValue){
		for(int divisor = 2; divisor<(iValue/2);divisor++) {
			if ((iValue % divisor) == 0) {
				return false;
						}
		}
		return true;
	}
		
	public boolean isPrime(){
		return isPrime(getiValue());
	}

	public boolean equals(int num){
		if (getiValue() == num) { 
			return true; }
		else {
			return false; }
		} 
	

	//Static Methods
	public static boolean isEven(MyInteger i) {
		return isEven(i.getiValue());
	}
	
	public static boolean isOdd(MyInteger i) {
		return isOdd(i.getiValue());
	}
	
	public static boolean isPrime(MyInteger i) {
		return isPrime(i.getiValue());
	}
	
	public boolean equals(MyInteger i) {
		return equals(i.getiValue());
	}
}

