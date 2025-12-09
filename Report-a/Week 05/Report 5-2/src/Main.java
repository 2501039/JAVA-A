import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int score;
        String grade;

        System.out.print("당신의 JAVA 점수 입력: ");
        score = keyboard.nextInt();

        grade = (score >= 95 && score <= 100) ? (char)('A') + "+" :
                        (score >= 90) ? (char)('A') + "0" :
                                (score >= 85) ? (char)('B') + "+" :
                                        (score >= 80) ? (char)('B') + "0" :
                                                (score >= 75) ? (char)('C') + "+" :
                                                        (score >= 70) ? (char)('C') + "0" :
                                                                (score >= 65) ? (char)('D') + "+" :
                                                                        (score >= 60) ? (char)('D') + "0" :
                                                                                (char)('F') + "";


        System.out.printf("입력 점수: %d\n", score);
        System.out.printf("학점: %s\n", grade);
    }
}