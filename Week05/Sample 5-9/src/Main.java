import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        char gender;
        float weight;
        String result;
        float weight1;

        System.out.print("당신의 성별(남 = M, 여 = F)입력: ");
        gender = keyboard.next().charAt(0);
        System.out.print("당신의 키(단위: m) 입력: ");
        height = keyboard.nextFloat();

        weight = gender == 'M' || gender == 'm' ?
                 height * height * 22 : height * height * 21;

        weight1 = height * height * 20;

        result = gender == 'F' || gender == 'f' ?
                 String.format("키가 %.2f m인 %c의 미용체중은 %.2f Kg 입니다.",height, weight1):
                 String.format("");

        System.out.printf("키가 %.2f m인 %c의 표중체중은 %.2f Kg 입니다.\n", height, gender == 'F' || gender =='f' ? "여" : "남" , weight);
        System.out.println(result);
    }
}