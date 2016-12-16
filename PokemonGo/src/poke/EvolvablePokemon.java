package poke;

//import poke.Pokemon.EvolvablePokemon;

//public class EvolvablePokemon extends Pokemon implements Leveled_Object{
//private EvolvablePokemon pokemonAfterEvolution;
public class EvolvablePokemon extends Pokemon{	
	private Pokemon pokemonAfterEvolution;
	private final int EvolutionLevel;

	public EvolvablePokemon(String name, String type1, String type2, Ability ability1, Ability ability2, 
			int strength, int HP, int experience, int level, int evolutionLevel, EvolvablePokemon poke){

		//Initializing the superclass constructor bottom up
		super(name, type1, type2, ability1, ability2, strength,HP, experience, level);
		this.EvolutionLevel = evolutionLevel;
		this.pokemonAfterEvolution = poke;
	}

	//Method to evolve the pokemon 
	//This must be updated to fit the leveling system
	public void evolve(){
		String oldName = name;
		name = pokemonAfterEvolution.name;
		ability1 = pokemonAfterEvolution.ability1;
		ability2 = pokemonAfterEvolution.ability2;
		HP = pokemonAfterEvolution.HP;
//		HP= HP*2;
//		level = level++;
		strength=(int)(strength*1.1);
		System.out.println("\nCongratulations! "+oldName+" has evolved into "+name+"!\n");
	}
	
	public void gainExperience(int amount){
		this.experience+=amount;
//		String message = "";
		while(enoughXPForNextLevel()) 
//			message = levelUP();
			levelUP();
//		System.out.println(message);
	}
	
//	public String levelUP(){
//		
//		HP= HP*2;
//		//strength=strength*2;
//		level=level++;
//		evolve();
//		return "You are now at level "+level;
//	}
	
	public boolean enoughXPForNextLevel(){
		return this.experience>=XPNeededForEvolutionPokemon[level];
	}

	//	public EvolvablePokemon(String name, double combatPower, String abilityName, int HP, Pokemon nextPokemon, int level)
	//	{
	//		super(name,combatPower,abilityName,HP);
	//		this.pokemonAfterEvolution=nextPokemon;
	//		this.EvolutionLevel=level;
	//	}

	public Pokemon getPokemonAfterEvolution(){
		return pokemonAfterEvolution;
	}
//	
//	//We should go over how gainExperience works. Where is the "amount" variable determined?
//	//The "amount" of experience gained should be some multiplier of the opponentPokemon's level
//	//For instance:
//	//amount=opponentPokemon.getLevel*10
//	public void gainExperience(int amount){
//		
//		this.experience+=amount;
//		while(enoughXPForNextLevel()) 
//			levelUP();
//		
	public void levelUP(){
		super.levelUP();
		if (enoughLevelForEvolution())
			evolve();
	}

	private boolean enoughLevelForEvolution(){
		return getLevel()==EvolutionLevel;
	}
//
//	public void evolve(){
//		if(pokemonAfterEvolution!=null){
//			String oldName=getName();
//			String newName=pokemonAfterEvolution.getName();
//			
//			double newCP=pokemonAfterEvolution.getCP();
//			
//			Ability newAbility=pokemonAfterEvolution.getAbility();
//			
//			int newHP=pokemonAfterEvolution.getHP();
//			
//			Pokemon newPokemon=null;
//			
//			if(pokemonAfterEvolution instanceof EvolvablePokemon)
//				newPokemon=((EvolvablePokemon)pokemonAfterEvolution).getPokemonAfterEvolution();
//
//			setName(newName);
//			setCP(newCP);
//			setAbility(newAbility.getAbilityName());
//			this.pokemonAfterEvolution=newPokemon;
//			System.out.println("\nCongratulations! "+oldName+" has evolved into "+newName+"!\n");
//		}
//		else{
//			System.out.println("The pokemon does not evolve!");
//		}
//	}
//
	public String toString(){
		return super.toString();
	}
}
