import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dollar;
        int half;
        int quarter;
        int dime;
        int nickel;
        int penny;
        int total;

        System.out.printf("달러 입력: ");
        dollar = keyboard.nextInt();
        System.out.printf("하프 입력: ");
        half = keyboard.nextInt();
        System.out.printf("쿼터 입력: ");
        quarter = keyboard.nextInt();
        System.out.printf("다임 입력: ");
        dime = keyboard.nextInt();
        System.out.printf("니켈 입력: ");
        nickel = keyboard.nextInt();
        System.out.printf("페니 입력: ");
        penny = keyboard.nextInt();

        total = (dollar * 100) + (half * 50) + (quarter * 25) + (dime * 10) + (nickel * 5) + penny;

        System.out.printf("총금엑: %d (cent)", total);
    }
}