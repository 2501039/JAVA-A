import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        // int[] java;
        // java = new int [5];

        // int[] java = new int[5];

        int[] java = {95, 70, 80, 85, 100};
        float[] java1 = {95, 70.0f, 80.0f, 85.0f, 100.0f};
        String[] name = {"홍길동", "경복대", "abc", "def", "ghi"};

        int i = 0;
        while (i < name.length) {
            System.out.printf("%s님의 JAVA 성적 입력:", name[i]);
            java[i] = keyboard.nextInt();

            if (java[i] >= 0 && java[i] <= 100)
                i++;
            else {
                System.err.println("ERROR: 0 ~ 100");
                System.in.read();
            }
        }

        for (i = 0; i < java.length; i++) {
            System.out.printf("%s java 성적: %3d점\n", name[i], java[i]);
        }
    }
}