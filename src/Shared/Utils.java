package Shared;

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
    public static boolean DoesStringContains(String string, String stringTofind) {
        return string.contains(stringTofind);
    }

    public static void PrintMatrix(int[][] matrix) {
        // print matrix
        System.out.println();
        for (int x=0; x < matrix.length; x++) {
            System.out.print("|");
            for (int y=0; y< matrix[x].length; y++) {
                System.out.print (matrix[x][y]);
                if (y!=matrix[x].length-1) System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println();
    }
}
