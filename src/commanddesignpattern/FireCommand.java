package commanddesignpattern;
public class FireCommand implements Command{
	private Robot robot;
	
	public FireCommand(Robot robot)
	{
		this.robot = robot;
	}
	public void execute()
	{
		robot.fire();
	}

}