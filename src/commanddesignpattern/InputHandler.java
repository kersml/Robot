package commanddesignpattern;

import java.util.HashMap;

/**
 * input handling class that uses a hashmap to select command
 * 
 * @author miller
 */
public class InputHandler {
	public HashMap<String, Command> commands = new HashMap<>();

	/**
	 * constructor that creates and fills the hashmap with commands
	 * 
	 * @param robot object
	 */
	public InputHandler(Robot robot) {
		PickupCommand pc = new PickUpCommand(robot);
		HealCommand hc = new HealCommand(robot);
		JumpCommand jc = new JumpCommand(robot);
		FireCommand fc = new FireCommand(robot);
		commands.put("pickup", pc);
		commands.put("jump", jc);
		commands.put("fire", fc);
		commands.put("heal", hc);
	}

	/**
	 * method that accepts the input and chooses what to do
	 * 
	 * @param data entered
	 */
	public void inputEntered(String data) {
		if (commands.containsKey(data)) {
			Command temp = commands.get(data);
			temp.execute();
		} else if (data.equalsIgnoreCase("quit")) {
			System.out.println("Goodbye");
			System.exit(0);
		} else {
			System.out.println("Error");
			System.exit(0);
		}
	}
}
