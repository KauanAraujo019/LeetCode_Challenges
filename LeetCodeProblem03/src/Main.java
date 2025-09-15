public class Main {

    public int lengthOfLastWord(String s) {
        char[] nums = s.toCharArray();
        int cont = 0;

        for (int i = s.length()-1; i < s.length();){

            if (i < 0){
                return cont;
            }

            if (nums[i] != ' '){
                i-= 1;
                cont+=1;
            }
            else if (nums[i] == ' '){
                i-= 1;
                if (cont > 0){
                    return cont;
                }

            }

        }

        return s.length();
    }



    public static void main(String[] args) {

        Main main = new Main();

        int num = main.lengthOfLastWord("luffy is still joyoy");

        System.out.println(num);
    }
}