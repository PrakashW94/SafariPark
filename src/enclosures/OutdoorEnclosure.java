package enclosures;

import java.time.LocalDate;
import java.time.LocalTime;

import enums.Habitats;
import enums.OutdoorEnclosureTypes;
import enums.EnclosureSizes;

public class OutdoorEnclosure extends Enclosures
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private OutdoorEnclosureTypes enclosureType;
	
	public OutdoorEnclosure(String name, String desc, EnclosureSizes size, LocalDate firstOpened,
			LocalTime openingTime, LocalTime closingTime, int maxAnimalCapacity, int maxVisitorCapacity,
			OutdoorEnclosureTypes enclosureType)
	{
		super(name, desc, HABITAT, size, firstOpened, openingTime, closingTime, maxAnimalCapacity, maxVisitorCapacity);
		this.enclosureType = enclosureType;
	}

	public OutdoorEnclosureTypes getEnclosureType()
	{
		return enclosureType;
	}

	public void setEnclosureType(OutdoorEnclosureTypes enclosureType)
	{
		this.enclosureType = enclosureType;
	}

	public Habitats getHabitat()
	{
		return HABITAT;
	}
	
}
