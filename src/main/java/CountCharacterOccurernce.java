import java.util.Scanner;

public class CountCharacterOccurernce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String base = " 11123334";
        transform(base);
    }

    public static void transform(String input){
        int counter =1;
        int n=0;
        StringBuilder sb = new StringBuilder();
        for (String s: input.split("")){
            if (n == input.length()-1){
                if (s.equals(String.valueOf(input.charAt(n-1)))){
                    counter++;
                }
                sb.append(counter);
                sb.append(s);
            } else {
                if (s.equals(String.valueOf(input.charAt(n+1)))) {
                    counter++;
                } else {
                    sb.append(counter);
                    sb.append(s);
                    counter =1;
                }
            }
            n++;
        }
        System.out.println(sb);
    }
}
