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




    // GAME RULES
    public static boolean CanMove(int value, int valueInCell) {
        return value == Constants.ANIMAL_VALUE && valueInCell == Constants.EMPTY_VALUE;
    }

    public static boolean CanReplaceCell(int value, int valueInCell) {
        return value == Constants.ANIMAL_VALUE && valueInCell == Constants.TREE_VALUE;
    }

    // APPEARANCE RULES
    public static boolean CanTreeAppear(int value, int numberOfTreesInAOneCellRadius) {
        return value == Constants.EMPTY_VALUE && numberOfTreesInAOneCellRadius >= 2;
    }

    public static boolean CanAnimalAppear(
            int value,
            int numberOfAnimalsInOneCellRadius,
            int numberOfWatersInTwoCellRadius,
            int numberOfTreesInTwoCellRadius
    ) {
        return value == Constants.EMPTY_VALUE
                && numberOfAnimalsInOneCellRadius == 2
                && numberOfWatersInTwoCellRadius >= 1
                && numberOfTreesInTwoCellRadius >= 1;
    }

    public static boolean CanWaterAppear(
            int value,
            int numberOfWatersInUpperCellsInOneCellRadius,
            int numberOfGeneration
    ) {
        return value == Constants.EMPTY_VALUE
                && numberOfWatersInUpperCellsInOneCellRadius >= 1
                && (numberOfGeneration % 3 == 0);
    }







}
