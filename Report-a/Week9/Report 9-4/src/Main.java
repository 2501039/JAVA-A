public class Main {
    public static void main(String[] args) {
        final int coin_500 = 500;
        final int coin_100 = 100;
        final int coin_count_month = 10;
        final int year = 30;
        final int month = 12;
        int monthlyDeposit = (coin_500 * coin_count_month) + (coin_100 * coin_count_month);
        int totalmonths = year * month;
        int totalamount = 0;
        for (int i = 1; i <= totalmonths; i++) {
            totalamount = totalamount + monthlyDeposit;
        }
        System.out.printf("총 저금액: %d원 ", totalamount);
    }
}
