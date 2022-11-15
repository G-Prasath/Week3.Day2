package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,7,6,8};
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(lst);
		
		for (int i = 0; i < lst.size(); i++) {
			int temp = i+1;
			if(lst.get(i) != temp) {
				System.out.println("Missing Element is : "+temp);
				break;
			}
		}
	}

}
