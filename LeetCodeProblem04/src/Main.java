import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++){

            if (map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i};
            }

            map.put(target - nums[i], i);


        }

        return null;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arrayNums = {3,2,7,4,11,1};

        System.out.println(Arrays.toString(solution.twoSum(arrayNums, 8)));
    }


}