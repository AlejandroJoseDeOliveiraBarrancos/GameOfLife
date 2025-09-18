
public class Main {
    public static void main(String[] args) {
        GreetUser();
        String[] arguments = PrintReceivedArguments(args);

        // saludar al usuario
        // mostrando los argumentos recibidos
        // validar
        // ...
    }

    public static void GreetUser(){
        System.out.println(
                """
                Hello my friendo!
                This is my Game of life implementation, please enjoy!
                """
        );
    }

    public static String[] PrintReceivedArguments(String[] args) {
        System.out.println("Received arguments: ");

        for (String argument : args) {
            System.out.println("\t" + argument);
        }
        return args;
    }
}