import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    // Input: candidates = [2,3,5], target = 8
    // Output: [[2,2,2,2],[2,3,3],[3,5]]

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> numberList =  new ArrayList<>();
        for (Integer candidate: candidates){
            if (target%candidate==0){
                List<Integer> numbers =  new ArrayList<>();
                while (target > 0){
                    target -= candidate;
                    numbers.add(candidate);
                }
                numberList.add(numbers);
            } else {
                List<Integer> numbers =  new ArrayList<>();
                int temp = target;
                while (temp > 0){
                    temp -= candidate;
                    if (temp > 0){
                        numbers.add(candidate);
                    }

                }
            }
        }
        int temp = target;
        while (temp>0){
            for (int i=0; i<candidates.length;){
                List<Integer> numbers =  new ArrayList<>();
                if (temp == candidates[i]){
                    numbers.add(candidates[i]);
                    numberList.add(numbers);
                    break;
                } else if (temp>0){
                    temp -= candidates[i];
                    numbers.add(candidates[i]);
                }
                if (temp < 0){
                    i++;
                    break;
                }
            }


        }
        return numberList;
    }

    public static void main(String[] args){

    }
}
