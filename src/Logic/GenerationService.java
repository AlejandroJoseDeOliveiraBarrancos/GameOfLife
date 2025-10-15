package Logic;

public class GenerationService {
    public static void ApplyGenerationRules(int[][] matrix) {

        // MOVEMENT RULES
        // only animals can move
        // water doesnt move ever
        // if an animal finds a tree, it replaces it
        // if an animal finds a free cell, it moves


        // APPEARANCE RULES
        // a water appears if another water is found in an upper cell of a 1 radius distance AND the generation number is mod 3
        // an animal appears when there are two animals in a 1 cell radius AND at least 1 water AND 1 tree in a 2 cell radius
        // a tree appears whenever there are 2 or more trees in a 1 cell radius


        // DISAPPEARING RULES
        // if an animal doesnt have 1 water AND 1 tree in a 2 cell radius, the animal dies
        // if a tree doesnt have 1 water in a 2 cell radius, the animal dies


        for (int x=0; x < matrix.length; x++) {
            for (int y=0; y< matrix[x].length; y++) {

            }
        }

    }
}
