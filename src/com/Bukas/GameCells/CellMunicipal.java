package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellMunicipal extends GameCell{
    Player owner;
    public CellMunicipal(String name) {
        super(name, CellType.SERVICE);
    }
}
