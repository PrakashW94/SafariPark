package implementation;

import java.util.HashMap;

import animalInstances.*;
import animals.Animals;
import enums.Gender;

public class AnimalController<T extends Animals>
{
	//public HashMap<Integer, ? extends Animals> listOfAnimals = new HashMap<Integer, T>();
	
	public static void init()
	{
		Lion l1 = new Lion("Simba", 3, Gender.MALE ,"The lion from Lion King!");
		Lion l2 = new Lion("Nala", 2, Gender.FEMALE, "The other lion from Lion King!");
		
		Elephant e1 = new Elephant("Trunks", 6, Gender.MALE, "He has a long trunk!");
		Elephant e2 = new Elephant("Dumbo", 1, Gender.FEMALE, "She can fly!");
		
		Swordfish sf1 = new Swordfish("Masamune", 7, Gender.FEMALE, "He's named after a famous sword!");
		
		
	}
}
