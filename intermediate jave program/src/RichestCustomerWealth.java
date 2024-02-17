public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] acc;
        acc = new int[][]{
                {1, 2, 5},
                {3, 2, 1},
        };
        int ans = 0;
        for (int i = 0; i < acc.length; i++) {
//            int ans = 0;
            int sum = 0;
            for (int j = 0; j < acc[i].length; j++) {
                sum = sum + acc[i][j];
            }
            if (ans < sum){
                ans = sum;
            }



        }
        System.out.println(ans);



    }


}
