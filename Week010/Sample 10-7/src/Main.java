import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        /* String[] hakbun = {"25010002", "25010004", "25010012", "25010022", "25010032",
                "25010042", "25010054", "25010062", "25010072", "25010082"};
        String[] name = {"홍길동", "경복대", "abc", "def", "ghi",
                "qwe", "rty", "poi", "asd", "cvb"}; */
        String[][] students = {{"25010002", "홍길동"}, {"25010004", "경복대"}, {"25010012", "abc"}, {"25010022", "def"}, {"25010032", "ghi"},
                {"25010042", "qwe"}, {"25010054", "rty"}, {"25010062", "poi"}, {"25010072", "asd"}, {"25010082", "cvb"}};

        /* int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] sum = new int[name.length];
        float[] avg = new float[name.length]; */

        int[][] score = new int[students.length][5];   // {국어, 영어, 수학, 총점, 등수}
        float[] avg = new float[students.length];
        /* int[] rank = new int[name.length]; */

        int i = 0;
        while (i < students.length) {
            System.out.printf("\n%s님의 국어 성적 입력: ", students[i][1]);
            score[i][0] = keyboard.nextInt();

            System.out.printf("%s님의 영어 성적 입력: ", students[i][1]);
            score[i][1] = keyboard.nextInt();

            System.out.printf("%s님의 수학 성적 입력: ", students[i][1]);
            score[i][2] = keyboard.nextInt();

            if ((score[i][0] >= 0 && score[i][0] <= 100) &&
                    (score[i][1] >= 0 && score[i][1] <= 100) &&
                    (score[i][2] >= 0 && score[i][2] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR: 0~100");
                System.in.read();
            }
        }

        // 총점, 평균 계산
        for (i = 0; i < students.length; i++) {
            score[i][3] = score[i][0] + score[i][1] + score[i][2];
            avg[i] = score[i][3] / 3.0f;
            score[i][4] = 1;    // 등수 기본값 1로 시작
        }

        // 등수 계산
        for (i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (score[i][3] < score[j][3]) {
                    score[i][4]++;
                }
            }
        }

        // 총점 기준 정렬 (Bubble Sort)
        boolean swapped;
        for (i = 0; i < students.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (score[j][3] < score[j + 1][3]) {  // 내림차순(총점 큰 사람 먼저)

                    // score 배열 교환
                    int[] tempScore = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tempScore;

                    // avg 교환
                    float tempAvg = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = tempAvg;

                    // students 배열 교환
                    String[] tempStudent = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempStudent;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        // 출력
        System.out.println("\n+==================== 성적표 ====================+");
        System.out.println(" 학번      이름   국어 영어 수학 총점 평균 등수");
        System.out.println("--------------------------------------------------");

        for (i = 0; i < students.length; i++) {
            System.out.printf("%8s %4s  %3d  %3d  %3d  %3d %6.1f  %2d\n",
                    students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2],
                    score[i][3], avg[i], score[i][4]);
        }

        System.out.println("--------------------------------------------------");
    }
}