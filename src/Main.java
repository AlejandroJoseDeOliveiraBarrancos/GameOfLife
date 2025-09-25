import Configurations.GeneralConfigurations;
import Configurations.MatrixConfigurations;

public class Main {

    public static void main(String[] args) {
        Utils.GreetUser();

        Validations.ValidateNumberOfArgs(args);

        Utils.PrintReceivedArguments(args);

        Validations.ValidateValuesOfArgs(args);


//
//        MatrixConfigurations matrixConfigurations = new MatrixConfigurations(50, 20, "100#000#111");
//
//        matrixConfigurations.getWidth();

        // GeneralConfigurations.matrixConfigurations;

        // Construir configuraciones -> matriz, juego
        // Construir matriz

    }


}