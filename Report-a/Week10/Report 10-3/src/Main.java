import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] hakbun = new String[10];
        String[] name = new String[10];
        int[] mid = new int[10];
        int[] fin = new int[10];
        int[] quiz = new int[10];
        int[] homework = new int[10];
        int[] attend = new int[10];
        float[] avg = new float[10];
        System.out.print("10명의 학생 성적을 입력하세요\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("학번: ");
            hakbun[i] = keyboard.next();
            System.out.print("이름: ");
            name[i] = keyboard.next();
            System.out.print("중간, 기말, 퀴즈, 과제, 출석 점수: ");
            mid[i] = keyboard.nextInt();
            fin[i] = keyboard.nextInt();
            quiz[i] = keyboard.nextInt();
            homework[i] = keyboard.nextInt();
            attend[i] = keyboard.nextInt();
            avg[i] = (mid[i] * 0.15f) + (fin[i] * 0.15f) + (quiz[i] * 0.10f) + (homework[i] * 0.40f) + (attend[i] * 0.20f);
        }
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (avg[i] < avg[j]) {
                    float tempAvg = avg[i];
                    avg[i] = avg[j];
                    avg[j] = tempAvg;
                    String tmpStr;
                    int tmpInt;
                    tmpStr = hakbun[i];
                    hakbun[i] = hakbun[j];
                    hakbun[j] = tmpStr;
                    tmpStr = name[i];
                    name[i] = name[j];
                    name[j] = tmpStr;
                    tmpInt = mid[i];
                    mid[i] = mid[j];
                    mid[j] = tmpInt;
                    tmpInt = fin[i];
                    fin[i] = fin[j];
                    fin[j] = tmpInt;
                    tmpInt = quiz[i];
                    quiz[i] = quiz[j];
                    quiz[j] = tmpInt;
                    tmpInt = homework[i];
                    homework[i] = homework[j];
                    homework[j] = tmpInt;
                    tmpInt = attend[i];
                    attend[i] = attend[j];
                    attend[j] = tmpInt;
                }
            }
        }
        System.out.println("\n********************************************");
        System.out.println("학번      이름   중간 기말 퀴즈 과제 출석   평균");
        System.out.println("********************************************");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s  %-4s  %3d  %3d  %3d  %3d  %3d   %.2f\n",
                    hakbun[i], name[i],
                    mid[i], fin[i], quiz[i], homework[i], attend[i], avg[i]);
        }
        System.out.println("********************************************");
    }
}
