
import java.util.Scanner;

public class DisplayEachLetter {
    public static void main(String[] args) {
        String input = "easy peasy";

        for (Character let: input.toCharArray()){

            if (let%2 ==0){
                System.out.print("N");
            } else if (let%3==0 ){
                System.out.print("O");
            } else if (let%5==0 ){
                System.out.print("S");
            } else {
                System.out.print("E");
            }
        }

        System.out.println();
        System.out.println("SEES NSEES");
    }
}
