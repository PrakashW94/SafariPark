package animalInstances;

import java.time.LocalTime;

import animals.OutdoorAnimals;
import enums.EnclosureSizes;
import enums.Gender;
import enums.OutdoorEnclosureTypes;

public class Elephant extends OutdoorAnimals
{
	private static final String DIET = "Fruit and Veg";
	private static final String VOICE = "ARUUUUUU!";
	private static final String ACTION = "Eats fruit from your hand!";
	private static final LocalTime ACTIVEFROM = LocalTime.of(9, 30);
	private static final LocalTime ACTIVEUNTIL = LocalTime.of(16, 30);
	private static final OutdoorEnclosureTypes ENCLOSURETYPE = OutdoorEnclosureTypes.GrassField;
	private static final EnclosureSizes ENCLOSURESIZE = EnclosureSizes.X_LARGE;
	
	public Elephant(String name, int age, Gender gender, String desc)
	{
		super(name, age, gender, desc, DIET, VOICE, ACTION, ACTIVEFROM, ACTIVEUNTIL, ENCLOSURETYPE, ENCLOSURESIZE);
	}	
}
