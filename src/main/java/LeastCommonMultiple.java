import java.util.Arrays;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Integer[] numbers = {46, 54, 466, 544};
        Arrays.sort(numbers);
        System.out.println("RESULT: " + lcmOfArray(numbers));
    }

    public static Integer lcmOfArray(Integer[] arr){
        int count = arr[0];
        int counter = 0;
        while (counter<arr.length){

            for (Integer num: arr){
                if (count%num != 0 ) {
                    System.out.println("BREAK on " + num);
                    counter = 0;
                    break;
                }
                if (count%num == 0){
                    System.out.println(count + " % " + num);
                }
                counter++;
            }
            if (counter != arr.length){
                continue;
            }
            count++;

        }
        return count;
    }
}
