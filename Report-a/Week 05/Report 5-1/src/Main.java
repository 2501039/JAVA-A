import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int ch;
        int convert;

        System.out.print("영문자 1자를 입력하세요: ");
        ch = keyboard.next().charAt(0);

        convert = (ch >= 'a' && ch <= 'z')
                ? (ch - 32)
                : (ch + 32);

        System.out.printf("입력문자 %c는 %s이고, %s로 변경하면 %c입니다.",
                ch, (ch >= 'a' && ch <= 'z') ? "소문자" : "대문자",
                (ch >= 'a' && ch <= 'z') ? "대문자" : "소문자", convert);
    }
}