package animals;

import java.time.LocalTime;

import enums.Gender;
import enums.Habitats;
import interfaces.AnimalInterface;

public abstract class Animals implements AnimalInterface
{
	private String name;
	private int age;
	private Gender gender;
	private String desc;
	private String diet;
	
	private String voice;
	private String action;
	
	private Habitats habitat;
	
	private LocalTime activeFrom;
	private LocalTime activeUntil;
	
	public Animals(String name, int age, Gender gender, String desc, String diet, String voice, String action,
			Habitats habitat, LocalTime activeFrom, LocalTime activeUntil)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public void talk()
	{
		System.out.println(voice);;
	}

	public void setVoice(String voice)
	{
		this.voice = voice;
	}

	public void doAction()
	{
		System.out.println(this.action);
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

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	
}
