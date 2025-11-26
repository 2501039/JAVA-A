public class Output {
    public static void display(int[] data, float avg) {
        for (int i = 0; i < data.length; i++) {

            System.out.printf("Data[%d] = %d\n", i, data[i]);
            System.out.printf("평균: %.2f\n", avg);

        }
    }
}
