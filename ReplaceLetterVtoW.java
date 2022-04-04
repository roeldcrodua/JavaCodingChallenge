import java.util.Scanner;

public class ReplaceLetterVtoW {

    public static void main(String[] args) throws IndexOutOfBoundsException{
        String input = "bovvvvlet";
        Scanner in = new Scanner(input);
        String MESSAGE = in.nextLine();

        char [] let = MESSAGE.toCharArray();

        for (int i=0;i<let.length;i++) {
            if (MESSAGE.charAt(i)== MESSAGE.charAt(i+1)) {
                System.out.print("w");
            } else {
                System.out.print(MESSAGE.charAt(i));
            }
        }
    }
}