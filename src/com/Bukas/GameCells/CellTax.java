package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellTax extends GameCell{
    private int tax;
    public CellTax(String name, int tax) {
        super(name, CellType.TAX);
        this.tax = tax;
    }



    public int getTax() {
        return tax;
    }
}
