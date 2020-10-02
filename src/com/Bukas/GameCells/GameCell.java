package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public abstract class GameCell {
    String name;
    CellType type;

    public GameCell(String name, CellType type) {
        this.name = name;
        this.type = type;
    }

    public void action(Player player){//TODO подумать нужно ли делать абстрактным

    }

    public String getName() {
        return name;
    }

    public CellType getType() {
        return type;
    }
}
