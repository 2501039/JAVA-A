//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int[][] data = {{1, 3, 6, 9, 12}, {4, 8, 12 , 56, 78}};

        Output.display(data);

        Compute.multiple(data);   // 2차원
        Output.display(data);

        for (int i = 0; i < data.length; i++) {
            Compute.multiple(data[i]);   // 1차원
        }

        Output.display();
        for (int i = 0; i < data.length; i++) {
            Output.display(data[i]);
        }
    }
}