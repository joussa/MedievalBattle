package HomeWork;

public class testo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Army army1 = new Army();
		Army army2 = new Army();
		
		
		army1.AddWarrior_test(4);
		army1.AddWarrior_test(3);
		army1.AddWarrior_test(5);
		
		army2.AddWarrior_test(6);
		army2.AddWarrior_test(8);

		Battle battle = new Battle(army1, army2);
		
		battle.simulate();
		
	}

}


