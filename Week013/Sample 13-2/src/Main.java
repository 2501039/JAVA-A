public class Main {
    public static void main(String[] args) {

        System.out.println(sumNumber(1, 3, 5));
        System.out.println(sumNumber(1, 3, 5, 9, 20, 45));
    }

    private static int sumNumber(int... numbers) {
        int total = 0;

        for (int i = 0; i < numbers.length; i++)
            total += numbers[i];

        return total;
    }
}
