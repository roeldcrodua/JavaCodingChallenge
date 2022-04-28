import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(getPrimeNumber(input));
    }

    public static String getPrimeNumber(String num){
        int max = Integer.parseInt(num);
        StringBuilder output = new StringBuilder();

        for (int i=max; i>0; i--) {
            int temp = 0;
            int last2Digit =0;
            if (i<100){
                last2Digit = i;
            } else{

                last2Digit = Integer.parseInt(String.valueOf(i).substring(String.valueOf(i).length()-2));
            }

            for (int y=2; y<=max; y++){
                if (i%y==0 && i!=y){
                    temp=0;
                    break;
                } else {
                    if (i%2==1 || last2Digit%y>0) {
                        temp = i;
                    }
                }
            }
            if (temp > 0){
                output.append(temp);
                output.append(",\n");
            }
        }
        return output.toString();
    }
}
