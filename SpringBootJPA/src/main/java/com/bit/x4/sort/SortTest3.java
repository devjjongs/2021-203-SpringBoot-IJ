package com.bit.x4.sort;

public class SortTest3 {
	static public void selectionSort(int[] x) {
		//  1  2  3
		//  0 < 1, 0  2
		//  2  1  3
		//  0  <  2
		//  3  1  2
		
		//  3  1  2
		//     1 < 2
		//     2  1
		//   3  2 1
		
		int temp;
		for( int row=0 ; row < x.length-1 ; row++ ) {
			for (int i = row+1; i < x.length ; i++) {
				// System.out.print(x[i]+" < "+x[i+1]+" , ");
				if (x[row] < x[i]) {
					temp = x[row];
					x[row] = x[i];
					x[i] = temp;
				}
			}
			for (int i = 0; i < x.length ; i++) {
				System.out.print(x[i]+",");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3, 4, 5, 6 };
		selectionSort(array1);
		for (int element : array1) {
			System.out.print(element);
		}
	}
}
