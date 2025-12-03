public class Main {
    public static void main(String[] args) {
                int[] num = new int[4];
                int result;

                num = Input.readData(num);

                result = Compute.max4(num);

                Output.display(result);
            }
        }

