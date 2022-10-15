package org.example;
import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Roll {

    private final int howManyDices;
    private final int sides;
    private final int howManyRolls;


    Roll(int howManyDices, int sides, int howManyRolls) {
        this.howManyDices = howManyDices;
        this.sides = sides;
        this.howManyRolls = howManyRolls;
    }

    public void roll() {

        Random random = new Random();

        System.out.println("Dices: " + howManyDices + " Sides: " + sides + " Rolls: " + howManyRolls);

        int[] result = new int[howManyDices];

        for (int roll = 0; roll < howManyRolls; roll++) {

            System.out.println(roll + 1 + ". roll:" );

            for (int dice = 0; dice < howManyDices; dice++) {
                result[dice] = random.nextInt(sides) + 1;
            }
            System.out.println(Arrays.toString(result));
            JOptionPane.showMessageDialog(null, "Roll no. " + (roll + 1) + ": " + Arrays.toString(result));
        }
    }

}
