/**
 * 
 * Two variants of task:
 * 1. With while-loop
 * 2. Recursion
 * 
 * */

package factorial;

public class Factorial {

	public static void main(String[] args) {
		if (args.length>0) {
			int factorial = Integer.parseInt(args[0]);
			
			// Variant 1
			int result = 1;
			while (result<factorial) {
				factorial/=result++;
			}
			System.out.println(result);
			
			// Variant 2
			factorial = Integer.parseInt(args[0]);
			System.out.println(calculateFactorial(factorial));
			
			
		}

	}
	
	public static int calculateFactorial(int... a) {
		int currentNumber=a[0];
		int result = a.length>1 ? a[1] : 1;
		if (result<currentNumber) {
			return calculateFactorial(currentNumber/result, ++result);	
		}
		return result;
		
	}

}
