import java.util.*;

public class PronicHeteromecicNumber {
    public static void main(String[] args) {
        System.out.println(isHeteromecic(0));
        //isHeteromecic(0) ➞ true
        // 0 (0 + 1) = 0 1 = 0
        System.out.println(isHeteromecic(2));
        //isHeteromecic(2) ➞ true
        // 1 (1 + 1) = 1 2 = 2
        System.out.println(isHeteromecic(7));
        //isHeteromecic(7) ➞ false
        System.out.println(isHeteromecic(6));
        System.out.println(isHeteromecic(110));
        //isHeteromecic(110) ➞ true
        // 10 (10 + 1) = 10 11 = 110
        System.out.println(isHeteromecic(136));
        //isHeteromecic(136) ➞ false
        System.out.println(isHeteromecic(156));
        //isHeteromecic(156) ➞ true
    }

    public static boolean isHeteromecic(Integer num){
        boolean isFactor = false;
        Set<Integer> factors = new HashSet<>();
        System.out.println();
        if (num == 0) return true;
        System.out.println("NUM: " + num);
        //Find the factorial
        for (int i=1; i<=num; i++){
            int n = num;
            while(n>1){
                if (n%i==0) {
                    factors.add(i);
                }
                if (n/i == n){
                    break;
                }
                n=n/i;
            }
        }

        System.out.println("UNSORTED: " + factors);
        List<Integer> factorial = new ArrayList<>();
        for (Integer f: factors){
            factorial.add(f);
        }
        Collections.sort(factorial);
        System.out.println("SORTED:   " + factorial);
        for (int y=0;y<factorial.size();y++){
            try {
                if (factorial.get(y) == factorial.get(y + 1) - 1) {
                    if (factorial.get(y) * factorial.get(y+1) == num){
                        System.out.println("Factor: " + factorial.get(y) + " * " + factorial.get(y+1) + " == " +num);
                        isFactor = true;
                    }
                }
            } catch (Exception ex){
                //ignore
            }
        }
        return  isFactor;
    }
}
