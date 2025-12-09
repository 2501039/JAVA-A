public class Main {
    public static void main(String[] args) {
        int chicken = 0;
        int dog;
        do {
            dog = 37 - chicken;
            if (chicken * 2 + dog * 4 == 102) {
                System.out.printf("닭: %d마리, 개: %d마리", chicken, dog);
            }
            chicken++;
        } while (chicken <= 37);
    }
}