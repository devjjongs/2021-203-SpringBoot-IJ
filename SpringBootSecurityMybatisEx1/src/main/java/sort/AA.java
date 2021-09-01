package sort;

import java.util.ArrayList;
import java.util.Collections;

public class AA implements Comparable<AA>{
	int id;
	String name;
	public AA(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(AA o) {
		// TODO Auto-generated method stub
		//return this.id - o.id;
		return o.id - this.id ;
		//return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return String.format("AA [id=%s, name=%s]", id, name);
	}
	public static void main(String[] args) {
		AA aa = new AA(1,"김말자");
		AA aa2 = new AA(4,"이말자");
		AA aa3 = new AA(2,"고말자");
		ArrayList<AA> list = new ArrayList<AA>();
		list.add(aa);
		list.add(aa2);
		list.add(aa3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}








