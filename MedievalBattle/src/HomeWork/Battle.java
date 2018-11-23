package HomeWork;

public class Battle extends Army {
	
	  public Battle(Army n_army1, Army n_army2)
	{
	  army1 = n_army1;
	  army2 = n_army2;
	} 
	  
	public int choosen_fighters_army1 ()
	{
		return army1.GenerateRandom();
	}
	
	public int choosen_fighters_army2 ()
	{
		return army2.GenerateRandom();
	}
	
	public void print_army()
	{
	int i = 0;
	 System.out.println("army1 : ");
	while (i < army1.GetSize()) { //print army1
		 System.out.print("[" + army1.list.get(i) + "]" + "  ");
		 i++;
		} 
	System.out.print("\n");
	System.out.println("army2 : ");
	i=0;
	while (i < army2.GetSize()) { //print army2
		System.out.print("[" + army2.list.get(i) + "]" + "  ");
		 i++;
		} 
	}
	

	public void simulate()
	{
	//	choosen_fighters_army1();
	//	choosen_fighters_army2();

		int warrior_army1;
		int warrior_army2;
		int i = 0;
		
		while (army1.GetSize()>0 && army2.GetSize()>0)
		{		
		System.out.println("Round : " + i);
		System.out.print("\n");
		print_army();
		System.out.print("\n");
		warrior_army1 = choosen_fighters_army1();
		warrior_army2 = choosen_fighters_army2();
		System.out.println("army's 1 warrior : " + warrior_army1);
		System.out.println("army's 2 warrior : " + warrior_army2);
	


		if (warrior_army1 > warrior_army2)
		{
			army2.list.remove((Integer) warrior_army2);
			System.out.print("army 1 win ! \n");
		}
		else 
			{
			if (warrior_army1 < warrior_army2)
			{
			army1.list.remove((Integer) warrior_army1);
			System.out.print("army 2 win ! \n");
			}
			else  //in this case when the two warriors have the same skill level, both of them die
			{
				army2.list.remove((Integer) warrior_army2);
				army1.list.remove((Integer) warrior_army1);
				System.out.print("army 1 and army 2 are equal ! \n");
			}
			}
		System.out.print("\n");
		System.out.print("After the round : " + i + "\n");	
		i++;
		print_army();
		System.out.print("\n");
		System.out.println("-----------------------------------------------------------------------------------------");
	}
		if (army1.GetSize() == 0 && army2.GetSize() == 0)
			System.out.print("There's no winner !");
			else 
			{
				if (army2.GetSize() == 0)
					System.out.print("army 1 win the battle!");
					else 
					System.out.print("army 2 win the battle!");
			}
	}
	
}
