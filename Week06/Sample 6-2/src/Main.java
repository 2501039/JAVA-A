import java.util.PropertyResourceBundle;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final double YEAR = 365.2422;
        int day;
        int hour;
        int minute;
        int second;

        double temp = YEAR;
        day = (int) temp;

        temp -= day;
        temp *= 24;
        hour = (int) temp;

        temp -= hour;
        temp *= 60;
        minute = (int) temp;

        temp -= minute;
        temp *= 60;
        second = (int) (temp + 0.5f);

        System.out.printf("1년은 %.4f일 입니다\n", YEAR);
        System.out.printf("%d일\n %d 시간\n %d분\n %d초\n", day, hour, minute, second);
    }
}