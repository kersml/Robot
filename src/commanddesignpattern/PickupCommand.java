package commanddesignpattern;

/**
 * Pickup Command simulates the process of a robot picking up an object.
 */
public class PickupCommand implements Command {
	private Robot robot;

	/**
	 * Parameterized Constructor that creates an instance of a PickupCommand.
	 * 
	 * @param robot which will perform the command.
	 */
	public PickupCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * Executes the stored robot's equivalent function.
	 */
	public void execute() {
		robot.pickup();
	}

}
