package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindInterSection {

	public static void main(String[] args) {
		
		Integer[] l1 = {3,2,11,4,6,7};
		Integer[] l2 = 	{1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(l1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(l2));
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list1.get(i) == list2.get(j)) {
					System.out.println(list1.get(i));
				}
			}
		}
		

	}

}
