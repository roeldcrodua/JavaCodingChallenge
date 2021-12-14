//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.Clock;
//import java.util.Date;
//
//public class TimeConversion {
//    public static void main(String[] args) {
//        String input = "07:05:45PM";
//        timeConversion(input);
//    }
//
//    public static String timeConversion(String s)  {
//        // Write your code here
//        String myTime = s.substring(0,8);
////        if (Integer.parseInt(myTime.substring(0,2))<12){
////            myTime.replace(String.valueOf(myTime.substring(0,2)),(Integer.parseInt(myTime.substring(0,2))+12));
////        }
//        System.out.println(t);
//        String myTime = "10:30:54";
//        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//
//        Date date = null;
//        try {
//            date = sdf.parse(myTime);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        String output = sdf.format(date);
//        System.out.println(output);
//
//        return output.toString();
//    }
//}
