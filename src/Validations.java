import java.security.InvalidParameterException;

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

    public static boolean ValidateValuesOfArgs(String[] strings)
    {
        // [w=5, h=5, g=20, s=500, n=1, m=01030#201#0003##]
        // "w=5"
        //  012

        for (String arg: strings) {
            String[] parts = arg.split("=");
            char argChar = parts[0].charAt(0);
            String value = parts[1];

            if(!Rules.IsArgValid(argChar)){
                Utils.PrintErrorMessage("Invalid argument: " + argChar);
                return false;
            }

            switch (argChar) {
                case 'w': {
                    return ValidateWidth(value, argChar);
                }
                case 'h':
                    break;
                // TODO implement remaining values to validate
            }
        }
        return true;
    }

    private static boolean ValidateWidth (String value, char argChar) {
        try {
            int valueInt = Integer.parseInt(value);
            if (!Rules.IsValidWidth(valueInt)) {
                Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            }
        } catch (NumberFormatException e) {
            Utils.PrintErrorMessage("Invalid argument value: " + argChar + "=" + value);
            return false;
        }
        return true;
    }
}
