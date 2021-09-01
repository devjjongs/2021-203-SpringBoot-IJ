package sort;

public class SortTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {2,3};
		/*if(!(array1[0] >= array1[1])) {
			
		}*/
		int temp;
		if(array1[0] < array1[1]) {
			temp = array1[0];//2
			array1[0]=array1[1];//3
			array1[1]=temp;//2
		}
		
		for(  int element : array1  ) {
			System.out.println(element);
		}
		
		
	
	}

}






