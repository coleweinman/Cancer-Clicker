package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Game.Data;
import Game.Operation;
import Game.Characters.Brian;
import Game.Characters.Character;

public class Game {

	private static List<Character> characters = new ArrayList<Character>();
	private static List<Operation> operations = new ArrayList<Operation>();
	private static int cellRate = 0;
	private static int moneyRate = 0;
	private static int cells = 1000;
	private static int money = 0;
	private static int superCell = 0;
	private static int space = 0;
	
	public int CHARACTER = 0;
	public int OPERATION = 1;
	
	public static void start() {
		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			calcCellRate();
			calcMoneyRate();
			addValues();
			increamentDisplay();
		}
	}

	private static void addValues() {
		cells += cellRate;
		money += money;
	}

	private static void increamentDisplay() {
		Application.GameTab.setCells(cells);
	}

	private static void calcCellRate() {
		int sum = 0;
		for(Character c : characters)
			sum += c.getCellRate();
		cellRate = sum;
	}
	
	private static void calcMoneyRate() {
		int sum = 0;
		for(Character c : characters)
			sum += c.getMoneyRate();
		moneyRate = sum;
	}
	
	public static void buy(String type) {
		Price p = Data.valueOf(type).getPrice();
		if(canBuy(p)) {
			cells -= p.getCells();
			money -= p.getMoney();
			superCell -= p.getSuperCell();
			space -= p.getSpace();
			addType(type);
		}
	}
	
	public static boolean canBuy(Price p) {
		if(cells >= p.getCells() && money >= p.getMoney() && superCell >= p.getSuperCell() && space >= p.getSpace())
			return true;
		return false;
	}
	
	public static void addType(String t) {
		switch(t) {
			case "Brian": characters.add(new Brian()); break;
			//case "Garrett": characters.add(new Garrett()); break;
			//case "Brian": characters.add(new Brian()); break;
			//case "Brian": characters.add(new Brian()); break;
			//case "Brian": characters.add(new Brian()); break;
			//case "Brian": characters.add(new Brian()); break;
			//case "Brian": characters.add(new Brian()); break;
			//case "Brian": characters.add(new Brian()); break;
		}
	}
	
	public static void addCell(int i) {
		cells += i;
	}
}
