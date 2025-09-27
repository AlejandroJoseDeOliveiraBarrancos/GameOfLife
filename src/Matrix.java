import Configurations.GeneralConfigurations;

public class Matrix {
    public static void BuildMatrix() {
        int width = 3;
        int height = 3;
//        int width = GeneralConfigurations.matrixConfigurations.getWidth();
//        int height = GeneralConfigurations.matrixConfigurations.getHeight();
        
        int[][] matrix = new int[width][height];

        String[] pattern = new String[]{"013","201","002"};

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] =  pattern[i].charAt(j) - '0';
            }
        }

        // print matrix
        for (int x=0; x < matrix.length; x++) {
            System.out.print("|");
            for (int y=0; y< matrix[x].length; y++) {
                System.out.print (matrix[x][y]);
                if (y!=matrix[x].length-1) System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
