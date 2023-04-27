package day1;

public class doublefloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;
    System.out.println("Minimum Double Value = " + myMinDoubleValue );
    System.out.println("Maximum Double Value = " + myMaxDoubleValue);
    
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;
    System.out.println("Minimum Float Value = " + myMinFloatValue );
    System.out.println("Maximum Float Value = " + myMaxFloatValue );
    
    int myIntValue = 5/3;
    float myFloatValue = 5/3f;
    // float can also be written as the following (float) 5.25 which is called casting.
    
    double myDoubleValue = 5/3d;
    /*Also note that for a decimal, double is the default type; thus, the letter
    'd' does not necessarily need to be added to the literal but 'f' has to be added for float.*/
    
    System.out.println("my New Int Value = " + myIntValue );
    System.out.println("my New Float = " + myFloatValue);
    System.out.println("my New Double = " + myDoubleValue);
    
   /*Double is faster to process than float.class
    Java libraries math function are patterned to double rather than float*/
    
    
    
    
    
    

	}

}
