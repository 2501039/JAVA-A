import java.util.Scanner;

public class Input {
    public static int readData() {
        Scanner keyboard = new Scanner(System.in);

        int year;

        System.out.print("년도를 입력하세요");
        year = keyboard.nextInt();

        return year;
    }
}
