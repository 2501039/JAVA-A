public class Compute {
    public static void multiple(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            multiple(data[i]);
        }
    }

    public static void multiple(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }
    }
}
