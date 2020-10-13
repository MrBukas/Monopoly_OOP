package com.Bukas.cellactions;

import com.Bukas.GameCells.CellTax;
import com.Bukas.GameCells.GameCell;
import com.Bukas.GameObjects.Player;

public class ActionTax implements CellAction{

    @Override
    public void action(GameCell cell, Player player) {
        CellTax cellTax = (CellTax) cell;
        int tax = cellTax.getTax();
        if (player.pay(tax)){
            System.out.println(player.getName() + " taxed for " + tax + "$");
        }else {
            System.out.println(player.getName() + " has no money to pay " + tax + "$ tax");
            //TODO обработать нехватку денег
        }
    }
}
