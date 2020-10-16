package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellTrainStation extends GameCell{
    private Player owner;
    public CellTrainStation(String name) {
        super(name, CellType.TRAINSTATION);
    }

}
