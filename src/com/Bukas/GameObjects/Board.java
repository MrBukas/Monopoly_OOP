package com.Bukas.GameObjects;

import com.Bukas.GameCells.*;
import javafx.scene.control.Cell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Board {
    private List<Player> playerList;
    private Map<Cell, List<Player>> cellToPlayersMap;
    static Scanner scanner;

    static GameCell start = new CellStart("Start");
    static BoardCell startCell;
    static BoardCell jailCell;
    private BoardCell lastAddedCell;


    public Board() {
        try {
            scanner = new Scanner(new File("src/board.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        startCell = new BoardCell(start,null);//TODO Дать next
        lastAddedCell = startCell;
        while (scanner.hasNext()){
            String type = scanner.next();
            //System.out.println(type);
            BoardCell cell;
            switch (type){
                case ("PROP"): addCell(readProp()); break;
                case ("TAX"): addCell(readTax()); break;
                case ("CHANCE"): addCell(readChance()); break;
                case ("TS"): addCell(readTS()); break;
                case ("CHEST"): addCell(readChest()); break;
                case ("GOTOJAIL"): addCell(readGoToJail()); break;
                case ("JAIL"): addCell(readJail()); jailCell = lastAddedCell; break;
                case ("MUNICIPAL"): addCell(readService()); break;
                case ("PARKING"): addCell(readParking()); break;
            }
        }
        startCell.next = lastAddedCell;
        BoardCell cur = startCell;
        for (int i = 0; i < 40; i++) {
            System.out.println(cur.cell.getType() + " " +cur.cell.getName());
            cur = cur.next;
        }

    }
    private void addCell(GameCell newCell){
        BoardCell bc = new BoardCell(newCell,lastAddedCell);
        lastAddedCell = bc;
    }
    private GameCell readProp(){
        String name = scanner.next();
        ColorGroup cg = CellProperty.cgFromString(scanner.next());
        int price = Integer.parseInt(scanner.next());
        int[] rent = {
                Integer.parseInt(scanner.next()),
                Integer.parseInt(scanner.next()),
                Integer.parseInt(scanner.next()),
                Integer.parseInt(scanner.next()),
                Integer.parseInt(scanner.next()),
                Integer.parseInt(scanner.next())
        };
        //scanner.nextLine();
        return new CellProperty(name,cg,price,rent);
    }
    private GameCell readTax(){
        return new CellTax(scanner.next(),Integer.parseInt(scanner.next()));
    }
    private GameCell readChance(){
        return new CellChance();
    }
    private GameCell readTS(){
        return new CellTrainStation(scanner.next());
    }
    private GameCell readChest(){
        return new CellChest();
    }
    private GameCell readGoToJail() {
        return new CellGoToJail();
    }
    private GameCell readJail(){
        return new CellJail();
    }
    private GameCell readService() { return new CellMunicipal(scanner.next());}
    private GameCell readParking() { return new CellParking();}

}
