import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int r;   // 반지름
        final double PI = 3.141592;
        double V;
        double S;

        System.out.print("구의 반지름 입력: ");
        r = keyboard.nextInt();

        V = (4.0 / 3) * PI * (r * r * r);
        S = 4 * PI * (r * r);

        System.out.printf("구의 부피: %.2f , 구의 표면적: %.2f", V, S);
    }
}