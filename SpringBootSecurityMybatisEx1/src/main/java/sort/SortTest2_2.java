package sort;

public class SortTest2_2 {
	static public void bubbleSort(int[] a) {
		 int i, j, temp, size;
	        size = a. length;
	        int yyy=0;
	        for (i = size - 1; i > 0; i--) {
	        	// i = 5 
	        	//i = 4
	            for (j = 0; j < i; j++) {
	            	yyy++;
	            //  j=0   0 < 4 
	                if (a[j] < a[j + 1]) {
	                // a[0] > a[1]	
	                    temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j + 1] = temp;
	                    System.out.println("바뀜");
	                }//if
	             
	            }//for j
	            System. out.printf( "\n\t");
                for ( int k = 0; k < size; k++) {
                    System. out.printf( "%3d ", a[k]);
                }
	        }
	        System.out.println(yyy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3, 4, 5, 6 ,7,8,9,10,12,15,17};
		bubbleSort(array1);
		for (int element : array1) {
			System.out.print(element);
		}
	}
}
