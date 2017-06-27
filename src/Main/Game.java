package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Game.CharacterData;
import Game.OperationData;
import Game.Characters.*;
import Game.Characters.Character;
import Game.Characters.Garrett;
import Game.Operations.*;
import Game.Operations.Operation;

public class Game {

	private static List<Character> characters = new ArrayList<Character>();
	private static List<Operation> operations = new ArrayList<Operation>();
	private static int cellRate = 0;
	private static int moneyRate = 0;
	private static int cells = 0;
	private static int money = 0;
	private static int superCell = 0;
	private static int spaceCapacity = 0;
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
			calcSuperCell();
			calcSpace();
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
		Application.GameTab.setCellRate(cellRate);
		Application.GameTab.setSpace(space,spaceCapacity);
	}

	private static void calcCellRate() {
		int sum = 0;
		for(Character c : characters)
			sum += c.getCellRate();
		for(Operation o : operations)
			sum -= o.getCellCost();
		cellRate = sum;
	}
	
	private static void calcMoneyRate() {
		int sum = 0;
		for(Character c : characters)
			sum += c.getMoneyRate();
		for(Operation o : operations)
			sum -= o.getMoneyCost();
		moneyRate = sum;
	}
	
	public static void calcSuperCell() {
		
	}
	
	public static void calcSpace() {
		int sum = 0;
		for(Operation o : operations)
			sum += o.getSpace();
		spaceCapacity = sum;
		sum = 0;
		for(Character c : characters)
			sum += c.getSpace();
		space = sum;
	}
	
	public static void buy(String type, int cat) {
		Price p = new Price(0,0,0,0);
		if(cat == 0)
			p = CharacterData.valueOf(type).getPrice();
		if(cat == 1)
			p = OperationData.valueOf(type).getPrice();
		if(canBuy(p, cat)) {
			cells -= p.getCells();
			money -= p.getMoney();
			superCell -= p.getSuperCell();
			space += p.getSpace();
			addType(type);
		}
	}
	
	public static boolean canBuy(Price p, int cat) {
		if(cells >= p.getCells() && money >= p.getMoney() && superCell >= p.getSuperCell() && ((space + p.getSpace() <= spaceCapacity && cat == 0) || cat == 1))
			return true;
		else
			return false;
	}
	
	public static void addType(String t) {
		switch(t) {
			case "Brian": characters.add(new Brian()); break;
			case "Garrett": characters.add(new Garrett()); break;
			case "Noah": characters.add(new Noah()); break;
			case "Andrew": characters.add(new Andrew()); break;
			case "Daniel": characters.add(new Daniel()); break;
			case "Amine": characters.add(new Amine()); break;
			case "Chris": characters.add(new Chris()); break;
			case "Tinky": characters.add(new Tinky()); break;
			case "Box": operations.add(new Box()); break;
			case "Garage": operations.add(new Garage()); break;
			case "Office": operations.add(new Office()); break;
			case "Cole": operations.add(new Cole()); break;
			case "Nhan": operations.add(new Nhan()); break;
			case "School": operations.add(new School()); break;
		}
	}
	
	public static void addCell(int i) {
		cells += i;
	}
}
