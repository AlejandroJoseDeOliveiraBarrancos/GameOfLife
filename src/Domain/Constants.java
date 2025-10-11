package Domain;

public class Constants {
    public static final int NUMBER_OF_EXPECTED_ARGUMENTS = 6;
    public static final char HEIGHT_CHAR = 'h';
    public static final char WIDTH_CHAR = 'w';
    public static final char GENERATIONS_CHAR = 'g';
    public static final char SPEED_CHAR = 's';
    public static final char MAP_CHAR = 'm';
    public static final char MOVEMENT_CHAR = 'n';
    public static final char[] EXPECTED_ARGUMENTS = new char[]{
            WIDTH_CHAR,
            HEIGHT_CHAR,
            GENERATIONS_CHAR,
            SPEED_CHAR,
            MOVEMENT_CHAR,
            MAP_CHAR
    };

    public static final String ARGUMENTS_INDEX_SEPARATOR =  "=";
    public static final String MAP_INDEX_SEPARATOR =  "#";


    // Expected Values
    public static final int[] WIDTH_EXPECTED_VALUES = new int[]{5, 10, 15, 20, 40, 80};
    public static final int[] HEIGHT_EXPECTED_VALUES = new int[]{5, 10, 15, 20, 40};
    public static final int[] MOVEMENT_BEHAVIOUR_EXPECTED_VALUES = new int[]{1, 2, 3, 4};
    public static final String RANDOM_VALUE = "rnd";
    public static final char[] MAP_EXPECTED_VALUES = new char[]{'0', '1', '2', '3', '#'};
    public static final int MIN_NUMBER_OF_GENERATIONS = 0;
    public static final int MAX_NUMBER_OF_GENERATIONS = 1000;
    public static final int[] SPEED_EXPECTED_VALUES = new int[]{0, 250, 500, 1000, 5000};

    // Default Configurations
    public static final int DEFAULT_MOVEMENT_BEHAVIOUR = 1;

}
