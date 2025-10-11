package Shared.Configurations;

import Domain.Constants;

import static Domain.Constants.DEFAULT_MOVEMENT_BEHAVIOUR;

public class GameConfigurations {
    private int Speed;
    private int NumberOfGenerations;
    private int MovementBehaviour = DEFAULT_MOVEMENT_BEHAVIOUR;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getNumberOfGenerations() {
        return NumberOfGenerations;
    }

    public void setNumberOfGenerations(int numberOfGenerations) {
        NumberOfGenerations = numberOfGenerations;
    }

    public int getMovementBehaviour() {
        return MovementBehaviour;
    }

    public void setMovementBehaviour(int movementBehaviour) {
        MovementBehaviour = movementBehaviour;
    }


}
