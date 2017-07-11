package Game.Characters;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Game.CharacterData;
import Game.Operations.Operation;

public class Trump extends Character {
	
	public Trump() {
		super("Trump");
		setPrice(CharacterData.Trump.getPrice());
		setSpace(CharacterData.Trump.getSpace());
		int i = Main.Game.getOperations().size();
		Main.Game.getOperations().add(new Operation("Mexico", 100));
		
		Main.Game.getOperations().get(i).add(new Character("Bad Hombre"));
		Main.Game.getOperations().get(i).add(new Character("Juan"));
		Main.Game.getOperations().get(i).add(new Character("Wall"));
		JOptionPane.showMessageDialog(Application.Application.getTabbedPane(), "I'm the best character you will ever have. There will be no more people stealing your space, because they are going to be going to Mexico.");
			
	}
}
