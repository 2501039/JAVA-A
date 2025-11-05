import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double totalExpense; // 지출액
        double savings;      // 저축액
        double foodExpense;  // 식생활비
        double engelIndex;   // 엥겔지수
        String grade = "미정";        // 계층 판정 결과

        System.out.print("지출액 입력: ");
        totalExpense = keyboard.nextDouble();
        System.out.print("저축액 입력: ");
        savings = keyboard.nextDouble();

        foodExpense = totalExpense - savings;
        engelIndex = foodExpense / totalExpense * 100;

        if (engelIndex <= 30 ) {
            grade = "상류층";
        } else if (engelIndex <= 50) {
            grade = "중산층";
        } else if (engelIndex >= 51) {
            grade = "하류층";
        }

        System.out.printf("엥겔 지수: %.0f\n", engelIndex);
        System.out.print("가계 계층 판정:" + grade);
    }
}