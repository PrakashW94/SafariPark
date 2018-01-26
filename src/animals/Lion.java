package animals;

import java.time.LocalTime;

import enums.EnclosureSizes;
import enums.Gender;
import enums.OutdoorEnclosureTypes;

public class Lion extends OutdoorAnimals
{
	private static final String VOICE = "ROAAAR!";
	private static final String ACTION = "Looks around majestically!";
	private static final LocalTime ACTIVEFROM = LocalTime.of(07, 30);
	private static final LocalTime ACTIVEUNTIL = LocalTime.of(19, 30);
	private static final OutdoorEnclosureTypes ENCLOSURETYPE = OutdoorEnclosureTypes.Savannah;
	private static final EnclosureSizes ENCLOSURESIZE = EnclosureSizes.X_LARGE;
	private static final String DIET = "Meat";
	
	public Lion(String name, int age, Gender gender, String desc)
	{
		super(name, age, gender, desc, DIET, VOICE, ACTION, ACTIVEFROM, ACTIVEUNTIL, ENCLOSURETYPE, ENCLOSURESIZE);
	}

}
