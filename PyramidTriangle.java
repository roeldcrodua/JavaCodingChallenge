
import java.util.*;
import java.io.*;
import java.math.*;

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/
    public class PyramidTriangle {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");
            for (int x = 1; x <= n; x++)
            {
                System.out.println(n);
                for (int y = 1; y < x; y++)
                {
                    System.out.print(n);
                }

            }

        }
    }