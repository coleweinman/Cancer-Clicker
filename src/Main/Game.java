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

	private static List<Operation> operations = new ArrayList<Operation>();
	private static int cellRate = 0;
	private static int moneyRate = 0;
	private static int cells = 100000000;
	private static int money = 0;
	private static int superCell = 0;
	private static int capacity = 0;
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
		Application.GameTab.setSpace(space,capacity);
	}

	private static void calcCellRate() {
		int sum = 0;
		for(Operation o : operations) {
			sum -= o.getCellCost();
			for(Character c : o.getCharacters())
				sum += c.getCellRate();
		}
		cellRate = sum;
	}
	
	private static void calcMoneyRate() {
		int sum = 0;
		for(Operation o : operations) {
			sum -= (o.getCellCost()*(o.getMoneyMult()+1));
			for(Character c : o.getCharacters())
				sum += c.getCellRate();
		}
		moneyRate = sum;
	}
	
	public static void calcSuperCell() {
		
	}
	
	public static void calcSpace() {
		int tSpace = 0;
		int tCapacity = 0;
		for(Operation o : operations) {
			o.calcSpace();
			tSpace += o.getSpace();
			tCapacity += o.getCapacity();
		}
		space = tSpace;
		capacity = tCapacity;
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
			if(cat == 0)
				fillSpot(getType(type));
			if(cat == 1)
				addOperation(type);
		}
	}
	
	private static void addOperation(String t) {
		switch(t) {	
			case "Box": operations.add(new Box()); break; 
			case "Garage": operations.add(new Garage()); break;
			case "Office": operations.add(new Office()); break;
			case "Cole": operations.add(new Cole()); break;
			case "Nhan": operations.add(new Nhan()); break;
			case "School": operations.add(new School()); break;
		}
	}

	public static boolean canBuy(Price p, int cat) {
		if(cells >= p.getCells() && money >= p.getMoney() && superCell >= p.getSuperCell() && ((canFit(p.getSpace())) || cat == 1))
			return true;
		else
			return false;
	}
	
	public static Character getType(String t) {
		switch(t) {
			case "Brian": return new Brian();
			case "Garrett": return new Garrett();
			case "Noah": return new Noah();
			case "Andrew": return new Andrew();
			case "Daniel": return new Daniel();
			case "Amine": return new Amine();
			case "Chris": return new Chris();
			case "Tinky": return new Tinky();
		}
		return null;
	}
	
	public static void addCell(int i) {
		cells += i;
	}
	
	public static boolean canFit(int s) {
		for(Operation o : operations)
			if(o.getSpace()+s <= o.getCapacity())
				return true;
		return false;
		
	}
	
	public static void fillSpot(Character c) {
		for(Operation o : operations) {
			if(canFit(c.getSpace()))
				o.add(c);
				calcSpace();
				break;
		}	
	}
}
