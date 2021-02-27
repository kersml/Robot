//package commanddesignpattern;

public class PickupCommand implements Command{
	private Robot robot;
	
	public PickupCommand(Robot robot)
	{
		this.robot = robot;
	}
	public void execute()
	{
		robot.pickup();
	}

}
