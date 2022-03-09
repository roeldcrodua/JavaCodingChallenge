
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class BoxFigure {

    public static void main(String args[]) {
        String input = "5\n" +
                "5\n" +
                "#\n" +
                "|\n" +
                "-\n" +
                "*";
        Scanner in = new Scanner(input);
        int width = in.nextInt();
        int height = in.nextInt();
        String corner = in.next();
        String verticalSides = in.next();
        String horizontalSides = in.next();
        String composition = in.next();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        for (int h=0;h<height; h++){
            for (int w=0; w<width; w++){
                if (w==0 || w==width-1){
                    if (h>0 && h!=height-1){
                        System.out.print(verticalSides);
                    } else {
                        System.out.print(corner);
                    }
                } else {
                    if (h==0 || h==height-1){
                        System.out.print(horizontalSides);
                    } else {
                        System.out.print(composition);
                    }
                }
            }
            System.out.println();
        }

    }
}