import java.util.Scanner;

public class Input {
    public static int[] readData(int[] num) {
        Scanner keyobard = new Scanner(System.in);

        System.out.println("정수 4개 입력: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = keyobard.nextInt();
        }

        return num;
    }
}
