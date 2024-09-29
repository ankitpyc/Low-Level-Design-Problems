package domain.entities;

import java.util.Random;

public class Dice {

    public static final int MIN_DICE_VAL = 1;
    public static final int MAX_DICE_VAL = 6;
    private static final Random random = new Random();

    public static int rollDice() {
        return random.nextInt(MAX_DICE_VAL + 1 - MIN_DICE_VAL) + MIN_DICE_VAL;
    }

}
