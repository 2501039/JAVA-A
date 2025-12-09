import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int BASIC_FEE = 1200;
        final int MAX = 10;
        int code, useFee, tax;
        double inputUse;

        int[] waterUnit = {0, 40, 55, 78, 35, 20};
        double[] taxRate = {0, 0.05, 0.035, 0.025, 0.015, 0.0};

        String[][] strData = new String[3][MAX];
        double[][] dblData = new double[2][MAX];
        int[][] calcData = new int[3][MAX];

        String[] typeName = {"", "가정용", "영업용", "공장용", "관공서", "군기관"};

        for (int i = 0; i < MAX; i++) {
            System.out.print("번호(4자리): ");
            strData[0][i] = keyboard.next();

            System.out.print("이름: ");
            strData[1][i] = keyboard.next();

            System.out.print("수도 구분 코드(1 ~ 5): ");
            code = keyboard.nextInt();
            dblData[0][i] = code;
            strData[2][i] = typeName[code];

            System.out.print("사용량(m³): ");
            inputUse = keyboard.nextDouble();
            dblData[1][i] = Math.round(inputUse);

            useFee = (int) (dblData[1][i] * waterUnit[code]);
            calcData[0][i] = useFee;
            tax = (int) ((BASIC_FEE + useFee) * taxRate[code]);
            tax = (tax / 10) * 10;
            calcData[1][i] = tax;

            calcData[2][i] = BASIC_FEE + useFee + tax;
        }

            System.out.println("수 도 요 금");
            System.out.println("----------------------------------------------------------------");
            System.out.printf("%7s %7s %7s %6s %10s %10s %10s\n",
                    "번호", "이름", "구분", "사용량", "사용금액", "TAX", "납부액");
            System.out.println("----------------------------------------------------------------");
            for (int i = 0; i < MAX; i++) {
                System.out.printf("%7s %7s %7s %6.0f %10d %10d %10d\n",
                        strData[0][i], strData[1][i], strData[2][i],
                dblData[1][i],
                calcData[0][i], calcData[1][i], calcData[2][i]);
            }
            System.out.println("----------------------------------------------------------------");
    }
}
