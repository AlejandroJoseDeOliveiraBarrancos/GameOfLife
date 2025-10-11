package Presentation;

import Shared.Configurations.GeneralConfigurations;

import static Shared.Utils.PrintMatrix;

public class Game {

    private static int numberOfGenerations;

    public void Play()
    {
        // Set up
        boolean playing = true;
        numberOfGenerations = GeneralConfigurations.gameConfigurations.getNumberOfGenerations();
        int sleepTimeBetweenGenerations = GeneralConfigurations.gameConfigurations.getSpeed();
        int[][] matrix = GeneralConfigurations.matrixConfigurations.getMatrix();

        while (playing) {
            PrintMatrix(matrix);

            // apply generation rules using movement behaviour
//            if (isEvenGeneration(numberOfGenerations))
//                ApplyGeneration(matrix);

            // After a generation
            numberOfGenerations =- 1;
            playing = thereAreGenerationsRemaining();
            sleepTime(sleepTimeBetweenGenerations);
        }

    }

    private static boolean isEvenGeneration(int numberOfGeneration)
    {
        return numberOfGeneration % 2 == 0;
    }

    private static void sleepTime(int timeToSleep)
    {
        try {
            Thread.sleep(timeToSleep);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean thereAreGenerationsRemaining()
    {
        return numberOfGenerations > 0;
    }
}
