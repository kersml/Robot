package commanddesignpattern;

/**
 * Fire Command simulates the process of a robot firing its weapon.
 */
public class FireCommand implements Command {
	private Robot robot;

	/**
	 * Parameterized Constructor that creates an instance of a FireCommand.
	 * 
	 * @param robot which will perform the command.
	 */
	public FireCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * Executes the stored robot's equivalent function.
	 */
	public void execute() {
		robot.fire();
	}

}