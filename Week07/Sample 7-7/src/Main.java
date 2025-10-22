import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int PAY = 11500;
        int hours;
        String result;
        int salary;
        int extarPay;

        System.out.print("주당 알바 시간 입력: ");
        hours = keyboard.nextInt();

        if (hours > 0) {
            if (hours > 40) {
                salary = 40 * PAY;
                extarPay = (int) ((hours - 40) * (PAY * 1.5));
                result = String.format("수당 : %,d원과 급여: %,d원, 합계 = %,d원", extarPay, salary, extarPay + salary);
            } else {
                salary = hours * PAY;
                result = String.format("급여: %d원", salary);
            }
            System.out.printf("시간당 입금: %,d원\n", PAY);
            System.out.printf("주당 %d 시간 알바를 하면, %s\n", hours, result);
        } else {
            System.err.println("일 X");
        }
    }
}