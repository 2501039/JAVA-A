//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int Korea = 99720;
        final int Northkorea = 122762;
        final int USA = 9631418;
        final int Japan = 377873;

        float temp1, temp2, temp3;

        temp1 = (float) Northkorea / Korea;
        temp2 = (float) USA / Korea;
        temp3 = (float) Japan / Korea;

        System.out.printf("대한민국의 면적: %d Km^2\n", Korea);
        System.out.printf("북한의 면적: %d Km^2\n", Northkorea);
        System.out.printf("미국의 면적: %d Km^2\n", USA);
        System.out.printf("일본의 면적: %d Km^2\n", Japan);

        System.out.printf("북한은 대한민국의 %.1f배 입니다\n", temp1);
        System.out.printf("미국은 대한민국의 %.1f배 입니다\n", temp2);
        System.out.printf("일본은 대한민국의 %.1f배 입니다\n", temp3);
    }
}