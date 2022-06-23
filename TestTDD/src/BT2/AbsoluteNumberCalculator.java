package BT2;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        int result;
        if (number >= 0) {
            result = number;
        } else {
            result = -1 * number;
        }
        return result;
    }

}
