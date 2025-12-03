import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static long readMoney() {
        Scanner scanner = new Scanner(System.in);
        long money = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("16자리 이하의 금액을 입력하세요: ");
            try {
                money = scanner.nextLong();

                if (money >= 0 && money < 10000000000000000L) {
                    validInput = true;
                } else if (money < 0) {
                    System.out.println("금액은 음수가 될 수 없습니다.");
                } else {
                    System.out.println("16자리 이하의 금액을 입력");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력");
                scanner.next();
            }
        }
        return money;
    }
}