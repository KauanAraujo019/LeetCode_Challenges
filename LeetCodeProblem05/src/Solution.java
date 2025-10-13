import java.util.LinkedHashMap;
import java.util.Map;

class Solution {

    public int searchInsert(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);

            if (map.containsKey(target)){
                return map.get(nums[i]);
            }

            if (nums[i] > target){
                return i;

            }
        }
        return nums.length;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[] {1,3,5,6};

        System.out.println(solution.searchInsert(array,7));

    }
}