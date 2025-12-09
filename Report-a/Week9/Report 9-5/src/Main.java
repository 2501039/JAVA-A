public class Main {
    public static void main(String[] args) {
        final int well_depth = 300;
        final int cli_day = 55;
        final int slip_night = 13;
        int height = 0;
        int day = 0;
        while (height < well_depth) {
            day++;
            height += cli_day;
            if (height >= well_depth) {
                break;
            }
            height -= slip_night;
        }
        System.out.printf("달팽이가 우물을 탈출하는데 걸린 날짜: %d일", day);
    }
}