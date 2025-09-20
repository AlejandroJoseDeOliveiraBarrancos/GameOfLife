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

    public static void ValidateValuesOfArgs(String[] strings)
    {
        // [w=5, h=5, g=20, s=500, n=1, m=01030#201#0003##]
        for (String arg: strings) {
            char argChar = arg.charAt(0); //Obtain first letter or char
            if(!Rules.IsArgValid(argChar)){
                Utils.PrintErrorMessage("Invalid argument: " + arg);
                return;
            }

            // following switch case
//            if (argChar=='w')
//                Rules.IsValidWidth(value);
        }
    }
}
