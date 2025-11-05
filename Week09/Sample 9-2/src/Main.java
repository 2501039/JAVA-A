import org.w3c.dom.html.HTMLLabelElement;

import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int start;
        int last;
        int sum = 0;

       while (true) {
           System.out.print("어디서부터 더할까요?");
           start = keyboard.nextInt();

           System.out.print("어디서까지 더할까요?");
           last = keyboard.nextInt();

           if (start < last) {
               break;
           } else {
               System.err.println("시작은 끝보다 작아야함");
           }
       }


        for (int i = start; i <= last; i++) {
            sum += i;
        }

        System.out.printf("%d 부터 %d 까지의 합: %d\n", start, last, sum);
    }
}