package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellChance extends GameCell{
    public CellChance() {
        super("Шанс", CellType.CHANCE);
    }

    @Override
    public void action(Player player) {
        //TODO добавить механику вытягивания шансов
    }
}
