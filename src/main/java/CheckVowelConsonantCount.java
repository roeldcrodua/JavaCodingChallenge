
import java.util.*;

public class CheckVowelConsonantCount {
    /*
    Jack is a bouncer giving free passes to selected guests at TranceCode music festival. Write a program to help Jack in finding guest's name having equal number of vowels and unique consonants.

    Given a guest's name as a string, print True if the guest gets a free pass, False otherwise.

    Input and output format:
    Read the input from standard input stream. Print the output to standard output.

    Sample Input	Sample Output	Explanation
    jack mustango	False
    Jon norponner	True
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        getVowelConsonantCount(inputString);
    }

    public static void getVowelConsonantCount(String input){
        Set<String> consonant = new HashSet<>();
        List<String> vowel = new ArrayList<>();

        for (String letter: input.replace(" ", "").split("")){
            if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u")){
                vowel.add(letter);
            } else {
                consonant.add(letter);
            }
        }
        if (vowel.size() == consonant.size()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
