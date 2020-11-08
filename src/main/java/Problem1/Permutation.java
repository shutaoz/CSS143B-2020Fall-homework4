package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> sorted = new ArrayList<>();
        permute(nums, new ArrayList<>(), sorted);
        return sorted;
    }
    public static void permute(int[] nums, List<Integer> prev, List<List<Integer>> sorted) {
        if(prev.size() == nums.length) {
            sorted.add(prev);
            return;
        }
        for(int i = 0; i < nums.length; ++i) {
            if(!prev.contains(nums[i])) {
                List<Integer> copy = new ArrayList<>(prev);
                copy.add(nums[i]);
                permute(nums, copy, sorted);
            }
        }
    }
}
