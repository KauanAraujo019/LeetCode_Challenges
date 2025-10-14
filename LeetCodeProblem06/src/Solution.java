class Solution {
    public int climbStairs(int n) {

        if (n == 1){
            return n;
        }

        int total = 0;
        int y = 1;
        int x = 1;

        for (int i = 1; i < n; i++){

           total = x + y;

           x = y;

           y = total;

        }

        return total;

    }

    public static void main(String[] args){

        Solution solution = new Solution();

        System.out.println(solution.climbStairs(5));


    }

}