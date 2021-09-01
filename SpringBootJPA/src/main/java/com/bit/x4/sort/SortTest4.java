package com.bit.x4.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] array1 = { 991, 4, 5, 6 ,3,9};
//
//		Arrays.sort(array1);//오름차순
//
//		for (int element : array1) {
//			System.out.print(element + ",");
//		}
//
//		System.out.println("/////");
//		List<int[]> list = Arrays.asList(array1);
//		
////		System.out.println(list);
////			System.out.println(list.get(0));
////			System.out.println(list.get(0)[0]);
//		
//		for(int i=0; i < list.size() ; i++) {
//			System.out.println(list.get(i)[0]);
//		}
//		
//		
//		for(int i=0; i < list.get(0).length ; i++) {
//			System.out.println(list.get(0)[i]);
//		}	
//		
//		//Arrays.sort(array1,Collections.reverseOrder());
//		Collections.reverse(list);
//		for(int i=0; i < list.get(0).length ; i++) {
//			System.out.println(list.get(0)[i]);
//		}
		
//		Collections.sort(list);
//		Collections.reverse(list); // Arrays.sort(array1,Collections.reverseOrder());
//		for (int element : array1) {
//			System.out.print(element + ",");
//		}

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("23");
		arrayList.add("21");
		arrayList.add("4");
		arrayList.add("1");
		arrayList.add("2");
//		
//		for( String s  : arrayList) {
//			System.out.println(s);
//		}
		System.out.println("/////");
		Collections.sort(arrayList);
		for( String s  : arrayList) {
			System.out.println(s);
		}
//		
		System.out.println("/////");
		Collections.reverse(arrayList);
		for( String s  : arrayList) {
			System.out.println(s);
		}

	}
}
