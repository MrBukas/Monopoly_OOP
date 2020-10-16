package com.Bukas.GameObjects;

import com.Bukas.GameCells.CellType;

public class PlayerState {
    Player player;
    int money;
    BoardCell position;
    private int doublesInRow;

    public PlayerState(Player player) {
        this.player = player;
        money = 2500;
        doublesInRow = 0;
        position = Board.startCell;
    }

    public void setPosition(BoardCell position) {
        this.position = position;
    }

    public BoardCell getPosition() {

        return position;
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
            position = position.getNext();
            if (position.getCell().getType() == CellType.START){
                addMoney(200);
            }
            steps--;
        }
    }
    public void doAction(){
        position.getCell().action(this);
    }
}
