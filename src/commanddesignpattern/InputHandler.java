package commanddesignpattern;

import java.util.HashMap;

/**
 * Input handling class that uses a HashMap to store and select commands.
 * 
 * @author Miller
 */
public class InputHandler {
	public HashMap<String, Command> commands = new HashMap<>();

	/**
	 * Parameterized Constructor for creating an instance of the InputHandler.
	 * 
	 * @param robot which will be performing the commands.
	 */
	public InputHandler(Robot robot) {
		commands.put("pickup", new PickupCommand(robot));
		commands.put("jump", new JumpCommand(robot));
		commands.put("fire", new FireCommand(robot));
		commands.put("heal", new HealCommand(robot));
	}

	/**
	 * This method accepts user input data and determines which command 
	 * from the HashMap to perform.
	 * 
	 * Also allows the user to quit the program.
	 * 
	 * @param data the user entered.
	 */
	public void inputEntered(String data) {
		if (commands.containsKey(data)) {
			Command temp = commands.get(data);
			temp.execute();
		} else if (data.equalsIgnoreCase("quit")) {
			System.out.println("Goodbye.");
			System.exit(0);
		} else {
			System.out.println("Please enter a valid command.\n");
		}
	}
}
