import java.util.*;
        import java.io.*;
        import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class DigitComma {

    public static void main(String args[]) {
        String input = "1000";
        Scanner in = new Scanner(input);
        int n = in.nextInt();
         char[] x = in.toString().toCharArray();

        System.out.println(n);

         for (int i=0;i<x.length;i++){
             System.out.print(i);
         }
    }
}
