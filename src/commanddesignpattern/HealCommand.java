package commanddesignpattern;
public class HealCommand implements Command{
	private Robot robot;
	
	public HealCommand(Robot robot)
	{
		this.robot = robot;
	}
	public void execute()
	{
		robot.heal();
	}

}