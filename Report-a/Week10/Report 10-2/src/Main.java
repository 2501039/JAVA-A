import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] score = new int[10];
        int total = 0;
        float avg = 0.0f;
        int max;
        int min;
        System.out.print("10개의 정수 입력\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i + 1);
            score[i] = keyboard.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            total += score[i];
        }
        avg = (float) total / 10;
        max = score[0];
        min = score[0];
        for (int i = 1; i < 10; i++) {
            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }
        System.out.println("출력 결과\n");
        System.out.printf("총점: %d\n", total);
        System.out.printf("평균: %.2f\n", avg);
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}