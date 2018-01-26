package animals;

import java.time.LocalTime;

import enums.Habitats;
import enums.IndoorEnclosureTypes;

public abstract class IndoorAnimals extends Animals
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private IndoorEnclosureTypes enclosureType;
	
	public IndoorAnimals(String name, int age, String desc, String diet, String voice, String action,
			LocalTime activeFrom, LocalTime activeUntil, IndoorEnclosureTypes enclosureType)
	{
		super(name, age, desc, diet, voice, action, HABITAT, activeFrom, activeUntil);
		this.setEnclosureType(enclosureType);
	}

	public IndoorEnclosureTypes getEnclosureType()
	{
		return enclosureType;
	}

	public void setEnclosureType(IndoorEnclosureTypes enclosureType)
	{
		this.enclosureType = enclosureType;
	}
}
