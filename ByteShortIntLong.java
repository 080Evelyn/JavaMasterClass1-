package day1;

public class ByteShortIntLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer.MIN_VALUE =" + myMinIntValue);
		System.out.println("Integer.MAX_VALUE =" + myMaxIntValue);
		System.out.println("Busted Min Value =" + (myMinIntValue -1));
		System.out.println("Busted Max Value =" + (myMaxIntValue +1));
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value =" + myMinByteValue);
		System.out.println("Byte Maximum Value =" + myMaxByteValue);
		
		short myMinshortValue = Short.MIN_VALUE;
		short myMaxshortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value =" + myMinshortValue);
		System.out.println("Short Maximum Value =" + myMaxshortValue);
		
		long myMinlongValue = Long.MIN_VALUE;
		long myMaxlongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value =" + myMinlongValue);
		System.out.println("Long Maximum Value =" + myMaxlongValue);
		
		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		System.out.println("Half of minimum int value = " +myTotal);
		System.out.println("Half of minimum byte value =" +myNewByteValue);
		System.out.println();
		
		
		int goat = 50;
		goat += 20;
		System.out.println("My answer = "+ goat);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
