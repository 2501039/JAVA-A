import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int HEART = 65;
        int life;
        long result;

        System.out.print("당신은 몇 년 동안 살았나요? ");
        life = keyboard.nextInt();

        result = (long) HEART * life * 365 * 24 * 60;

        System.out.printf("심장은 분당 %d회 박동합니다\n", HEART);
        System.out.printf("%d년 동안 살았다면 %,d회 심장 박동했습니다\n", life, result);
    }
}