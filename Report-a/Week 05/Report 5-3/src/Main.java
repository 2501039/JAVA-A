
public class Main {
    public static void main(String[] args) {
        final int totalSec = 54321;
        int hour, min, sec;

        String result =
                (totalSec > 0) ?
                        (
                                (hour = totalSec / 3600) + "시간 " +
                                        (min = (totalSec % 3600) / 60) + "분 " +
                                        (sec = totalSec % 60) + "초"
                        )
                        : "잘못된 입력입니다.";

        System.out.printf("54321초 = %s", result);
    }
}