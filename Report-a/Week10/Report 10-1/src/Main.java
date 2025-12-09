import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] ip = new int[4];
        int nogood = 0;
        int total = 0;
        final int voters = 16;
        int xdata;
        System.out.println("투표를 시작합니다");
        for (int i = 1; i <= voters; i++) {
            System.out.printf("%d번 투표자 후보 번호 입력: ", i);
            xdata = keyboard.nextInt();
            total++;
            if (xdata >= 1 && xdata <= 4) {
                ip[xdata - 1]++;
            } else {
                nogood++;
            }
        }
        System.out.println("득표수\n");
        System.out.printf("1번: %d 표\n", ip[0]);
        System.out.printf("2번: %d 표\n", ip[1]);
        System.out.printf("3번: %d 표\n", ip[2]);
        System.out.printf("4번: %d 표\n", ip[3]);
        System.out.printf("무효표: %d 표\n", nogood);
        System.out.printf("총 투표수: %d 표\n", total);
    }
}