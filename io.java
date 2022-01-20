import java.lang.String;
//import java.util.*;
//import java.io.*;
//import java.time.LocalDate;
//public class io {
//    public static void main(String[] args) {
//        try {
//            FileOutputStream fout = new FileOutputStream("D:\\shruti.txt");
//            String s = "hello my name is shruti.";
////            byte b[]=s.getBytes();
////            int s=65;
//            fout.write(s.getBytes());
//            fout.close();
//            System.out.println("success");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        try {
//            FileInputStream fin = new FileInputStream("D:\\shruti.txt");
//            int i = 0;
//            while ((i = fin.read()) != -1)
//                System.out.print((char) i);
//            fin.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        LocalDate date = LocalDate.now();
//        LocalDate yesterday = date.minusDays(1);
//        LocalDate tomorrow = date.plusDays(1);
//        System.out.println("  "+date + "  "+yesterday+"  "+tomorrow);
//        System.out.println(yesterday);
//        System.out.println(tomorrow);
//
//
//            }
//        }

//conversion
public class io {
    public static void main(String[] args) {
        String s="100";
//        Integer i = Integer.valueOf(s);
        int i=Integer.parseInt(s);
        System.out.println(i+100);

        int a= 30;
        String b =Integer.toString(a);
//        System.out.println(b.getClass());

        int decimal=Integer.parseInt("1101",2);
        System.out.println("binary to decimal"+decimal);
        System.out.println(Integer.toBinaryString(15));

        int d=Integer.parseInt("ff",16);
        System.out.println("hex to decimal "+ d);
        System.out.println(Integer.toHexString(256));

        int dec=Integer.parseInt("23",8);
        System.out.println("octal to dec "+ dec);
        System.out.println(Integer.toOctalString(25));
    }
}
