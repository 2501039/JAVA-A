public class Compute {

    private static final String[] HANGUL_NUMBERS = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};

    private static final String[] FOUR_DIGIT_UNITS = {"", "십", "백", "천"};

    private static final String[] GROUP_UNITS = {"", "만", "억", "조"};

    public static String convertHangul(long money) {
        if (money == 0) {
            return "영";
        }

        StringBuilder result = new StringBuilder();
        long tempMoney = money;
        int unitIndex = 0;

        while (tempMoney > 0) {
            long fourDigits = tempMoney % 10000;

            if (fourDigits > 0) {

                String hangulFourDigits = convertFourDigits(fourDigits);

                result.insert(0, hangulFourDigits + GROUP_UNITS[unitIndex]);
            }

            tempMoney /= 10000;
            unitIndex++;
        }

        return result.toString();
    }

    private static String convertFourDigits(long number) {
        StringBuilder sb = new StringBuilder();
        long temp = number;

        for (int i = 3; i >= 0; i--) {
            long digit = temp / (long) Math.pow(10, i);
            temp %= (long) Math.pow(10, i);

            if (digit > 0) {

                if (i == 1 && digit == 1) {
                    sb.append(FOUR_DIGIT_UNITS[i]);
                } else {
                    sb.append(HANGUL_NUMBERS[(int) digit]).append(FOUR_DIGIT_UNITS[i]);
                }
            } else if (i == 0 && sb.length() == 0 && number == 0) {
            }
        }
        return sb.toString();
    }
}
