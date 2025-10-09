public class Main {

    public static void main(String[] args) {
        Utils.GreetUser();

        Validations.ValidateNumberOfArgs(args);

        Utils.PrintReceivedArguments(args);

        Validations.validateValuesAndSaveConfigurations(args);

        Matrix.BuildMatrix();
        // construir matriz
        // empezar juego
        // imprimir despedida
    }

}