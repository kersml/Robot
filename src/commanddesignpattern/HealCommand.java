package commanddesignpattern;

/**
 * Heal Command implements the Command Interface
 */
public class HealCommand implements Command {
	private Robot robot;

	/**
	 * Constructor
	 * 
	 * @param robot is passed through constructor
	 */
	public HealCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * this method executes the heal function.
	 */
	public void execute() {
		robot.heal();
	}

}