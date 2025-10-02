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

    public static boolean IsValidNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
