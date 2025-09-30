import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a;
        int b;
        final int c = 56000;

        System.out.print("주택지 면적(평)을 입력하세요: ");
        a = keyboard.nextInt();

        b = a * c;
        b /= 1000;
        b *= 1000;

        System.out.printf("주택지 가격: %d", b);
    }
}