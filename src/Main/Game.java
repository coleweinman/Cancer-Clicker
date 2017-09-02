package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import Application.OperationsList;
import Game.CharacterData;
import Game.OperationData;
import Game.Characters.Character;
import Game.Operations.*;
import Game.Operations.Operation;
import Message.InfoPanelCharacter;

public class Game {

	private static List<Operation> operations = new ArrayList<Operation>();
	private static int cellRate = 0;
	private static int moneyRate = 0;
	private static int cells = 0;
	private static double money = 0;
	private static int superCells = 0;
	private static int capacity = 0;
	private static int space = 0;
	private static int time = 0;
	private static boolean cheats = false;
	
	public static void start() {
		Save.load();
		if(cheats) {
			cells = 10000;
			money = 10000.44;
			superCells = 10;
		}
		if(operations.isEmpty())
			operations.add(new Box());
		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				time++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//if(time == 20)
				//InfoPanelCharacter.startList();
			action();
			calcCellRate();
			calcMoneyRate();
			calcSuperCell();
			calcSpace();
			addValues();
			increamentDisplay();
		}
	}

	private static void action() {
		for(Operation o : operations)
			for(Character c : o.getCharacters())
				c.action();
	}

	private static void addValues() {
		cells += cellRate;
		money += moneyRate;
	}

	private static void increamentDisplay() {
		Application.GameTab.setCells(cells);
		Application.GameTab.setCellRate(cellRate);
		Application.GameTab.setSpace(space,capacity);
		Application.GameTab.setSuperCell(superCells);
		Application.GameTab.setMoney(money);
	}

	private static void calcCellRate() {
		int sum = 0;
		for(Operation o : operations) {
			sum -= o.getCellCost();
			for(Character c : o.getCharacters()) {
				sum += c.getCellRate()*(c.getCellMult()+1);
			}
		}
		cellRate = sum;
	}
	
	private static void calcMoneyRate() {
		int sum = 0;
		for(Operation o : operations) {
			sum -= (o.getMoneyCost()*(o.getMoneyMult()+1));
			for(Character c : o.getCharacters())
				sum += c.getMoneyRate();
		}
		moneyRate = sum;
	}
	
	public static void calcSuperCell() {
		double sum = 0;
		Random rand = new Random();
		for(Operation o : operations)
			for(Character c : o.getCharacters())
				sum += c.getSuperCellMult();
		sum /= 1000;
		double outcome = rand.nextDouble() * 1;
		if(outcome <= sum)
			superCells++;
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
	public static void buyCharacter(Character c, Operation o) {
		if(o != null) {
			Price p;
			p = CharacterData.valueOf(c.getType()).getPrice();
			if(canBuy(p) && o.getSpace() + c.getSpace() <= o.getCapacity()) {
				cells -= p.getCells();
				money -= p.getMoney();
				superCells -= p.getSuperCell();
				c.setOperation(o);
				calcSpace();
				OperationsList.update();
			} else if(canBuy(p) && capacity-space >= c.getSpace()) {
				//JOptionPane.showMessageDialog(Application.Application.getTabbedPane(), "You don't have enough space in one operation to hold a new " + c.getType() + "!");
			}
		}
	}
	
	public static void buyOperation(Operation o) {
		Price p;
		p = OperationData.valueOf(o.getType()).getPrice();
		if(canBuy(p)) {
			cells -= p.getCells();
			money -= p.getMoney();
			superCells -= p.getSuperCell();
			operations.add(o);
			OperationsList.update();
		}
	}

	public static boolean canBuy(Price p) {
		if(cells >= p.getCells() && money >= p.getMoney() && superCells >= p.getSuperCell())
			return true;
		return false;
	}
	
	public static void addCell(int i) {
		cells += i;
	}
	
	public static List<Operation> getOperations() {
		return operations;
	}

	public static void convert(int i) {
		if(canBuy(new Price(i,0,0))) {
			money += (double)i/100;
			cells -= i;
		}
			
	}
	
	public static int getTime() {
		return time;
	}

	public static void setStats(int c, double m, int sc, ArrayList<Operation> o) {
		cells = c;
		money = m;
		superCells = sc;
		operations = o;
	}
	
	public static int getCells() {
		return cells;
	}
	
	public static double getMoney() {
		return money;
	}
	
	public static int getSuperCells() {
		return superCells;
	}
}
