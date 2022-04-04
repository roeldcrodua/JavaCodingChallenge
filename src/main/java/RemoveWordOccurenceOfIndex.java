import java.util.Scanner;

public class RemoveWordOccurenceOfIndex {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String base = "I am a good am boy";
            int idx = 2;
            transform(base, idx);
        }

        public static void transform(String input, Integer index){
            int counter =0;
            int space = 1;
            StringBuilder w = new StringBuilder();
            StringBuilder sb = new StringBuilder();
            String[] words = input.split(" ");

            for (String word: words){
                for (int i=0; i<word.length(); i++){
                    if (counter==index){
                        w.append(word);
                    }
                    counter++;
                }
                counter += space;
                if (!word.equals(w.toString())){
                    sb.append(word);
                    word = "";
                }
            }
            System.out.println(sb);
        }
    }
