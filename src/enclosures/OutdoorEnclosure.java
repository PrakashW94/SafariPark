package enclosures;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

import animals.OutdoorAnimals;
import enums.Habitats;
import enums.OutdoorEnclosureTypes;
import enums.EnclosureSizes;

public class OutdoorEnclosure<T extends OutdoorAnimals> extends Enclosures
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private OutdoorEnclosureTypes enclosureType;
	
	private HashMap<Integer, T> listOfAnimals;
	
	public OutdoorEnclosure(String name, String desc, EnclosureSizes size, LocalDate firstOpened,
			LocalTime openingTime, LocalTime closingTime, int maxAnimalCapacity, int maxVisitorCapacity,
			OutdoorEnclosureTypes enclosureType)
	{
		super(name, desc, HABITAT, size, firstOpened, openingTime, closingTime, maxAnimalCapacity, maxVisitorCapacity);
		this.enclosureType = enclosureType;
		listOfAnimals = new HashMap<Integer, T>();
	}

	public OutdoorEnclosureTypes getEnclosureType()
	{
		return enclosureType;
	}

	public void setEnclosureType(OutdoorEnclosureTypes enclosureType)
	{
		this.enclosureType = enclosureType;
	}	
	
	public void addAnimal(T animal)
	{
		listOfAnimals.put(animal.getId(), animal);
	}
	
	public void removeAnimal(int animalId)
	{
		listOfAnimals.remove(animalId);
	}
}
