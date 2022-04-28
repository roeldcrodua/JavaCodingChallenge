import java.util.*;

/*
 Get the largest prime number which composes of the digit of the input;
 E.g. input 7259 output is 9257
 */
public class LargestPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        System.out.println(getLargestPrime(number));
    }

    public static Integer getSortedNumbers(Integer d){
        List<Integer> digits = new ArrayList<>();
        for (String n: String.valueOf(d).split("")){
            digits.add(Integer.parseInt(n));
        }
        Collections.sort(digits, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Integer digit: digits){
            sb.append(digit);
        }
        return Integer.parseInt(sb.toString());
    }


    public static Integer getLargestPrime(Integer num){
        int max = getSortedNumbers(num);
        int output = 0;
        if (num==2){
            return 2;
        } else if (num == 1) {
            return -1;
        }
        for (int i=max; i>0; i--) {
            int temp = 0;
            if (getSortedNumbers(i) == max) {
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
                    output = temp;
                    break;
                }
            }
        }
        if (output>0){
            return output;
        } else {
            return -1;
        }
    }
}
