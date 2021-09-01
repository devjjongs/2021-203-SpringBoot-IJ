package test;

import java.util.ArrayList;
import java.util.Collections;
/**
 * AA 클래스의 error 유발본 AA와 비교해서 보세요
 * @author USER
 *
 */
public class AA2 /* implements Comparable<AA2> */{
	int id;
	String name;
	public AA2(int id, String name) {
		this.id=id;
		this.name=name;
	}
	/*
	 * @Override public int compareTo(AA2 o) { // TODO Auto-generated method stub
	 * //return this.id - o.id; return o.id - this.id ; //return
	 * this.name.compareTo(o.name); }
	 */
	
	@Override
	public String toString() {
		return String.format("AA [id=%s, name=%s]", id, name);
	}
	public static void main(String[] args) {
		AA2 aa = new AA2(1,"김말자");
		AA2 aa2 = new AA2(4,"이말자");
		AA2 aa3 = new AA2(2,"고말자");
		ArrayList<AA2> list = new ArrayList<AA2>();
		list.add(aa);
		list.add(aa2);
		list.add(aa3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}








