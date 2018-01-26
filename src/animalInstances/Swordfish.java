package animalInstances;

import java.time.LocalTime;

import animals.IndoorAnimals;
import enums.EnclosureSizes;
import enums.Gender;
import enums.IndoorEnclosureTypes;

public class Swordfish extends IndoorAnimals
{
	private static final String DIET = "Smaller fish and octopods";
	private static final String VOICE = "SWOOOOOOSSSSHHHH!";
	private static final String ACTION = "Pokes things with it's sword, ouch!";
	private static final LocalTime ACTIVEFROM = LocalTime.of(7, 00);
	private static final LocalTime ACTIVEUNTIL = LocalTime.of(22, 00);
	private static final IndoorEnclosureTypes ENCLOSURETYPE = IndoorEnclosureTypes.WaterTank;
	private static final EnclosureSizes ENCLOSURESIZE = EnclosureSizes.LARGE;
	
	public Swordfish(String name, int age, Gender gender, String desc)
	{
		super(name, age, gender, desc, DIET, VOICE, ACTION, ACTIVEFROM, ACTIVEUNTIL, ENCLOSURETYPE, ENCLOSURESIZE);
	}
}
