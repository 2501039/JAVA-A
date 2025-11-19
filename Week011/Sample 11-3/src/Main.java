public class Main {
    public static void main(String[] args) {
        int[][] sales = {{2010, 11230, 12345, 21495, 21543, 0},
                {2011, 15630, 12345, 27595, 27253, 0},
                {2012, 11774, 14355, 15385, 24233, 0}};
        float[] avg = new float[sales.length];

        System.out.println("**********************************************");
        System.out.println("년도   1분기   2분기   3분기   4분기   합계   평균");
        System.out.println("**********************************************");

        for (int i = 0; i < sales.length; i++) {
            for (int j = 1; j < sales[i].length - 1; j++) {
                sales[i][sales[i].length - 1] += sales[i][j];
            }
        }

        for (int i = 0; i < sales.length; i++) {
            avg[i] = sales[i][sales[i].length - 1] / 4.0f;
        }

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%4d년 %,7d %,7d %,7d %,7d %,9d %,7.0f\n", sales[i][0],
                    sales[i][1], sales[i][2], sales[i][3], sales[i][4], sales[i][5], avg[i]);
        }
        System.out.println("**********************************************");
    }
}