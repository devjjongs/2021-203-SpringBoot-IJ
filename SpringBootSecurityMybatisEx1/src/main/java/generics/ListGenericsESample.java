package generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListGenericsESample {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Person());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);

            if (obj instanceof Person) {
                System.out.println(((Person) obj).getId());
            }
        }
        List<Person> list2 = new ArrayList();
        List<Person> list3 = new ArrayList<Person>();
//        list2.add(3);
//        list3.add(new Date());
        list3.add(new Person());
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).getId());
        }

    }
}
