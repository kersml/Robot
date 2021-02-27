package commanddesignpattern;

/**
 * Fire Command implements the Command Interface
 */
public class FireCommand implements Command {
	private Robot robot;

	/**
	 * Constructor
	 * 
	 * @param robot is passed through constructor
	 */
	public FireCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * this method executes the fire function.
	 */
	public void execute() {
		robot.fire();
	}

}