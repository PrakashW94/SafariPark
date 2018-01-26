package animals;

import java.time.LocalTime;

import enums.EnclosureSizes;
import enums.Gender;
import enums.Habitats;
import enums.OutdoorEnclosureTypes;

public abstract class OutdoorAnimals extends Animals
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private OutdoorEnclosureTypes enclosureType;
	private EnclosureSizes enclosureSize;
	
	public OutdoorAnimals(String name, int age, Gender gender, String desc, String diet, String voice, String action,
			LocalTime activeFrom, LocalTime activeUntil, OutdoorEnclosureTypes enclosureType, EnclosureSizes enclosureSize)
	{
		super(name, age, gender, desc, diet, voice, action, HABITAT, activeFrom, activeUntil);
		this.setEnclosureType(enclosureType);
		this.setEnclosureSize(enclosureSize);
	}

	public OutdoorEnclosureTypes getEnclosureType()
	{
		return enclosureType;
	}

	public void setEnclosureType(OutdoorEnclosureTypes enclosureType)
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
