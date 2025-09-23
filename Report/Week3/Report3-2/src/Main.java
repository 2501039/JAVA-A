import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String school = "";
        String name = "";
        int age = 0;
        char gender = ' ';
        double height = 0.0f;
        float weight = 0.0f;

        System.out.printf("학교 입력: ");
        school = keyboard.nextLine();
        System.out.printf("이름 입력: ");
        name = keyboard.nextLine();
        System.out.printf("나이 입력: ");
        age = keyboard.nextInt();
        System.out.printf("성별 입력: ");
        gender = keyboard.next().charAt(0);
        System.out.printf("신장 입력: ");
        height = keyboard.nextDouble();
        System.out.printf("체중 입력: ");
        weight = keyboard.nextFloat();

        System.out.printf("학교: %s \n", school);
        System.out.printf("이름: %s \n", name);
        System.out.printf("나이: %d \n", age);
        System.out.printf("성별: %c \n", gender);
        System.out.printf("신장: %.1f Cm \n", height);
        System.out.printf("체중: %.1f Kg \n", weight);

    }

}