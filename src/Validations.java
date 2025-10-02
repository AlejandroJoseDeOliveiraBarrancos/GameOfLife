import Configurations.GeneralConfigurations;
import Configurations.MatrixConfigurations;

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
        for (String arg: strings) {
            String[] parts = arg.split("=");
            char argChar = parts[0].charAt(0);
            String value = parts[1];

            if(!Rules.IsArgValid(argChar)){
                Utils.PrintErrorMessage("Invalid argument: " + argChar);
                return false;
            }

            boolean isValid;
            switch (argChar) {
                case 'w': {
                    // We Validate is a valid number
                    isValid = validateNumber(value, argChar);
                    if (!isValid) return false;

                    // We Validate is a valid Height
                    int valueInt = Integer.parseInt(value);

                    isValid = validateWidth(valueInt, argChar);
                    if (!isValid) return false;

                    GeneralConfigurations.matrixConfigurations.setWidth(valueInt);
                }
                case 'h':
                    // We Validate is a valid number
                    isValid = validateNumber(value, argChar);
                    if (!isValid) return false;

                    // We Validate is a valid Height
                    int valueInt = Integer.parseInt(value);

                    isValid = validateHeight(valueInt, argChar);
                    if (!isValid) return false;

                    GeneralConfigurations.matrixConfigurations.setHeight(valueInt);
                case 'm':
                    break;
                case 's':
                    break;
                // TODO implement remaining values to validate

            }
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


}
