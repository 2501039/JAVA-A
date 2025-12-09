import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int amount;
        char member;
        String result;

        System.out.print("구매 금액 입력: ");
        amount = keyboard.nextInt();

        System.out.print("멤버쉽 회원입니까?(Y/N)");
        member = keyboard.next().charAt(0);

        result = (amount >= 50000) ||
                (member == 'Y' && amount >= 30000)
                ? "무료배송 적용"
                : "배송비 부과";

        System.out.printf("결과: %s", result);
    }
}