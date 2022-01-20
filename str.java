import java.util.*;

public class str {

        public static int dev(int a,int b)throws ArithmeticException{
            return a/b;
        }

    public static void main(String[] args) {
//        String n =" Shruti";
//        String s ="hello";
//        System.out.println(s);
//        System.out.println(s.charAt(1));
//        System.out.println(s.concat( n));
//        System.out.println(String.format("name is %s",n) );
//        System.out.println(s.substring(1));
//        System.out.println(s.contains("lo"));
//        System.out.println(s.replace("h","H"));
//        System.out.println(s);

        StringBuffer sb =new StringBuffer("hello");
        sb.insert(3,"dec");
        System.out.println(sb);


//        try
//        {
//
//            try {
//
//                int a[]= {1,2,3,4};
//                System.out.println(a[3]);
////                throw new ArithmeticException("throw..");
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            int data=50/0;
//        }
//
//        catch(ArithmeticException e)
//        {
//            System.out.println(e);
//        }
//
//
//        finally {
//            System.out.println("finally block");
//        }
//        System.out.println("code...");

        str t=new str();
        try {
            System.out.println(t.dev(7, 1));
        }
         catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }
        System.out.println("code..");


    }

}
