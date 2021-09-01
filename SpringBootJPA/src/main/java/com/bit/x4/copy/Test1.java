package copy;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] df = abc;
//		System.out.println("abc변수가 가지고 있는 주소:"+ abc);
//		System.out.println("df변수가 가지고 있는 주소:"+ df);
//		System.out.println("abc:"+ abc[0]);
//		System.out.println("df:"+ df[0]);
//		df[0]='Y';
//		System.out.println("abc:"+ abc[0]);
//		System.out.println("df:"+ df[0]);
//		
		
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		  System.out.println(new String(abc));
		  System.out.println(new String(number));
		 //char[] arr=   abc+number;
		  
		  char[] newArray = new char[abc.length+number.length];
		  System.out.println(new String(newArray));
		  System.out.println("===="+newArray[0]+"==="+newArray.length);
		  
//		  
//		  newArray = abc;
//		  System.out.println("===="+newArray[0]+"==="+newArray.length);
		  //newArray = number;//=======> java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 14 out of bounds for char[10] 의 원인이다
		  // number의 길이는 10인데 newArray도 number가 참조하는 곳을 참조하므로 길이가 10밖에 되지 않는다
		  // 그런데 #1에서 4칸 차지하고 #2에서 10칸을 더 확보 하라고 하므로 배열의 크기가 맞지 않아 예외가 발생하게 된것임
		  System.out.println("===="+newArray[0]+"==="+newArray.length);
//		  
		  
		  
		  System.arraycopy(abc, 0, newArray, 0, abc.length);//#1
		  System.out.println(new String(newArray));
		  
		  System.arraycopy(number, 0, newArray, abc.length, number.length);//#2
		  System.out.println(new String(newArray));
		  
		  //System.arraycopy(number, 0, newArray, abc.length, number.length);
//		  System.out.println(new String(newArray));
//		 
//		  System.arraycopy(abc, 0, number, 0, abc.length);
//		  System.out.println(new String(number));
//		 
//		  System.arraycopy(abc, 0, number, 6, 3);
//		  System.out.println(new String(number));
		
		
		char []cloneRef = newArray.clone();
		System.out.println(new String(cloneRef));
		cloneRef[2]='%';
		System.out.println(new String(cloneRef));
		 System.out.println(new String(newArray));
	}

}
