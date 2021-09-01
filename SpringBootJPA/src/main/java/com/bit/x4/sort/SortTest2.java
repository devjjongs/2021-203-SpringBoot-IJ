package test;

public class SortTest2 {
	static public void bubbleSort(int[] x) {
		// 0: 1 , 1:2, 2:3
		// 0: 1, 1:2
		// 1 2 3 4
		// 1 < 2
		// 2 1 3 4
		// 1 < 3
		// 3 1 4
		// 1 < 4
		// 4 1
		int temp;
		int yyy=0;
		for( int count=0 ; count < x.length-1 ; count++ ) {
			for (int i = 0; i < x.length - 1; i++) {
				yyy++;
				// System.out.print(x[i]+" < "+x[i+1]+" , ");
				if (x[i] < x[i + 1]) {
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					System.out.println("ㅏㅂ귐");
				}
			}
			for (int i = 0; i < x.length ; i++) {
				System.out.print(x[i]+",");
			}
			System.out.println();
		}
		System.out.println(yyy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3, 4, 5, 6 ,7,8,9,10,12,15,17 };
		bubbleSort(array1);
		for (int element : array1) {
			System.out.print(element);
		}
	}
}
