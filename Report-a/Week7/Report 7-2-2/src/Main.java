import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int price = 10000;
        int age, hour;
        double discount = 0.0f;
        int finalPrice;

        System.out.printf("나이, 관람 시간(예: 오후 3시는 15시) 입력: ");
        age = keyboard.nextInt();
        hour = keyboard.nextInt();

        if (hour >= 6 && hour < 10) {
            discount = 0.2;
            if (age >= 8 && age <= 18) {
                discount += 0.3;
            } else if (age >= 65) {
                discount += 0.4;
            }
        } else {
            if (age >= 8 && age <= 18) {
                discount = 0.3;
            } else if (age >= 65) {
                discount = 0.4;
            } else {
                discount = 0.0;
            }
        }

        finalPrice = (int) (price * (1-discount));

        System.out.printf("관람 요금: %d 원", finalPrice);
    }
}