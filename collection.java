import java.util.*;
public class collection {
    public static void main(String[] args) {
        ArrayList al=new ArrayList(2);

        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        System.out.println(al);

        Iterator ir=al.iterator();
        while(ir.hasNext()) {
            System.out.println(ir.next());
        }

        for (Object e:al) {
            System.out.println(e);
        }
        List<String> list1=new ArrayList<String>();
        List<Integer> list2=new ArrayList<Integer>();
        list1.add("raj");
        list1.add("anuj");
        list1.add("shruti");
        list1.add("neha");

        list2.add(57);
        list2.add(56);
        list2.add(2);
        list2.add(23);

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);


    }
}
