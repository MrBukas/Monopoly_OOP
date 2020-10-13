package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellTax extends GameCell{
    private int tax;
    public CellTax(String name, int tax) {
        super(name, CellType.TAX);
        this.tax = tax;
    }

    @Override
    public void action(Player player) {
        if (player.pay(tax)){
            System.out.println(player.getName() + " taxed for " + tax + "$");
        }else {
            System.out.println(player.getName() + " has no money to pay " + tax + "$ tax");
        }

    }

    public int getTax() {
        return tax;
    }
}
