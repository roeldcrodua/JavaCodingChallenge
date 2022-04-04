import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BouncyNumber {
    /*
    Bouncy number are positive integer which has its digit un-ordered.
    14751 is a bouncy whereas 95321 is not a bouncy number
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;
        for (int i =num ;i>99; i--){
            boolean isBouncy = false;
            for (int x=0; x< String.valueOf(num).length()-1; x++){
                int first = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(0)));
                int last = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(String.valueOf(i).length()-1)));
                if (first>last) {
                    int temp = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(x)));
                    if (temp > first) {
                        isBouncy=true;
                    }
                } else if (first<last){
                    int temp = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(x)));
                    if (temp <last) {
                        isBouncy=true;
                    }
                } else {
                    int temp = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(x)));
                    if (temp ==last) {
                        isBouncy=false;
                    }
                }
            }
            if (isBouncy){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("COUNT: " +counter);
    }
}
