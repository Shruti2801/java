import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class sortmonth{
    public static void main(String[] args) {
        List<String> in = new ArrayList<String>();
        List<Date> out = new ArrayList<Date>();

        in.add("JAN-2014");
        in.add("JAN-2011");
        in.add("APR-2013");
        in.add("NOV-2011");

        try {

            for (String abc1 : in) {
                Date date = new SimpleDateFormat("MMM-yyyy", Locale.ENGLISH).parse(abc1);
                out.add(date);
            }

//             System.out.println(out);
//             out.sort(new Comparator<Date>() {
//                 public int compare(Date arg0, Date arg1) {
//                     return arg0.compareTo(arg1);
//                 }
//             });
            Collections.sort(out);


            for (Date date1 : out) {
                System.out.println( new SimpleDateFormat("MMM-yyyy", Locale.ENGLISH).format(date1));
            }

        } catch (ParseException e) {

            e.printStackTrace();

        }
    }
    }

