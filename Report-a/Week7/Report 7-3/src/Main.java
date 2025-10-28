import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int kor, eng, math;
        float avg;
        char grade;
        String result;

        System.out.print("국어, 영어, 수학 성적 입력: ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        avg = (kor + eng + math) / 3.0f;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        if (avg >= 80) {
            result = "성적 양호";
        } else if (avg >= 60) {
            result = "노력";
        } else {
            result = "성적 불량";
        }

        System.out.printf("국어: %d 점, 영어: %d 점, 수학: %d 점, 평균: %.2f, 학점: %c, 걸과: %s", kor, eng, math, avg, grade, result);
    }
}