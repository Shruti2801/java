import java.util.*;
//overloading
//class add {
//     static void sum1(int a,int b) {
//        System.out.println(a+b);
//    }
//     static void sum1(double a,double b){
//        System.out.println(a+b);
//    }
//}
//
//public class main {
//    public static void main(String[] args) {
//        add.sum1(12, 2);
//        add.sum1(2.3, 3.3);
//
//    }}

// overriding
//     class parent{
//    void show(){
//        System.out.println("parent class");
//    }
//                }
//    class child extends parent{
//    void show(){
//        System.out.println("child class");
//    }
//    }
//    public class main {
//    public static void main(String[] args) {
//    child obj = new child();
//    obj.show();
//
//    }
//}

//Array
//public class main {
//    public static void main(String[] args) {
//        int[] a=new int[5];
//        for (int i=0; i <a.length;i++){
//            Scanner sc =new Scanner(System.in);
//
//            a[i]=sc.nextInt();
//    }
////        System.out.println(a);
//        for (int s:a) {
//            System.out.println(s);
//        }
//}}

public class main {
    public static void main(String[] args) {
//        int arr[]
//                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//
//        String stringArr = Arrays.toString(arr);
//
//
//        System.out.println("Array: " + stringArr);


//        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("Array: " + Arrays.toString(arr));
//        }

        String n =" Shruti";
        String s ="hello";
        System.out.println(s);
        System.out.println(s.charAt(1));
        System.out.println(s.concat( n));
        System.out.println(String.format("name is %s",n) );
        System.out.println(s.substring(1));
        System.out.println(s.contains("lo"));
        System.out.println(s.replace("h","H"));
        System.out.println(s);
    }}
