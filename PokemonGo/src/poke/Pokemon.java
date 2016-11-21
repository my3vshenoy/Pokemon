/**
 * 
 */
package poke;

/**
 * @author my3shenoy
 *
 */
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
			private String ability1;
			private String ability2;
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
		
public void battle()
{
	//Create local variables to identify the user's pokemon and their opponent's pokemon
	final String selectedAbility;
	final Pokemon userPokemon;
	final Pokemon opponentPokemon;
	
	System.out.println("Let the battle begin!");
	System.out.println("What will you do?");
	System.out.printf(" 1: Attack %n 2: Use Potion%n 3: ");
	
}
}


