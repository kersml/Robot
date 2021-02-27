package commanddesignpattern;

/**
 * Pickup Command implements the Command Interface
 */
public class PickupCommand implements Command {
	private Robot robot;

	/**
	 * Constructor
	 * 
	 * @param robot is passed through constructor
	 */
	public PickupCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * this method executes the pickup function.
	 */
	public void execute() {
		robot.pickup();
	}

}
