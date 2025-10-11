package Logic;

import Shared.Configurations.GeneralConfigurations;
import Domain.Constants;
import Domain.Rules;
import Shared.Utils;

public class Validations {
    public static void ValidateNumberOfArgs(String[] args) {
        if (args.length < Constants.NUMBER_OF_EXPECTED_ARGUMENTS)
        {
            // TODO use exceptions to handle errors
            // TODO store error messages in a constants file
            Utils.PrintErrorMessage("Invalid number of arguments");
            return;
        }
    }

    public static boolean validateValuesAndSaveConfigurations(String[] strings)
    {
        boolean isValid;

        isValid = AreCharArgsKeysValid(strings);
        if (!isValid) return false;




        // Width Validations
        String wValue = FindArgCharValue(strings, Constants.WIDTH_CHAR);

        // We Validate is a valid number
        isValid = validateNumber(wValue, Constants.WIDTH_CHAR);
        if (!isValid) return false;

        // We Validate is a valid Height
        int wValueInt = Integer.parseInt(wValue);

        isValid = validateWidth(wValueInt, Constants.WIDTH_CHAR);
        if (!isValid) return false;

        GeneralConfigurations.matrixConfigurations.setWidth(wValueInt);




        // Height Validations
        // We Validate is a valid number
        String hValue = FindArgCharValue(strings, Constants.HEIGHT_CHAR);
        isValid = validateNumber(hValue, Constants.HEIGHT_CHAR);
        if (!isValid) return false;

        // We Validate is a valid Height
        int hValueInt = Integer.parseInt(hValue);

        isValid = validateHeight(hValueInt, Constants.HEIGHT_CHAR);
        if (!isValid) return false;

        GeneralConfigurations.matrixConfigurations.setHeight(hValueInt);




        // Map Validations
        String mValue = FindArgCharValue(strings, Constants.MAP_CHAR);

        // We first validate if is a random "rnd"
        boolean isRandom = Rules.IsRandomValue(mValue);
        if (!isRandom) {
            isValid = validateMapValues(mValue);
            if (!isValid) return false;

            // "013#201#002"
            GeneralConfigurations.matrixConfigurations.setPattern(mValue);
        } else {
            GeneralConfigurations.matrixConfigurations.setRandom(true);
        }



        // Speed Validations
        // We Validate is a valid number
        String sValue = FindArgCharValue(strings, Constants.SPEED_CHAR);
        isValid = validateNumber(sValue, Constants.SPEED_CHAR);
        if (!isValid) return false;

        // We Validate is a valid Height
        int sValueInt = Integer.parseInt(sValue);

        isValid = validateSpeed(sValueInt, Constants.SPEED_CHAR);
        if (!isValid) return false;

        GeneralConfigurations.gameConfigurations.setSpeed(sValueInt);



        // Number of Generations Validations
        // We Validate is a valid number
        String genValue = FindArgCharValue(strings, Constants.GENERATIONS_CHAR);
        isValid = validateNumber(genValue, Constants.GENERATIONS_CHAR);
        if (!isValid) return false;

        // We Validate is a valid Height
        int genValueInt = Integer.parseInt(genValue);

        isValid = validateNumberOfGenerations(genValueInt, Constants.GENERATIONS_CHAR);
        if (!isValid) return false;

        GeneralConfigurations.gameConfigurations.setNumberOfGenerations(genValueInt);



        // Movememnt behaviour Validations
        // We Validate is a valid number
        String behValue = FindArgCharValue(strings, Constants.MOVEMENT_CHAR);
        isValid = validateNumber(behValue, Constants.MOVEMENT_CHAR);
        if (!isValid) return false;

        // We Validate is a valid Height
        int behValueInt = Integer.parseInt(behValue);

        isValid = validateMovementBehaviour(behValueInt, Constants.MOVEMENT_CHAR);
        if (!isValid) return false;

        GeneralConfigurations.gameConfigurations.setMovementBehaviour(behValueInt);

        // other validations
        return true;
    }

    private static boolean validateSpeed (int value, char argChar) {
        try {
            if (!Rules.IsValidSpeed(value)) {
                Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
                return false;
            }
        } catch (NumberFormatException e) {
            Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            return false;
        }
        return true;
    }

    private static boolean validateNumberOfGenerations (int value, char argChar) {
        try {
            if (!Rules.IsValidNumberOfGenerations(value)) {
                Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
                return false;
            }
        } catch (NumberFormatException e) {
            Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            return false;
        }
        return true;
    }


    private static boolean validateMovementBehaviour (int value, char argChar) {
        try {
            if (!Rules.IsValidMovementBehaviour(value)) {
                Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
                return false;
            }
        } catch (NumberFormatException e) {
            Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            return false;
        }
        return true;
    }

    private static boolean validateWidth (int value, char argChar) {
        try {
            if (!Rules.IsValidWidth(value)) {
                Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
                return false;
            }
        } catch (NumberFormatException e) {
            Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            return false;
        }
        return true;
    }

    private static boolean validateHeight(int value, char argChar) {
        try {
            if (!Rules.IsValidHeight(value)) {
                Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
                return false;
            }
        } catch (NumberFormatException e) {
            Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            return false;
        }
        return true;
    }

    private static boolean validateNumber(String value, char argChar) {
        if (!Rules.IsValidNumber(value)) {
            Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            return false;
        }
        return true;
    }

    private static boolean validateMapValues(String values) {
        char[] chars = values.toCharArray();

        boolean isValid;
        for (char value : chars) {
            isValid = Rules.IsValidMapValue(value);
            if (!isValid) return false;
        }
        return true;
    }

    public static String FindArgCharValue(String[] stringsToLookInto, char argCharToFind)
    {
        for (String string : stringsToLookInto) {

            String[] parts = string.split(Constants.ARGUMENTS_INDEX_SEPARATOR);
            char argChar = parts[0].charAt(0);
            String value = parts[1];

            if (argChar == argCharToFind) return value;
        }
        throw new IllegalArgumentException("Expected arg not found: " + argCharToFind);
    }

    public static boolean AreCharArgsKeysValid(String[] strings){
        for (String arg: strings) {
            String[] parts = arg.split(Constants.ARGUMENTS_INDEX_SEPARATOR);
            char argChar = parts[0].charAt(0);

            if(!Rules.IsArgValid(argChar)){
                Utils.PrintErrorMessage("Invalid argument: " + argChar);
                return false;
            }
        }
        return true;
    }
}
