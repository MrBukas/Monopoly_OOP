package com.Bukas.GameObjects;

import com.Bukas.GameCells.GameCell;

public class BoardCell{
    private GameCell cell;
    private BoardCell next;

    public BoardCell(GameCell cell, BoardCell next) {
        this.cell = cell;
        this.next = next;
    }

    public GameCell getCell() {
        return cell;
    }

    public BoardCell getNext() {
        return next;
    }

}