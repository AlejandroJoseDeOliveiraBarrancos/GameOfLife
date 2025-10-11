package Domain;
import static Shared.Utils.*;

public class Rules {
    public static boolean IsValidWidth(int width) {
        return DoesIntListContains(
                Constants.WIDTH_EXPECTED_VALUES, width
        );
    }

    public static boolean IsValidSpeed(int speed) {
        return DoesIntListContains(
                Constants.SPEED_EXPECTED_VALUES, speed
        );
    }

    public static boolean IsValidHeight(int height) {
        return DoesIntListContains(
                Constants.HEIGHT_EXPECTED_VALUES, height
        );
    }

    public static boolean IsValidNumberOfGenerations(int generations) {
        return
                generations >= Constants.MIN_NUMBER_OF_GENERATIONS &&
                        generations <= Constants.MAX_NUMBER_OF_GENERATIONS;
    }


    public static boolean IsValidMovementBehaviour(int behaviour) {
        return DoesIntListContains(
                Constants.MOVEMENT_BEHAVIOUR_EXPECTED_VALUES, behaviour
        );
    }

    public static boolean IsArgValid(char arg) {
        return DoesCharListContains(
                Constants.EXPECTED_ARGUMENTS, arg
        );
    }

    public static boolean IsRandomValue(String arg) {
        return DoesStringContains(arg, Constants.RANDOM_VALUE);
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
        return DoesCharListContains(
                Constants.MAP_EXPECTED_VALUES, value
        );
    }
}
