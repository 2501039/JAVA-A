import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        int price = 0;

        System.out.print("나이 입력: ");
        age = keyboard.nextInt();

        if (age >= 18) {
            price = 4000;
        } else if (age >= 13) {
            price = 3000;
        } else if (age >= 7) {
            price = 1000;
        } else {
            price = 0;
        }

        System.out.printf("입장료: %d 원", price);
    }
}