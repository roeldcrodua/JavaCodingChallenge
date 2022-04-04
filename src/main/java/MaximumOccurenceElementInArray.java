import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class MaximumOccurenceElementInArray {

    public static void main(String args[]) {
        Math.pow(3,2);
        String myArray = "hotdog, egg, hotdog, burger, putty, burger, hotdog";

        int max = 0;
        String maxItem = "";
        Set<String> lists = new HashSet<String>();
        List<String> items = new ArrayList<>();
        for (String s: myArray.split(",")){
            if (s.matches(""))
            lists.add(s.replace(" ", ""));
            items.add(s.replace(" ", ""));
        }

        for (String item: myArray.split(",")){
            System.out.println(item + " : " + Collections.frequency(items, item.replace(" ", "")));
            if (Collections.frequency(items, item.replace(" ", "")) > max){
                max = Collections.frequency(items, item.replace(" ", ""));
                maxItem = item;
            }
        }
        System.out.println(maxItem);
    }
}
