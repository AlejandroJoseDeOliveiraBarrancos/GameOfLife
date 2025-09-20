import jdk.jshell.execution.Util;

public class Rules {
    public static boolean IsValidWidth(int width) {
        return Utils.DoesIntListContains(
                Constants.WIDTH_EXPECTED_VALUES, width
        );
    }

    public static boolean IsArgValid(char arg) {
        return Utils.DoesCharListContains(
                Constants.EXPECTED_ARGUMENTS, arg
        );
    }
}
