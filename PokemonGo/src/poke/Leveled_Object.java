package poke;

public interface Leveled_Object {

	
		int[] XPNeededForNextLevelPlayer={0,100,200,300,400,500,600,700,800,900,Integer.MAX_VALUE};
	    int[] XPNeededForEvolutionPokemon = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, Integer.MAX_VALUE};
		//Declaration of methods that will be implemented in the classes that implement this interface
		String getName();
		void gainExperience(int amount);
		void levelUP();
		boolean enoughXPForNextLevel();
//		public void gainExperience(int amount);
//		public String levelUP();
//		public boolean enoughXPForNextLevel();
}
