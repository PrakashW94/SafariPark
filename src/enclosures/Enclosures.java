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
	
	private boolean dirty = false;
	private boolean open;
	
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
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDesc()
	{
		return desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	public Habitats getHabitat()
	{
		return habitat;
	}

	public void setHabitat(Habitats habitat)
	{
		this.habitat = habitat;
	}

	public EnclosureSizes getSize()
	{
		return size;
	}

	public void setSize(EnclosureSizes size)
	{
		this.size = size;
	}

	public LocalDate getFirstOpened()
	{
		return firstOpened;
	}

	public void setFirstOpened(LocalDate firstOpened)
	{
		this.firstOpened = firstOpened;
	}

	public LocalTime getOpeningTime()
	{
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime)
	{
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime()
	{
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime)
	{
		this.closingTime = closingTime;
	}

	public boolean isDirty()
	{
		return dirty;
	}

	public void setDirty(boolean dirty)
	{
		this.dirty = dirty;
	}

	public boolean isOpen()
	{
		return open;
	}

	public void setOpen(boolean open)
	{
		this.open = open;
	}

	public int getMaxAnimalCapacity()
	{
		return maxAnimalCapacity;
	}

	public void setMaxAnimalCapacity(int maxAnimalCapacity)
	{
		this.maxAnimalCapacity = maxAnimalCapacity;
	}

	public int getMaxVisitorCapacity()
	{
		return maxVisitorCapacity;
	}

	public void setMaxVisitorCapacity(int maxVisitorCapacity)
	{
		this.maxVisitorCapacity = maxVisitorCapacity;
	}
	
	public void clean()
	{
		this.dirty = false;
	}
	
	public void open()
	{
		setOpen(true);
	}
	
	public void close()
	{
		setOpen(false);
	}
}
