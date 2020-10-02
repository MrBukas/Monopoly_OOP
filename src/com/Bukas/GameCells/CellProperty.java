package com.Bukas.GameCells;

import com.Bukas.GameObjects.Player;

public class CellProperty extends GameCell {
    private int price;
    private int[] rent;
    private int houseTier;
    private ColorGroup colorGroup;
    private Player owner;



    public CellProperty(String name,ColorGroup colorGroup, int price, int[] rent) {
        super(name, CellType.PROPERTY);
        this.price = price;
        this.colorGroup = colorGroup;
        this.rent = rent;
        houseTier = 0;
    }

    @Override
    public void action(Player player) {
        if (owner == null){
            if (player.getMoney() >= price){
                buy(player);
                System.out.println(player.getName() + " bought " + name + " for " + price + "$");
            }
        }else {
            player.pay(rent[houseTier]);
            owner.addMoney(rent[houseTier]);
            System.out.println(
                    player.getName() + " paid " + rent[houseTier] + "$ to " +
                            owner.getName() + " for staying on " + name);
        }

    }

    public int getPrice() {
        return price;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public boolean buy(Player player){
        if (player.pay(getPrice())){
            setOwner(player);
            return true;
        } else{
            return false;
        }
    }


    public static ColorGroup cgFromString(String color){
        switch (color){
            case ("BROWN"): return ColorGroup.BROWN;
            case ("CYAN"): return ColorGroup.CYAN;
            case ("PINK"): return ColorGroup.PINK;
            case ("ORANGE"): return ColorGroup.ORANGE;
            case ("RED"): return ColorGroup.RED;
            case ("YELLOW"): return ColorGroup.YELLOW;
            case ("GREEN"): return ColorGroup.GREEN;
            case ("BLUE"): return ColorGroup.BLUE;
        }
        return null;
    }
}

