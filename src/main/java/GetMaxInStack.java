import java.util.*;

public class GetMaxInStack {
    public static void main(String[] args) {
        String[] arr = {"1 97", "2", "1 20","2", "1 26", "1 20", "2", "3", "1 91", "3"};
        System.out.println(displayStack(arr));
    }

    public static List<Integer> displayStack(String[] numArray){
        Queue<Integer> queue = new LinkedList<Integer>() {
        };
        List<Integer> output = new ArrayList<>();
        for (String str: numArray){
            int first = 0;
            int second = 0;
            if (str.contains(" ")){
                String[] s = str.split(" ");
                System.out.println();
                first = Integer.parseInt(s[0]);
                System.out.println("First: " + first);
                second = Integer.parseInt(s[1]);
                System.out.println("Second: " + second);
            }else {
                first = Integer.parseInt(str);
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            }

            if (first==1){
                queue.add(second);
                System.out.println("ADD");
            } else if (first==2){
                queue.remove();
                System.out.println("REMOVE");
            } else if (first==3){
                List<Integer> numbers = new ArrayList<>();
                for ( Integer num: queue){
                    numbers.add(num);
                }

                System.out.println("MAX: " +Collections.max(numbers));
                output.add(Collections.max(numbers));
            }
            System.out.println("QUEUE: " + queue);
        }
        return output;
    }


}
