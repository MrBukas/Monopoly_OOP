package com.Bukas.cellactions;

import com.Bukas.GameCells.GameCell;
import com.Bukas.GameObjects.Player;

public class ActionGoToJail implements CellAction{
    @Override
    public void action(GameCell cell, Player player) {
        player.goToJail();
    }
}
