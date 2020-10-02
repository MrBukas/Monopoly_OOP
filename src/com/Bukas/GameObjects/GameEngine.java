package com.Bukas.GameObjects;

public class GameEngine {
    Board board;
    int playerCount;
    Player[] playerList;
    public GameEngine(Board board, int playerCount) {
        this.board = board;
        this.playerCount = playerCount;
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
