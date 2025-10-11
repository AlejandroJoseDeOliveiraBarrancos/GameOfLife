import Domain.Matrix;
import Logic.Validations;
import Presentation.Game;
import Shared.Utils;

public class Main {

    public static void main(String[] args) {
        Utils.GreetUser();

        Validations.ValidateNumberOfArgs(args);

        Utils.PrintReceivedArguments(args);

        Validations.validateValuesAndSaveConfigurations(args);

        Matrix.BuildMatrix();

        Game.Play();

        // imprimir despedida
    }

}