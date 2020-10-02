package com.Bukas.GameObjects;

import java.util.Random;

public class Dice {
    public static int[] throwDice(){
        Random random = new Random();
        int[] result = {random.nextInt(6)+ 1,random.nextInt(6)+ 1};
        return result;
    }
    public static boolean isDouble(int[] diceResult){
        return diceResult[0] == diceResult[1];
    }
}
