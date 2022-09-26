/**
 * Tests the recursive methods
 * @author Paul Dacey
 *
 * @param <T>
 */

public class ArraySumDriver <T> {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = (int) sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		long fibTest = fibonacci(50);
		System.out.println(fibTest);
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * 
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static <T> Integer sumOfArray(Integer[] arr, int num) {
		
		if(num == 0)
		{
			return arr[num];
		}
		else
		{
			
			return arr[num] + sumOfArray(arr, num - 1);
		}
	}
	
	
	static long test[] = new long[1000];
	/**
	 * fibonacci method using dynamic programming technique to calculate a number using Fibonacci
	 * @param num Number to compute
	 * @return Fibonacci number
	 */
	public static long fibonacci(int num)
	{
		if (num == 0)
		{
			return 0;
		}
		if (num == 1)
		{
			return 1;
		}
		
		if (test[num] != 0)
		{
			return test[num];
		}
		
		test[num] = fibonacci(num-1) + fibonacci(num-2);

		return test[num];
	}
		

	}

