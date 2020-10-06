package com.Bukas.GameObjects;

import com.Bukas.GameCells.CellType;
import javafx.scene.control.Cell;

public class GameService {
    //Board board;
    //int playerCount;
    //Player[] playerList;

    private Map<CellType, CellActionService> actionServiceMap;

    public void init(Board board, int playerCount) {
        playerList = new Player[playerCount];
        for (int i = 0; i < playerCount; i++) {
            playerList[i] = new Player("Player" + (i + 1));
        }
        System.out.println("Game set up");

        Player currentPlayer;
        for (int i = 0; i < 120; i++) {
            currentPlayer = playerList[i % playerCount];
            makeStep(currentPlayer);
        }
        System.out.println();
    }

    public void play(Board b) {
        while (i < 100) {
            //get player
            //throw dice
            //cell makeStep(board, player, stepCount)
            //doStepAction(cell, player)

            //do check players
        }
    }

    private void doStepAction(Cell cell, Player p) {
        ActionService svc = actionServiceMap.get(cell.getType());
        svc.doSmth(cell, p);
    }

    private void makeStep(Player player){
        //System.out.println(player.name);
        int[] diceRes = Dice.throwDice();
        boolean wasDouble = false;
        if (Dice.isDouble(diceRes)) {
            player.incDoublesInRow();
            if (player.getDoublesInRow() >= 3){
                player.goToJail();
                return;
            }
            wasDouble = true;
        }else {
            player.resetDoubles();
        }

        player.walk(diceRes[0] + diceRes[1]);
        //player.position.cell.action(player);
        player.doAction();
        if (wasDouble){
            makeStep(player);
        }
    }
}
