package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellGoToJail extends GameCell{
    public CellGoToJail() {
        super("Отправляйтесь в тюрьму", CellType.GOTOJAIL);
    }

    @Override
    public void action(Player player) {
        player.goToJail();
    }
}
