public class Output {

    public static void displayResult(long money, String hangulResult) {
        System.out.println("\n--- 금액 한글 변환 결과 ---");
        System.out.println("입력 금액: " + String.format("%,d", money));
        System.out.println("한글 금액: " + hangulResult);
        System.out.println("--------------------------");
    }
}