package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest4_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] array1 = { 1,2,3,4,5,6};
		 * 
		 * // Arrays.sort(array1);
		 * 
		 * 
		 * for (int element : array1) { System.out.print(element+","); }
		 * 
		 * System.out.println("/////"); List<int[]> list = Arrays.asList(array1);
		 * Collections.reverse(list); //Arrays.sort(array1,Collections.reverseOrder());
		 * for (int element : array1) { System.out.print(element+","); }
		 * 
		 */	
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("13");
		arrayList.add("4");
		arrayList.add("1");
		arrayList.add("2");
		
		for( String s  : arrayList) {
			System.out.println(s);
		}
		System.out.println("/////");
		Collections.sort(arrayList);
		for( String s  : arrayList) {
			System.out.println(s);
		}
		
		System.out.println("/////");
		Collections.reverse(arrayList);
		for( String s  : arrayList) {
			System.out.println(s);
		}
		
	}
}
