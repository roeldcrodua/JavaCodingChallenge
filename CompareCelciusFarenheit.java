
import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class CompareCelciusFarenheit {

        public static void main(String args[]) {
            String input = "3\n" +
                    "5 -16\n" +
                    "5 -15\n" +
                    "5 -12";
            //Scanner in = new Scanner(System.in);
            Scanner in = new Scanner(input);
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int b = in.nextInt(); //celcius
                int t = (int) (in.nextInt() * (1.8) + 32); //farenheit

                if (b > t ){
                    System.out.println("Higher " + b + ">" + t);
                } else if (b < t){
                    System.out.println("Lower " + b + "<" + t);
                } else {
                    System.out.println("Same " + b + "=" + t);
                }

            }
        }
    }