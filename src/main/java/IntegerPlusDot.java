import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class IntegerPlusDot {

        public static void main(String args[]) {
            String input = "7\n" +
                    "0 5 12 10 4 20 50";
            Scanner in = new Scanner(input);
            int lenT = in.nextInt();
            for (int i = 0; i < lenT; i++) {
                int x = in.nextInt();
                System.out.print(x);
                if (i != lenT-1) {
                    for (int y = 0; y < x; y++) {
                        System.out.print(".");
                    }
                }
            }
        }
    }
