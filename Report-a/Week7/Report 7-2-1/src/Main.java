import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int tem;

        System.out.print("현재 온도 입력: ");
        tem = keyboard.nextInt();

        if (tem >= 35) {
            System.out.print("폭염 경보");
        } else if (tem >= 30) {
            System.out.print("폭염 주의보");
        } else if (tem >= -10) {
            System.out.print("정상 온도");
        } else{
            System.out.print("한파 경보");
        }
    }

}