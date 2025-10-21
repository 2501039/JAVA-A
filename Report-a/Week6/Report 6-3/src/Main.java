import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age, time, card;
        int ageType;
        double fare, night, total;

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();
        System.out.print("교통카드(1) 현금(0)");
        card = keyboard.nextInt();
        System.out.print("탑승 시간: ");
        time = keyboard.nextInt();


        ageType = Math.min(2, Math.max(0, (age / 19) * 2 + (age / 13 - age / 19)));
        fare = (ageType == 0) ? 450 :
                (ageType == 1 ? (card == 1 ? 750 : 850) :
                        (card == 1 ? 1250 : 1350));
        night = ((time / 22) + ((5 - time) / 6)) > 0 ? 1.2 : 1.0;
        total = fare * night;

        System.out.printf("총 요금: %.0f원", total);


    }
}