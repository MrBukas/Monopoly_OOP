package com.Bukas.cellactions;

import com.Bukas.GameCells.CellProperty;
import com.Bukas.GameCells.ColorGroup;
import com.Bukas.GameCells.GameCell;
import com.Bukas.GameObjects.Player;

public class ActionProperty implements CellAction{
    public void action(GameCell property, Player player) {
        CellProperty cell = (CellProperty) property;
        if (cell.getOwner() == null){
            if (player.getMoney() >= cell.getPrice()){
                buy(cell,player);
                System.out.println(player.getName() + " bought " + cell.getName() + " for " + cell.getPrice() + "$");
            }
        }else {
            int rent = cell.getRent();
            player.pay(rent);
            cell.getOwner().addMoney(rent);
            System.out.println(
                    player.getName() + " paid " + rent + "$ to " +
                            cell.getOwner().getName() + " for staying on " + cell.getName());
        }

    }
    private static boolean buy(CellProperty cell, Player player){
        if (player.pay(cell.getPrice())){
            cell.setOwner(player);
            return true;
        } else{
            return false;
        }
    }

}
