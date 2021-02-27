package commanddesignpattern;

/**
 * Heal Command simulates the process of a robot healing itself
 */
public class HealCommand implements Command {
	private Robot robot;

	/**
	 * Parameterized Constructor that creates an instance of a HealCommand.
	 * 
	 * @param robot which will perform the command.
	 */
	public HealCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * Executes the stored robot's equivalent function.
	 */
	public void execute() {
		robot.heal();
	}

}