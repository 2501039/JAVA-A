import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ticket;   // 구매 개수
        int price = 5000;   // 가격
        double result;
        int total;
        double discountrate;


        System.out.print("식권 구매 개수: ");
        ticket = keyboard.nextInt();

        total = ticket * price;
        discountrate = 0.00;
        discountrate = (ticket >= 30) ? 0.20 : (ticket >= 20) ? 0.15 : (ticket >= 10) ? 0.10 : 0.00;
        result = (double) total * (1.0 - discountrate);



        System.out.printf("식권 %d장 구매, %.0f원", ticket, result);
    }
}