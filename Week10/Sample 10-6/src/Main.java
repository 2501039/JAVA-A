import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String[] hakbun = {"25010002", "25010004", "25010012", "25010022", "25010032", "25010042", "25010054", "25010062", "25010072", "25010082", };
        String[] name = {"홍길동", "경복대", "abc", "def", "ghi", "qwe", "rty", "poi", "asd", "cvb"};
        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];

        int[] sum = new int[name.length];
        float[] avg = new float[name.length];
        int[] rank = new int[name.length];
        boolean swapped = false;

        int i = 0;
        while (i < kor.length) {
            System.out.printf("\n%s님의 국어 성적 입력: ", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("\n%s님의 영어 성적 입력: ", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("\n%s님의 수학 성적 입력: ", name[i]);
            math[i] = keyboard.nextInt();

            if ((kor[i] >= 0 && kor[i] <= 100) &&
                    (eng[i] >= 0 && eng[i] <= 100) &&
                    (math[i] >= 0 && math[i] <= 100)) {
                i++;
                System.out.println();
            } else {
                System.err.println("ERROR: 0 ~ 100");
                System.in.read();
            }
            System.out.println();
        }

        for (i = 0; i < kor.length; i++) {
            sum[i] = kor[i] + eng[i] + math[i];
            avg[i] = sum[i] / 3.0f;
            rank[i] = i + 1;
        }

        for (i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                if (sum[i] < sum[j]) {
                    rank[i]++;
                }
            }
        }

        for (i = 0; i < name.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (sum[j] > sum[j + 1]) {

                    int tempSum = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = tempSum;

                    float tempAvg = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = tempAvg;

                    String tempHakbun = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = tempHakbun;

                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;

                    int tempK = kor[j]; kor[j] = kor[j + 1]; kor[j + 1] = tempK;
                    int tempE = eng[j]; eng[j] = eng[j + 1]; eng[j + 1] = tempE;
                    int tempM = math[j]; math[j] = math[j + 1]; math[j + 1] = tempM;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("+==================== 성적표 ====================");
        System.out.println("학번 이름 국어 영어 수학 총점 평균 등수");
        System.out.println("------------------------------------------------");
        for (i = 0; i < name.length; i++) {
            System.out.printf("%7s %3s %3d %3d %3d %3d %5.1f 24%2d\n",
                    hakbun[i], name[i], kor[i], eng[i], math[i], sum[i], avg[i], rank[i]);
        }
    }
}