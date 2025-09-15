import java.util.Arrays;

public class Main {

    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);

        int[] nums = new int[a.length()];


        for (int i = 0; i < a.toCharArray().length; i++){

            if (x < 0){
                return false;
            }

            nums[i] = Integer.parseInt(a.substring(i, i+1));

        }

        int p = a.toCharArray().length - 1;
        for (int i = 0; i < a.toCharArray().length; i++){
            if (p < 0){
                return true;
            }

            if (nums[i] == nums[p]){
                p-=1;
            }
            else{
                return false;
            }

        }

        return true;

    }


    public static void main(String[] args) {

    Main main = new Main();

    boolean trueOrFalse = main.isPalindrome(878);
        System.out.println(trueOrFalse);

    }
}