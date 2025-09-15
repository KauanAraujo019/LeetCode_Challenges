import java.util.ArrayList;

public class App {

    public int singleNumber(int[] nums) {
        ArrayList<Integer> listNum = new ArrayList<>();
        int[] vetNum = new int[nums.length];
        int[] num = new int[nums.length];
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            listNum.add(nums[i]);
        }

        for (int n : listNum) {
            for (int i = 0; i < listNum.size(); i++) {
                if (n == nums[i]) {
                    vetNum[c] += 1;
                    num[c] = n;
                }
            }
            c = c + 1;
        }

        for (int i = 0; i < listNum.size(); i++) {
            if (vetNum[i] < 2) {
                return num[i];
            }
        }

        return 0;
    }



    public static void main(String[] args)  {

        int[] arrayNums = {5, 3, 3, 8, 5};

        App app = new App();

        int numeroSolo = app.singleNumber(arrayNums);

        System.out.println(numeroSolo);




    }

}
