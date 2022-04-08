import java.util.*;
    /*
    Write a program which accepts a list of strings and prints the number of possible and unique vowel pairs. Vowel pairs are two strings whose union has all the 5 vowels present in it

    Input and Output Format :
    Read the list of strings separated by comma from standard input and print the output to the standard output.

    Sample Input	Sample Output	Explanation
    behavior,education,appreciation,udacity	5
    feon,greogory,meaning, jeffrey	0

     */
public class VowelPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        getVowelPairsCount(inputString);
    }

    public static void getVowelPairsCount(String input){
        List<String>  words= new ArrayList<>();
        for (String str: input.replace(" ","").split(",")){
            words.add(str);
        }

        Set<String> wordCombination = new HashSet<>();
        for (String word: words){
            for (String w: words){
                if (!word.equals(w)){
                    List<String> combi = new ArrayList<>();
                    combi.addAll(Arrays.asList(word.concat(w).split("")));
                    Collections.sort(combi);
                    StringBuilder temp = new StringBuilder();
                    for (String c : combi) {
                        temp.append(c);
                    }
                    wordCombination.add(temp.toString());
                }
            }
        }
        int counter =0;
        for (String wc: wordCombination){
            Set<String> vowels = new HashSet<>();
            for (String letter: wc.split("")){
                if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u")){
                    vowels.add(letter);
                }
            }
            if (vowels.size()==5){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
