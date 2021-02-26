package commanddesignpattern;
/**
 * robot object class
 * @author miller
 */
public class Robot {
	/**
	 * robot constructor that names the robot and introduces it
	 * @param name of the robot
	 */
	public Robot(String name) {
		String robotName = name;
		System.out.println("Welcome, my name is " + robotName + ", I'm a friendly robot");
	}
	/**
	 * method that displays item pickup message
	 */
	public void pickup()
	{
		System.out.println("Oh treasure, picking it up!");
	}
	/**
	 * method that displays jump message
	 */
	public void jump()
	{
		System.out.println("Oh no a hazard, I'm jumping over it.");
	}
	/**
	 * method that displays fire weapon message
	 */
	public void fire()
	{
		System.out.println("Bad guys! Fire my blow torch at them.");
	}
	/**
	 * method that displays the heal message
	 */
	public void heal()
	{
		System.out.println("Thanks for healing my wounds.");
	}

}
