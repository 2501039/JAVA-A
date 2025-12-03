public class Main {
    public static void main(String[] args) {
        int year;
        int result;

        year = Input.readData();

        result = Compute.leepYear(year);

        Output.display(year, result);
    }
}