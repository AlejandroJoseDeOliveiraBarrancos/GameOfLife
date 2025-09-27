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

    public static boolean ValidateValuesAndSaveConfigurations(String[] strings)
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
                    int valueInt = Integer.parseInt(value);
                    isValid = ValidateWidth(valueInt, argChar);
                    if (isValid) GeneralConfigurations.matrixConfigurations.setWidth(valueInt);
                    return isValid;
                }
                case 'h':
                    break;
                // TODO implement remaining values to validate
            }
        }
        return true;
    }

    private static boolean ValidateWidth (int value, char argChar) {
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
}
