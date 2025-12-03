import java.util.Scanner;

public class Input {
    public static int[] readData(int[] num) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("정수 두 개 입력: ");
        num[0] = keyboard.nextInt();
        num[1] = keyboard.nextInt();

        return num;
    }
}
