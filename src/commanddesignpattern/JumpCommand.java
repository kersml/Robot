package commanddesignpattern;

/**
 * Jump Command implements the Command Interface
 */
public class JumpCommand implements Command {
	private Robot robot;

	/**
	 * Constructor
	 * 
	 * @param robot is passed through constructor
	 */
	public JumpCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * this method executes the jump function.
	 */
	public void execute() {
		robot.jump();
	}

}