package animals;

import java.time.LocalTime;

import enums.Habitats;
import enums.OutdoorEnclosureTypes;

public abstract class OutdoorAnimals extends Animals
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private OutdoorEnclosureTypes enclosureType;
	
	public OutdoorAnimals(String name, int age, String desc, String diet, String voice, String action,
			LocalTime activeFrom, LocalTime activeUntil, OutdoorEnclosureTypes enclosureType)
	{
		super(name, age, desc, diet, voice, action, HABITAT, activeFrom, activeUntil);
		this.setEnclosureType(enclosureType);
	}

	public OutdoorEnclosureTypes getEnclosureType()
	{
		return enclosureType;
	}

	public void setEnclosureType(OutdoorEnclosureTypes enclosureType)
	{
		this.enclosureType = enclosureType;
	}
	
}
