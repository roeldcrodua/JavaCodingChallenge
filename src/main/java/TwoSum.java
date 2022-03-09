import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] digit = {3,2,4};
        for (int n: twoSum(digit, 6)){
            System.out.println(n);
        }

    }

    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int n = 0;
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            System.out.println("RESET");
            sum = nums[i];
            System.out.println("SUM1 " +sum);
            for (int x=0; x<nums.length; x++){
                if (x == i){
                    continue;
                }else {
                    if (sum + nums[x] > target) {
                        System.out.println("BREAK: " + (sum + nums[x]) + " > " + target);
                        break;
                    } else {
                        sum += nums[x];
                        System.out.println("SUM2: " + nums[i] + " and " + nums[x]);

                        if (sum == target) {
                            System.out.println("SUM: " + sum + " = " + "Target: " + target);
                            n++;
                            list.add(i);
                            list.add(x);
                        }
                    }
                }
            }
            if (list.size()>=1){
                break;
            }

        }
        int[] listNum = new int[list.size()];
        int index =0;
        for (int value: list){
            listNum[index] = value;
            System.out.println("VALUE: " +value);
        }
        return listNum;
    }

}
