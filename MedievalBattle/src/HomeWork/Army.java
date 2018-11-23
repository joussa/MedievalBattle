package HomeWork;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Army {
	List<Integer> list = new LinkedList<Integer>();
	
	Army army1;
	Army army2;
	int army_rand;
	int skill_test; 
	Random rand= new Random();
	
	public int GetSize()
	{
		return list.size();
	}
	
	public int GetSize_random()
	{
		return rand.nextInt(GetSize());	
	}
	
	public int GenerateRandom()
	{
		return list.get( GetSize_random());
	}
	
	public void AddWarrior_test(int skill_test)
	{
		list.add(skill_test);
	}
}
