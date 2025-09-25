public class Utils {
    public static void GreetUser(){
        System.out.println(
                """
                Hello my friendo!
                This is my Game of life implementation, please enjoy!
                """
        );
    }

    public static void PrintErrorMessage(String string){
        System.out.println(
                """
                \n
                An Error happened:
                """ + string +  "\n"
        );
    }

    public static void PrintReceivedArguments(String[] args) {
        System.out.println("Received arguments: ");

        for (String argument : args) {
            System.out.println("\t" + argument);
        }
    }

    public static boolean DoesIntListContains(int[] listOfInts, int numberToFind) {
        for (int number : listOfInts) {
            if (number == numberToFind)
                return true;
        }
        return false;
    }

    public static boolean DoesCharListContains(char[] listOfChar, char charToFind) {
        for (char character : listOfChar) {
            if (character == charToFind)
                return true;
        }
        return false;
    }
}
