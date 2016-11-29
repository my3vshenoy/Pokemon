
package poke;

public class Pokemon {

	/**
	 * @param args
	 */
	//	public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	//		System.out.println("Welcome to Pokemon Go\n");
	//		System.out.println("Let the coding begin");
	//		public class Pokemon {
	//declaring the instance variables (or attributes) of the pokemon
	private String name;
	private String type1;
	private String type2;
	private Ability ability1;
	private Ability ability2;
	private int strength;
	private int HP;
	private int level;

	//constructor initializes the variables
	public Pokemon (String name, String type1, String type2, String ability1, String ability2, int strength, int HP, int level)
	{
		this.name = name;
		this.type1= type1;
		this.type2= type2;
		this.ability1 = ability1;
		this.ability2 = ability2;
		this.strength = strength;
		this.HP = HP;
		this.level= level;
	}

	//Set method to set the value each of the three instance variables 
	public void setName(String name)
	{this.name = name;}	
	
	public void setType1(String type1)
	{this.type1 = type1;}
	
	public void setType2(String type2)
	{this.type2 = type2;}
	
	public void setAbility1(String ability1)
	{this.ability1 = ability1;}
	
	public void setAbility2(String ability2)
	{this.ability2 = ability2;}
	
	public void setHP(int HP)
	{this.HP = HP;}	
	
	public void setStrength(int strength)
	{this.strength = strength;}
	
	public void setLevel(int level)
	{this.level = level;}

	//Get method to retrieve the value of each instance variable
	public String getName()
	{return name;}

	public String getType1()
	{return type1;}

	public String getType2()
	{return type2;}

	public String getAbility1()
	{return ability1;}

	public String getAbility2()
	{return ability2;}

	public int getHP()
	{return HP;}	

	public int getStrength()
	{return strength;}

	public int getLevel()
	{return level;}


	class EvolvablePokemon extends Pokemon{

		private EvolvablePokemon pokemonAfterEvolution;
		private final int EvolutionLevel;

		public EvolvablePokemon(String name, String type1, String type2, Ability ability1, Ability ability2, 
				int strength, int level, int evolutionLevel, EvolvablePokemon poke){

			//Initializing the superclass constructor bottom up
			super(name, type1, type2, ability1, ability2, strength, level);
			this.pokemonAfterEvolution = poke;
		}

		//Method to evolve the pokemon 
		//This must be updated to fit the leveling system
		public void evolve(){

			name = pokemonAfterEvolution.name;
			combatPower = pokemonAfterEvolution.combatPower;
			ability = pokemonAfterEvolution.ability;
			hitPoint = pokemonAfterEvolution.hitPoint;

		}

		//	private Pokemon pokemonAfterEvolution;


		//	public EvolvablePokemon(String name, double combatPower, String abilityName, int HP, Pokemon nextPokemon, int level)
		//	{
		//		super(name,combatPower,abilityName,HP);
		//		this.pokemonAfterEvolution=nextPokemon;
		//		this.EvolutionLevel=level;
		//	}

		public Pokemon getPokemonAfterEvolution(){
			return pokemonAfterEvolution;
		}

		public void levelUP(){
			super.levelUP();
			if (enoughLevelForEvolution())
				evolve();
		}

		private boolean enoughLevelForEvolution(){
			return getLevel()==EvolutionLevel;
		}

		public void evolve(){
			if(pokemonAfterEvolution!=null){
				String oldName=getName();
				String newName=pokemonAfterEvolution.getName();
				
				double newCP=pokemonAfterEvolution.getCP();
				
				Ability newAbility=pokemonAfterEvolution.getAbility();
				
				int newHP=pokemonAfterEvolution.getHP();
				
				Pokemon newPokemon=null;
				
				if(pokemonAfterEvolution instanceof EvolvablePokemon)
					newPokemon=((EvolvablePokemon)pokemonAfterEvolution).getPokemonAfterEvolution();

				setName(newName);
				setCP(newCP);
				setAbility(newAbility.getAbilityName());
				this.pokemonAfterEvolution=newPokemon;
				System.out.println("\nCongratulations! "+oldName+" has evolved into "+newName+"!\n");
			}
			else{
				System.out.println("The pokemon does not evolve!");
			}
		}

		public String toString(){
			return super.toString();
		}

	}


