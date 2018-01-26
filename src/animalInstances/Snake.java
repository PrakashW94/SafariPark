package animalInstances;

import java.time.LocalTime;

import animals.IndoorAnimals;
import enums.EnclosureSizes;
import enums.Gender;
import enums.IndoorEnclosureTypes;

public class Snake extends IndoorAnimals
{
	private static final String DIET = "Small rodents";
	private static final String VOICE = "HISSSSSSSSS!";
	private static final String ACTION = "Does nothing, the lazy bugger!";
	private static final LocalTime ACTIVEFROM = LocalTime.of(7, 00);
	private static final LocalTime ACTIVEUNTIL = LocalTime.of(21, 00);
	private static final IndoorEnclosureTypes ENCLOSURETYPE = IndoorEnclosureTypes.AirTank;
	private static final EnclosureSizes ENCLOSURESIZE = EnclosureSizes.MEDIUM;
	
	public Snake(String name, int age, Gender gender, String desc)
	{
		super(name, age, gender, desc, DIET, VOICE, ACTION, ACTIVEFROM, ACTIVEUNTIL, ENCLOSURETYPE, ENCLOSURESIZE);
	}

}
