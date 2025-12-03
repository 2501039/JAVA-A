public class Main {
    public static void main(String[] args) {
        int[] num = new int[2];
        int result;

        num = Input.readData(num);

        result = Compute.max(num);

        Output.display(result);
    }
}