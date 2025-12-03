public class Output {
    public static void display(int year, int result) {
        if (result == 1) {
            System.out.printf(" %d 년은 윤년입니다", year);
        } else {
            System.out.printf("%d 년은 평년입니다", year);
        }
    }
}
