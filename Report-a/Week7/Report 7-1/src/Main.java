import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c;
        int first, second, third;

        System.out.print("정수 3개 입력: ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if (a >= b && a >= c) {
            first = a;
            if (b >= c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b >= a && b >= c) {
            first = b;
            if (a >= c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a >=b) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }

        System.out.printf("입력 받은 %d, %d, %d 를 크기 순으로 나열하면 %d, %d, %d 입니다.", a, b, c, third, second, first);
    }
}