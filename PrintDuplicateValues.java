package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));
		
		for (int i = 0; i < lst.size(); i++) {
			for (int j = i+1; j < lst.size(); j++) {
				if(lst.get(i) == lst.get(j)) {
					System.out.println("Duplicate Number is : "+lst.get(j));
				}
			}
		}
	}

}
