import java.util.Scanner;

public class AlphaCode {
    public static void main(String[] args) {
        String input = "abC ROeL";

        for (Character let: input.toCharArray()){
            System.out.print(Character.isUpperCase(let) ? let : "");
        }
    }
}
