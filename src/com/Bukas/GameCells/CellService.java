package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellService extends GameCell{
    Player owner;
    public CellService(String name) {
        super(name, CellType.SERVICE);
    }
}
