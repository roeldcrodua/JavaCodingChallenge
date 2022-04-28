import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncodingUpperAndLowerViceVersa {

    /*

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        encodeUpperAndLower(inputString);
    }

    public static void encodeUpperAndLower(String input) {
        List<String> ascii = new ArrayList<>();
        for (char c : input.toCharArray()) {
            int asciiValue = c;
            System.out.print("ASCII: " + (char)asciiValue + "\t\t");

            if (asciiValue >= 65 && asciiValue <= 90) {
                int newAscii = asciiValue + 4;
                System.out.println("NEWASCCI: " + (String.valueOf((char)newAscii)).toLowerCase());
                int diff = 0;
                if (newAscii > 90) {
                    diff = newAscii - 90;
                    newAscii = 64 + diff;
                }
                ascii.add(String.valueOf((char)newAscii).toLowerCase());
            } else if (asciiValue >= 97 && asciiValue <= 122) {
                int newAscii = asciiValue - 4;
                System.out.println("NEWASCCI: " + (String.valueOf((char)newAscii)).toUpperCase());
                int diff = 0;
                if (newAscii < 97) {
                    diff = 97 - newAscii;
                    newAscii = 123 - diff;
                }
                ascii.add(String.valueOf((char)newAscii).toUpperCase());
            } else {
                ascii.add(String.valueOf((char)asciiValue).toUpperCase());
            }
            if (asciiValue == 32){
                ascii.add(" ");
            }
        }
        //System.out.println(ascii);

        StringBuilder sb = new StringBuilder();
        for (String c: ascii) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
