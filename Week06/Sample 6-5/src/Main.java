import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MACH = 340;   // 초당
        float fighter;
        int result;

        System.out.printf("전투기의 속도는?");
        fighter = keyboard.nextFloat();

        result = (int) (MACH * fighter * 365 * 24 * 60 * 60 / 1000);

        System.out.printf("1마하는 초당 %d m를 이동힙니다\n", MACH);
        System.out.printf("%.1f 마하인 전투기가 1년간 이동한 거리는 %,d\u33a2 입니다\n", fighter, result);
    }
}