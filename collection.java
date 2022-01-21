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


        LinkedList<String> ll =new LinkedList<String>();
        LinkedList<String> ll1 =new LinkedList<String>();
        ll.add("mango");
        ll.add("apple");

        ll1.add("grapes");
        ll1.add("mango");
        ll1.add("apple");

        ll.addAll(ll1);
        System.out.println(ll);

        ll.addFirst("kiwi");
        System.out.println(ll);
        System.out.println(ll1);
        ll.removeLast();
        System.out.println("removig last"+ll);
        ll.removeFirstOccurrence("mango");
        System.out.println("removing first occurance of mango"+ll);
        ll.clear();


        HashSet<String> hs=new HashSet<String>();
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        hm.put(1,"Mango");
        hm.put(2,"Apple");
        hm.put(3,"Banana");
        hm.put(4,"Grapes");

        map.put(2,"kiwi");
        System.out.println(hm);
        System.out.println(map);
//        Iterator i =hm.entrySet().iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        hm.putIfAbsent(2,"kiwi");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.putAll(map);
        System.out.println(hm);


        hm.remove(3);
        System.out.println(hm);

        hm.remove(1,"Mango");
        System.out.println(hm);

        hm.replace(2,"Apple");
        System.out.println(hm);

        hm.replaceAll((k,v)->"Kiwi");
//        hm.replaceAll();
        System.out.println(hm);




    }
}
