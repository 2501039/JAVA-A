import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String[][] employees = {{"홍길동", "1111"}, {"강민성", "1411"}, {"아이들", "1167"}, {"이동화", "1677"}, {"이동둔", "1555"},
                {"정설실", "1777"}, {"고길동", "1441"}, {"저동한", "1777"}, {"박근태", "1772"}, {"소님자", "3333"}};
        char[] hobong = new char[] {'1', '2', '3', '5', '4', '3', '3', '1', '4', '2'};
        int[][] salarys = new int[employees.length][5];   // {기본금, 수당, 급여액, 세금, 지급액}

        int i =0;
        while (i < employees.length) {
            System.out.printf("%s 사원의 업무수당 입력: ", employees[i][0]);
            salarys[i][1] = keyboard.nextInt();

            if (salarys[i][1] >= 0 && salarys[i][1] <= 1000000)
                i++;
            else {
                System.err.println("ERROR: 0 ~ 1000000");
                System.in.read();
            }
        }

        for (i = 0; i < employees.length; i++) {
            switch (hobong[i]) {
                case '1' :
                    salarys[i][0] = 1650000;
                    break;
                case '2' :
                    salarys[i][0] = 1680000;
                    break;
                case '3' :
                    salarys[i][0] = 1700000;
                    break;
                case '4' :
                    salarys[i][0] = 1720000;
                    break;
                case '5' :
                    salarys[i][0] = 1750000;
                    break;
                default: salarys[i][0] = 0;
            }
        }

        for (i = 0; i < employees.length; i++) {
            salarys[i][2] = salarys[i][0] + salarys[2][1];
        }

        for (i = 0; i < employees.length; i++) {
            if (salarys[i][2] >= 2600000) {
                salarys[i][3] = (int) (salarys[i][2] * (10.0f / 100));
            } else if (salarys[i][2] >= 2000000) {
                salarys[i][3] = (int) (salarys[i][2] * (8.0f / 100));
            } else {
                salarys[i][3] = (int) (salarys[i][2] * (5.0f / 100));
            }
            salarys[i][3] = (salarys[i][3] / 100) * 100;
        }

        for (i = 0; i < employees.length; i++) {
            salarys[i][4] = salarys[i][2] - salarys[i][3];
        }

        System.out.println("********************************************************************");
        System.out.println(" 사번  이름  호봉  기본금  업무수당  급여액  세금  지급액 ");
        System.out.println("********************************************************************");
        for (i = 0; i < employees.length; i++) {
            System.out.printf("%5s %3s %c %,9d %,9d %,9d %,8d %,9d\n",
                    employees[i][1], employees[i][0], hobong[i],
                    salarys[i][0], salarys[i][1], salarys[i][2], salarys[i][3], salarys[i][4]);
        }
        System.out.println("********************************************************************");
    }
}