package animals;

import java.time.LocalTime;

import enums.EnclosureSizes;
import enums.Gender;
import enums.Habitats;
import enums.IndoorEnclosureTypes;

public abstract class IndoorAnimals extends Animals
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private IndoorEnclosureTypes enclosureType;
	private EnclosureSizes enclosureSize;
	
	public IndoorAnimals(String name, int age, Gender gender, String desc, String diet, String voice, String action,
			LocalTime activeFrom, LocalTime activeUntil, IndoorEnclosureTypes enclosureType, EnclosureSizes enclosureSize)
	{
		super(name, age, gender, desc, diet, voice, action, HABITAT, activeFrom, activeUntil);
		this.setEnclosureType(enclosureType);
		this.setEnclosureSize(enclosureSize);
	}

	public IndoorEnclosureTypes getEnclosureType()
	{
		return enclosureType;
	}

	public void setEnclosureType(IndoorEnclosureTypes enclosureType)
	{
		this.enclosureType = enclosureType;
	}

	public EnclosureSizes getEnclosureSize()
	{
		return enclosureSize;
	}

	public void setEnclosureSize(EnclosureSizes enclosureSize)
	{
		this.enclosureSize = enclosureSize;
	}
}
