import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first, second;
        int result;

        first = Input.readData("첫 번째 Data입력:");
        second = Input.readData("두 번째 Data입력:");

        result = Compute.add(first, second);
        Output.display(first, second, result);
    }
}