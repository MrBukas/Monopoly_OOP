package com.Bukas.cellactions;

import com.Bukas.GameCells.GameCell;
import com.Bukas.GameObjects.Player;

public interface CellAction {
    void action(GameCell cell, Player player);

}
