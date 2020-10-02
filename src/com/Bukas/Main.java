package com.Bukas;

import com.Bukas.GameCells.*;
import com.Bukas.GameObjects.Board;
import com.Bukas.GameObjects.Dice;
import com.Bukas.GameObjects.GameEngine;
import com.Bukas.GameObjects.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    public static void main(String[] args) throws FileNotFoundException {

        //new Board();
        new GameEngine(new Board(),4);

    }
}
