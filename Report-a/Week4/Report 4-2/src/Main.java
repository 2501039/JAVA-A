import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.printf("판매금액을 입력하세요: ");
        a = keyboard.nextInt();

        c = a / 11;
        b = a - c;

        System.out.printf("판매금액: %d \n", a);
        System.out.printf("금액: %d \n", b);
        System.out.printf("세금: %d \n", c);
    }
}