package org.example;
import javax.swing.*;
public class WindowHandler {

    WindowHandler() {
        ImageIcon diceIcon = new ImageIcon("C:\\dev\\java_projects\\SimpleDiceRoller\\src\\main\\resources\\diceIcon3.png");

        JOptionPane.showMessageDialog(null,"Select number and kind of dice to roll!", "DiceRoller", JOptionPane.INFORMATION_MESSAGE, diceIcon);

        while (true){
               try {
                   String dices = JOptionPane.showInputDialog(null, "Number of Dices: ", "Dices", JOptionPane.INFORMATION_MESSAGE);
                   int howManyDices = Integer.parseInt(dices);

                   String sidesNo = JOptionPane.showInputDialog(null, "Number of Sides: ", "Sides", JOptionPane.INFORMATION_MESSAGE);
                   int sides = Integer.parseInt(sidesNo);

                   String rolls = JOptionPane.showInputDialog(null, "Number of Rolls: ", "Rolls", JOptionPane.INFORMATION_MESSAGE);
                   int howManyRolls = Integer.parseInt(rolls);

                   Roll diceRoller = new Roll(howManyDices, sides, howManyRolls);

                   diceRoller.roll();
                   return;
               } catch (NumberFormatException numberFormatException) {
                   JOptionPane.showMessageDialog(null, "You have to enter a number", "Hello User!", JOptionPane.WARNING_MESSAGE);
               } catch (NegativeArraySizeException arraySizeException)
               {
                   JOptionPane.showMessageDialog(null, "Number must be > 0", "Hello User!", JOptionPane.WARNING_MESSAGE);

               }
           }
        }
    }
