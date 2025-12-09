public class Output {
    public static void display(int[][] data) {
        System.out.println("=== 2차원 배열 출력 ===");
        for (int i = 0; i < data.length; i++) {
            display(data[i]);
        }
        System.out.println();
    }

    public static void display(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    public static void display() {
        System.out.println("--------------");
    }
}
