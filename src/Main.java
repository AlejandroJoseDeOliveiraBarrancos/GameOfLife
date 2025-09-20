import jdk.jshell.execution.Util;

public class Main {


    public static void main(String[] args) {
        Utils.GreetUser();

        Validations.ValidateNumberOfArgs(args);

        Utils.PrintReceivedArguments(args);

        Validations.ValidateValuesOfArgs(args);

        // validar
        // ...
    }


}