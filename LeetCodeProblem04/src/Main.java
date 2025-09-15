//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public int[][] twoSum(int[] nums, int target) {
        int[][] numsArray = new int[2][nums.length];
        int point = 0;
        int point2 = 1;

        for (int i = 0; i < nums.length; i++){

                numsArray[point][i] = nums[i];

        }

        





        return numsArray;
    }


    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.twoSum(new int[] {0, 1, 2, 3}, 4).toString());



    }
}