package enclosures;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

import animals.IndoorAnimals;
import enums.Habitats;
import enums.IndoorEnclosureTypes;
import enums.EnclosureSizes;

public class IndoorEnclosure<T extends IndoorAnimals> extends Enclosures
{
	private static final Habitats HABITAT = Habitats.INDOOR;
	private IndoorEnclosureTypes enclosureType;

	private HashMap<Integer, T> listOfAnimals;
	
	public IndoorEnclosure(String name, String desc, Habitats habitat, EnclosureSizes size, LocalDate firstOpened,
			LocalTime openingTime, LocalTime closingTime, int maxAnimalCapacity, int maxVisitorCapacity, 
			IndoorEnclosureTypes enclosureType)
	{
		super(name, desc, HABITAT, size, firstOpened, openingTime, closingTime, maxAnimalCapacity, maxVisitorCapacity);
		this.enclosureType = enclosureType;
		listOfAnimals = new HashMap<Integer, T>();
	}
	
	public IndoorEnclosureTypes getEnclosureType()
	{
		return enclosureType;
	}

	public void setEnclosureType(IndoorEnclosureTypes enclosureType)
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
