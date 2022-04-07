import java.util.*;

/*
Sample Input	                        Sample Output	                                                Explanation
toaster boaster boastel coaster postal	toaster:boaster,toaster:coaster,boaster:boastel,boaster:coaster	Each of the doublets separated by comma differ exactly by one character
boxstar boaster boestel coalter postal	-1	                                                            There are no doublets in the given sentence and hence -1
 */
public class WordRhyme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        getWordRhyme(words);

    }

    public static void getWordRhyme( String input){
        LinkedHashSet<String> set=new LinkedHashSet();
        LinkedHashSet<String> setArray=new LinkedHashSet();
        String[] words = input.split(" ");
        for (int x=0; x<words.length; x++){
            for (int y=0; y<words.length; y++){
                if (x != y){
                    int diff = 0;
                    int temp = 0;
                    StringBuilder rhyme = new StringBuilder();
                    String[] wordBase = words[x].split("");
                    for (int a=0; a<wordBase.length; a++){
                        String[] wordToCompare = words[y].split("");
                        for (int b=0; b<wordToCompare.length; b++){
                            if (a==b) {
                                if (!wordBase[a].equals(wordToCompare[b])){
                                    diff++;
                                }
                                if (diff>1){
                                    rhyme.setLength(0);
                                    break;
                                } else {
                                    rhyme.append(wordToCompare[b]);
                                }
                            }
                        }
                    }
                    if (diff == 1){
                        System.out.println("WORD: " + words[x] + " RHYME: " + rhyme);
                        String output = words[x] + ":" + rhyme ;

                        List<String> sortedOutput = Arrays.asList(output.split(""));
                        Collections.sort(sortedOutput);

                        if (setArray.size() > 0) {
                            boolean isFound = false;
                            for (String str : setArray) {
                                List<String> sortedLetters = Arrays.asList(str.split(""));
                                Collections.sort(sortedLetters);
                                //System.out.println("SORTED: " + sortedOutput.toString() + " -" + sortedOutput.equals(sortedLetters) + "- " + "LETTERS: " + sortedLetters.toString());
                                if (sortedOutput.equals(sortedLetters)) {
                                    isFound = true;
                                    break;
                                }
                            }
                            if (!isFound){
                                set.add(output);
                            }
                        } else {
                            set.add(output);
                        }
                        setArray.addAll(set);
                    }
                }
            }

        }
        if (setArray.size() > 0){
            int n=0;
            for (String sa: setArray){
                System.out.print(n > 0 ? "," + sa : sa);
                n++;
            }

        } else {
            System.out.println(-1);
        }

    }
}
