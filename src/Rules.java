public class Rules {
    public static boolean IsValidWidth(int width) {
        return Utils.DoesIntListContains(
                Constants.WIDTH_EXPECTED_VALUES, width
        );
    }

    public static boolean IsValidHeight(int width) {
        return Utils.DoesIntListContains(
                Constants.HEIGHT_EXPECTED_VALUES, width
        );
    }

    public static boolean IsArgValid(char arg) {
        return Utils.DoesCharListContains(
                Constants.EXPECTED_ARGUMENTS, arg
        );
    }

    public static boolean IsRandomValue(String arg) {
        return Utils.DoesStringContains(arg, Constants.RANDOM_VALUE);
    }

    public static boolean IsValidNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean IsValidMapValue(char value) {
        return Utils.DoesCharListContains(
                Constants.MAP_EXPECTED_VALUES, value
        );
    }
}
