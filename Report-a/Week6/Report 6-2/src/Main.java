import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int full;   // 주유 리터 수
        int liter;   // 리터당 가격
        double total1;   // 할인 전 총 금액
        double dcrate;   // 적용 할인율
        final double vatrate = 0.10;   // 부가세율

        double afterdc;   // 할인 후 금액
        double vat;   // 부가세
        double total2;   // 최종 결제 금액

        System.out.printf("주유할 리터 수(L) 입력: ");
        full = keyboard.nextInt();
        System.out.printf("리터당 가격(원) 입력: ");
        liter = keyboard.nextInt();

        total1 = (double) full * liter;
        dcrate = (total1 >= 50000) ? 0.07 : 0.00;
        afterdc = total1 * (1.0 - dcrate);
        vat = afterdc * vatrate;
        total2 = afterdc + vat;

        System.out.printf("부가세: %.0f \n", vat);
        System.out.printf("총 금액: %.0f \n", total2);
    }
}