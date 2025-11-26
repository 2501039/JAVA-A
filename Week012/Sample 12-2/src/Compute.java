public class Compute {
    public static float convert(int temp) {
        float result;

        result = temp * (9.0f / 5.0f) + 32;   // 화씨 온도로 변환

        return result;
    }
}
