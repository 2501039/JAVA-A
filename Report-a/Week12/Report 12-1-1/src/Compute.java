public class Compute {
    public static int max4(int[] num) {
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        return max;
    }
}
