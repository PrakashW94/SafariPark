package animals;

import java.time.LocalTime;

import enums.Habitats;
import interfaces.AnimalInterface;

public abstract class Animals implements AnimalInterface
{
	private String name;
	private int age;
	private String desc;
	private String diet;
	
	private String voice;
	private String action;
	
	private Habitats habitat;
	
	private LocalTime activeFrom;
	private LocalTime activeUntil;
	
	public Animals(String name, int age, String desc, String diet, String voice, String action, Habitats habitat,
			LocalTime activeFrom, LocalTime activeUntil)
	{
		this.name = name;
		this.age = age;
		this.desc = desc;
		this.diet = diet;
		this.voice = voice;
		this.action = action;
		this.habitat = habitat;
		this.activeFrom = activeFrom;
		this.activeUntil = activeUntil;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getDesc()
	{
		return desc;
	}

	public void setDesc(String desc)
	{
		this.desc = desc;
	}

	public String getDiet()
	{
		return diet;
	}

	public void setDiet(String diet)
	{
		this.diet = diet;
	}

	public String getVoice()
	{
		return voice;
	}

	public void setVoice(String voice)
	{
		this.voice = voice;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public Habitats getHabitat()
	{
		return habitat;
	}

	public void setHabitat(Habitats habitat)
	{
		this.habitat = habitat;
	}

	public LocalTime getActiveFrom()
	{
		return activeFrom;
	}

	public void setActiveFrom(LocalTime activeFrom)
	{
		this.activeFrom = activeFrom;
	}

	public LocalTime getActiveUntil()
	{
		return activeUntil;
	}

	public void setActiveUntil(LocalTime activeUntil)
	{
		this.activeUntil = activeUntil;
	}
	
}
