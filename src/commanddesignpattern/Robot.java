package commanddesignpattern;
/**
 * Class that simulates the function of a Robot.
 * @author Miller
 */
public class Robot {
	/**
	 * Parameterized Constructor that creates an instance of a Robot.
	 * @param name of the robot.
	 */
	public Robot(String name) {
		String robotName = name;
		System.out.println("Welcome, my name is " + robotName + ", I'm a friendly robot.\n");
	}
	/**
	 * Method for executing the pickup command.
	 */
	public void pickup()
	{
		System.out.println("Oh treasure, picking it up!\n");
	}
	/**
	 * Method for executing the jump command.
	 */
	public void jump()
	{
		System.out.println("Oh no a hazard, I'm jumping over it.\n");
	}
	/**
	 * Method for executing the fire command.
	 */
	public void fire()
	{
		System.out.println("Bad guys! Fire my blow torch at them.\n");
	}
	/**
	 * Method for executing the heal command.
	 */
	public void heal()
	{
		System.out.println("Thanks for healing my wounds.\n");
	}

}
