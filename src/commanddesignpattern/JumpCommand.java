package commanddesignpattern;

/**
 * Jump Command simulates the process of a robot jumping.
 */
public class JumpCommand implements Command {
	private Robot robot;

	/**
	 * Parameterized Constructor that creates an instance of a JumpCommand.
	 * 
	 * @param robot which will perform the command.
	 */
	public JumpCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * Executes the stored robot's equivalent function.
	 */
	public void execute() {
		robot.jump();
	}

}