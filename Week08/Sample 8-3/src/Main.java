//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int purchasePrice = 1015000;
        double profitRate = 0.30;
        double taxRate = 0.10;

        double sellingPrice;
        double salesTax;
        double purchaseTax;
        double netTaxPayable;

        sellingPrice = purchasePrice * (1 + profitRate);
        salesTax = sellingPrice * taxRate;
        purchaseTax = purchasePrice * taxRate;
        netTaxPayable = salesTax - purchaseTax;

        System.out.printf("납부해야할 최종 세금: %.0f 원", netTaxPayable);
    }
}