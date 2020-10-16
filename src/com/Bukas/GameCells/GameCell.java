package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public abstract class GameCell {
    String name;
    CellType type;
    private GameCell next;

    public GameCell(String name, CellType type) {
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public CellType getType() {
        return type;
    }
}
