package com.Bukas;

import com.Bukas.GameObjects.Board;
import com.Bukas.GameObjects.GameService;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //new Board();
        new GameService(new Board(),4);

    }
}
