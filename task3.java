public class task3 {
    private static void task3 (int len) {
        int[][] array_init = new int[len][len];
        for(int i = 0; i< len; i++) {
            for(int j = 0; j < len; j++) {
                if (i == j){array_init[i][j] = 1;}
                else if ((i+j) == (len - 1)) {array_init[i][j] = 1;}
                else {array_init[i][j] = 0;}
                System.out.print(array_init[i][j]);
            }
            System.out.println();
        }


    }
}
