import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Game {

	private List<Character> characters = new ArrayList<Character>();
	private int cellRate = 0;
	private int moneyRate = 0;
	private int cells = 0;
	private int money = 0;
	private int superCell = 0;
	private int space = 0;
	
	public static void start() {
		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
