package Domain;

import Shared.Configurations.GeneralConfigurations;

import static Shared.Utils.PrintMatrix;

public class Matrix {
    public static void BuildMatrix() {
        int width = GeneralConfigurations.matrixConfigurations.getWidth();
        int height = GeneralConfigurations.matrixConfigurations.getHeight();
        
        int[][] matrix = new int[width][height];

        String[] pattern = GeneralConfigurations.matrixConfigurations.getPattern();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] =  TryGetValueFromPattern(i, j, pattern);
            }
        }

        PrintMatrix(matrix);

        GeneralConfigurations.matrixConfigurations.setMatrix(matrix);
    }

    private static int TryGetValueFromPattern(int i, int j, String[] pattern)
    {
        try {
            return pattern[i].charAt(j) - '0';
        }
        catch (IndexOutOfBoundsException e)
        {
            return 0;
        }
    }
}
