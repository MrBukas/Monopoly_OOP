package com.Bukas.cellactions;

import com.Bukas.GameCells.CellType;
import com.Bukas.GameObjects.Board;
import com.Bukas.GameObjects.PlayerState;

public class ServiceForActions {
    public static void matchAction(PlayerState playerState){
        CellType type = playerState.getPosition().getCell().getType();
        switch (type){
            case START: new ActionStart().action(playerState.getPosition().getCell(),playerState);
        }
    }
}
