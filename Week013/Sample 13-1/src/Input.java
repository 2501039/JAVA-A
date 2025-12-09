import java.util.Scanner;

public class Input {
    private static Scanner keyboard = new Scanner(System.in);

    public static int[][] readData(String[] students) {
        int[][] data = new int[students.length][4];   // {국어, 영어, 수학, 총점}
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int j = 0; j < subject.length; j++) {
                data[i][j] = input(students[i], subject[j]);
                sum += data[i][j];
            }
            data[i][3] = sum;
        }

        return data;
    }

    private static int input(String student, String s) {
        while (true) {
            System.out.printf("%s님의 %s 성적 입력: ", student, s);

            if (keyboard.hasNextInt()) {
                int score = keyboard.nextInt();
                if (score >= 0 && score <= 100) {
                    return score;
                } else {
                    System.err.println("범위 오류: 0~100 사이 값만 입력");
                    keyboard.next();
                }
            }
        }
    }
}





