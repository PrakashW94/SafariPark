package enclosures;

import java.time.LocalDate;
import java.time.LocalTime;

import enums.Habitats;
import enums.EnclosureSizes;
import interfaces.EnclosureInterface;

public abstract class Enclosures implements EnclosureInterface
{
	private String name;
	private String desc;
	private Habitats habitat;
	private EnclosureSizes size;
	private LocalDate firstOpened;
	private LocalTime openingTime;
	private LocalTime closingTime;
	
	boolean dirty = false;
	boolean open;
	
	private int maxAnimalCapacity;
	private int maxVisitorCapacity;
	
	public Enclosures(String name, String desc, Habitats habitat, EnclosureSizes size, LocalDate firstOpened,
			LocalTime openingTime, LocalTime closingTime, int maxAnimalCapacity, int maxVisitorCapacity)
	{
		this.name = name;
		this.desc = desc;
		this.habitat = habitat;
		this.size = size;
		this.firstOpened = firstOpened;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.maxAnimalCapacity = maxAnimalCapacity;
		this.maxVisitorCapacity = maxVisitorCapacity;
	}
	
	public void clean()
	{
		this.dirty = false;
	}
	
	public void open()
	{
		this.open = true;
	}
	
	public void close()
	{
		this.open = false;
	}
}
