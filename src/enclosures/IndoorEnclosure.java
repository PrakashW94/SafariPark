package enclosures;

import java.time.LocalDate;
import java.time.LocalTime;

import enums.Habitats;
import enums.IndoorEnclosureTypes;
import enums.EnclosureSizes;

public class IndoorEnclosure extends Enclosures
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private IndoorEnclosureTypes enclosureType;

	public IndoorEnclosure(String name, String desc, Habitats habitat, EnclosureSizes size, LocalDate firstOpened,
			LocalTime openingTime, LocalTime closingTime, int maxAnimalCapacity, int maxVisitorCapacity, 
			IndoorEnclosureTypes enclosureType)
	{
		super(name, desc, HABITAT, size, firstOpened, openingTime, closingTime, maxAnimalCapacity, maxVisitorCapacity);
		this.enclosureType = enclosureType;
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
