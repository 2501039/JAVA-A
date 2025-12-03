public class Main {
    public static void main(String[] args) {
        long money;
        String hangulResult;

        System.out.println("--- 16자리 이하 금액 한글 변환 ---");

        money = Input.readMoney();

        hangulResult = Compute.convertHangul(money);

        Output.displayResult(money, hangulResult);
    }
}