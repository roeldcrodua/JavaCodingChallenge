
import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class ReverseLoopingNumbers {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (n > 0){
                while (n-1 >= 0){
                    System.out.print((n-1) != 0 ? (n-1) + " " : (n-1));
                    n--;
                }
            } else if (n < 0){
                while (n < 0){
                    System.out.print((n) != 0 ? (n+1) + " " : (n));
                    n++;
                }
            } else if (n == 0) {
                System.out.println("Already 0");
            }
        }

    }