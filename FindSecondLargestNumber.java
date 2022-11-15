package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		List<Integer> num = new ArrayList<Integer>(Arrays.asList(data));	
		int result = num.get(num.size()-2);
		System.out.println("Second Largest Number is : "+result);

	}

}
