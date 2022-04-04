import java.util.*;

public class ShuffleDigit {
    public static void main(String[] args) {

        String alphabet = "1234AC";
        String[] alphaNumeric = alphabet.split("");
        outputLoop(alphaNumeric);
        getMaxValue(alphaNumeric);
    }

    public static void outputLoop(String[] characters){
        List<String> chars = new ArrayList<>();
        chars.addAll(Arrays.asList(characters));

        SortedSet<String> shuffledChars = new TreeSet<>();
        shuffledChars.addAll(chars);

        String maxValue = getMaxValue(characters);

        while (!shuffledChars.contains(maxValue)) {
            for (String ch: characters) {
                List<String> temp = new ArrayList<>();
                for (String out : getOutputList(shuffledChars, ch)) {
                    if (out.length()<= maxValue.length()) {
                        temp.add(out);
                    }
                }
                shuffledChars.addAll(temp);
            }
        }

        for (String str: shuffledChars){
            // Change this statement to filter out the result.
            if (getSortedValue(str).equals(maxValue)) {
                System.out.println(str);
            }
        }
    }

    public static String getMaxValue(String[] characters){
        List<String> sorted = Arrays.asList(characters);
        Collections.sort(sorted);
        // Set to True if you want characters being uniquely mixed
        // Set to False if you want characters being mixed altogether
        boolean isUnique = true;

        StringBuilder max = new StringBuilder();
        for (int i=0; i<characters.length;i++){
            if (isUnique) {
                max.append(sorted.get(sorted.size()-1-i));
            } else {
                // Setting all the combination from the last character.
                max.append(sorted.get(sorted.size() - 1));
            }
        }
        System.out.println("MAX: " + max.toString());
        return max.toString();
    }

    public static String getSortedValue(String input){
        List<String> chars = new ArrayList<>();
        for (String c: input.split("")){
            chars.add(c);
        }
        Collections.sort(chars,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String ch: chars){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static List<String> getOutputList(Set<String> characters, String x){
        List<String> output = new ArrayList<>();
            for (String y: characters){
                output.add(y+x);
            }
        return output;
    }
}
