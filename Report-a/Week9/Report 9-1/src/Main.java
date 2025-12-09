public class Main {
    public static void main(String[] args) {
        int chicken;
        int dog;
        for (chicken = 0; chicken <= 37; chicken++) {
            dog = 37 - chicken;
            if ((chicken * 2) + (dog * 4) == 102) {
                System.out.printf("닭:%d 마리, 개:%d 마리", chicken, dog);
            }
        }
    }
}