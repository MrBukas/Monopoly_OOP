package com.Bukas.GameObjects;

import com.Bukas.GameCells.CellType;

public class Player {
    String name;
    int money;
    Board.BoardCell position;
    private int doublesInRow;

    public Player(String name) {
        this.name = name;
        money = 2500;
        doublesInRow = 0;
        position = Board.startCell;
    }

    public String getName() {
        return name;
    }
    public int getDoublesInRow() {
        return doublesInRow;
    }
    public void incDoublesInRow(){
        doublesInRow++;
    }
    public void resetDoubles(){
        doublesInRow = 0;
    }
    public int getMoney() {
        return money;
    }
    public void addMoney(int sum){
        money += sum;
    }
    public void goToJail(){
        position = Board.jailCell;
    }
    public boolean pay(int price){
        if (price > money){
            return false;
        }else {
            money -= price;
            return true;
        }
    }
    public void walk(int steps){
        while (steps != 0) {
            position = position.next;
            if (position.cell.getType() == CellType.START){
                addMoney(200);
            }
            steps--;
        }
    }
    public void doAction(){
        position.cell.action(this);
    }
}
