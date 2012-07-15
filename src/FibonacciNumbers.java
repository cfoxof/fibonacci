/**
 *
 */

/**
 * @author takada
 *
 */
public class FibonacciNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("in Fib(%d)\n",FibonacciNumbers.fib(Integer.parseInt(args[0])));
	}


	public static int fib(int n) {
		if(n==0){
			return 0;
		}
		else if (n == 1 || n == 2){
	    	return 1;
	    }
	    else {
	        int ans = fib(n - 2) + fib(n - 1);
	        return ans;
	    }
	}


}
