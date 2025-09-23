import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double c = 0.0f;
        double f =0.0f;

        System.out.printf("섭씨 온도 입력: ");
        c = keyboard.nextDouble();

        f = c * 1.8 + 32;

        System.out.printf("화씨 온도: %.2f", f);

    }
}