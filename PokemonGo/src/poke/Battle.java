package poke;
//Comment for test
import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;

//This will be the parent class for the Trainer_Battle and Wild_Battle
public class Battle {

	//	//Create local variables to identify the user's pokemon and their opponent's pokemon
	public String selectedAbility;
	public Pokemon userPokemon;
	public Pokemon opponentPokemon;
	public Pokeballs pokeballObj = new Pokeballs(null, 0, 0);

	//Flag for battle
	int flag = 1;

	//public Player playerObj = new Player()

	//initialize and array of String variables to store the names of the types
	//This will be necessary to look up those types in the "multiplier" matrix that follows
	String types[] = new String [19];{
		types[0]="Bug";
		types[1]="Dark";
		types[2]="Dragon";
		types[3]="Electric";
		types[4]="Fairy";
		types[5]="Fighting";
		types[6]="Fire";
		types[7]="Flying";
		types[8]="Ghost";
		types[9]="Grass";
		types[10]="Ground";
		types[11]="Ice";
		types[12]="Normal";
		types[13]="Poison";
		types[14]="Psychic";
		types[15]="Rock";
		types[16]="Steel";
		types[17]="Water";
		types[18]="None";
	}

	//This matrix (or 2-dimensional array) stores the type-based damage multipliers to be used in battle 
	double[][] multiplier = {
			{1,2,1,1,0.5,0.5,0.5,0.5,0.5,2,1,1,1,0.5,2,1,0.5,1,1},
			{1,0.5,1,1,0.5,0.5,1,1,2,1,1,1,1,1,2,1,1,1,1},
			{1,1,2,1,0,1,1,1,1,1,1,1,1,1,1,1,0.5,1,1},
			{1,1,0.5,0.5,1,1,1,2,1,0.5,0,1,1,1,1,1,1,2,1},
			{1,2,2,1,1,2,0.5,1,1,1,1,1,1,0.5,1,1,0.5,1,1},
			{0.5,2,1,1,0.5,1,1,0.5,0,1,1,2,2,0.5,0.5,2,2,1,1},
			{2,1,0.5,1,1,1,0.5,1,1,2,1,2,1,1,1,0.5,2,0.5,1},
			{2,1,1,0.5,1,2,1,1,1,2,1,1,1,1,1,0.5,0.5,1,1},
			{1,0.5,1,1,1,1,1,1,2,1,1,1,0,1,2,1,1,1,1},
			{0.5,1,0.5,1,1,1,0.5,0.5,1,0.5,2,1,1,0.5,1,2,0.5,2,1},
			{0.5,1,1,2,1,1,2,0,1,0.5,1,1,1,2,1,2,2,1,1},
			{1,1,2,1,1,1,0.5,2,1,2,2,0.5,1,1,1,1,0.5,0.5,1},
			{1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0.5,0.5,1,1},
			{1,1,1,1,2,1,1,1,0.5,2,0.5,1,1,0.5,1,0.5,0,1,1},
			{1,0,1,1,1,2,1,1,1,1,1,1,1,2,0.5,1,0.5,1,1},
			{2,1,1,1,1,0.5,2,2,1,1,0.5,2,1,1,1,1,0.5,1,1},
			{1,1,1,0.5,2,1,0.5,1,1,1,1,2,1,1,1,2,0.5,0.5,1},
			{1,1,0.5,1,1,1,2,1,1,0.5,2,1,1,1,1,2,1,0.5,1}};

	//Initialize every ability-type object that will be used in this game
	Ability ability0 = new Ability("Bug Bite","Bug",30);
	Ability ability1 = new Ability("Struggle Bug","Bug",60);
	Ability ability2 = new Ability("Bite","Dark",60);
	Ability ability3 = new Ability("Night Slash","Dark",85);
	Ability ability4 = new Ability("Dragon Rage","Dragon",90);
	Ability ability5 = new Ability("Dragon Breath","Dragon",60);
	Ability ability6 = new Ability("Thunder Shock","Electric",50);
	Ability ability7 = new Ability("Thunderbold","Electric",95);
	Ability ability8 = new Ability("Disarming Voice","Fairy",40);
	Ability ability9 = new Ability("Dazzling Gleam","Fairy",80);
	Ability ability10 = new Ability("Karate Chop","Fighting",50);
	Ability ability11 = new Ability("Jump Kick","Fighting",100);
	Ability ability12 = new Ability("Flamethrower","Fire",95);
	Ability ability13 = new Ability("Wing Attack","Flying",75);
	Ability ability14 = new Ability("Peck","Flying",65);
	Ability ability15 = new Ability("Nigh Shade","Ghost",55);
	Ability ability16 = new Ability("Shadow Ball","Ghost",85);
	Ability ability17 = new Ability("Bullet Seed","Grass",50);
	Ability ability18 = new Ability("Razor Lead","Grass",75);
	Ability ability19 = new Ability("Solarbeam","Grass",120);
	Ability ability20 = new Ability("Mud Shot","Ground",40);
	Ability ability21 = new Ability("Earthquake","Ground",100);
	Ability ability22 = new Ability("Ice Shard","Ice",65);
	Ability ability23 = new Ability("Blizzard","Ice",120);
	Ability ability24 = new Ability("Tackle","Normal",40);
	Ability ability25 = new Ability("Skull Bash","Normal",75);
	Ability ability26 = new Ability("Double-edged","Normal",90);
	Ability ability27 = new Ability("Acid","Poison",50);
	Ability ability28 = new Ability("Sludge Bomb","Poison",90);
	Ability ability29 = new Ability("Telekenesis","Psychic",60);
	Ability ability30 = new Ability("Psychic","Psychic",90);
	Ability ability31 = new Ability("Rock Throw","Rock",50);
	Ability ability32 = new Ability("Rock Slide","Rock",75);
	Ability ability33 = new Ability("Rock Tomb","Rock",70);
	Ability ability34 = new Ability("Steel Wing","Steel",75);
	Ability ability35 = new Ability("Metal Claw","Steel",80);
	Ability ability36 = new Ability("Water Gun","Water",40);
	Ability ability37 = new Ability("Surf","Water",85);
	Ability ability38 = new Ability("Hydro Pump","Water",120);
	Ability ability39 = new Ability("Aqua Jet","Water",75);
	Ability ability40 = new Ability("Fly","Flying",90);
	Ability ability41 = new Ability("Crunch","Dark",80);
	Ability ability42 = new Ability("Fire Spin","Fire",60);
	Ability ability43 = new Ability("Draco Meteor","Dragon",120);
	Ability ability44 = new Ability("Confusion","Psychic",50);
	Ability ability45 = new Ability("Dig","Ground",80);
	Ability ability46 = new Ability("Scratch","Normal",50);
	Ability ability47 = new Ability("Fire Blast","Fire",110);
	Ability ability48 = new Ability("Bullet Punch","Fighting",60);
	Ability ability49 = new Ability("Magnet Bomb","Steel",70);
	Ability ability50 = new Ability("Thunder Punch","Electric",75);

	Ability[] abilityList= {ability0,ability1,ability2,ability3,ability4,ability5,ability6,ability7,ability8,ability9,ability10,
			ability11,ability12,ability13,ability14,ability15,ability16,ability17,ability18,ability19,ability20,ability21,ability22,
			ability23,ability24,ability25,ability26,ability27,ability28,ability29,ability30,ability31,ability32,ability33,ability34,
			ability35,ability36,ability37,ability38,ability39,ability40,ability41,ability42,ability43,ability44,ability45,ability46,
			ability47,ability48,ability49,ability50};

	//			//Create an array to store all of the pokemon
	//			Pokemon[] pokemonList={Bulbasaur,Ivysaur,Squirtle,Wartortle,Charmander,Charmeleon,Scyther,Scizor,Onix,Electabuzz,Haunter,Lapras,
	//					Hitmonchan,Hitmonlee,Drowzee,Snorlax,Mew,Jigglypuff,Zapdos,Articuno,Moltres,Hippowodon,Absol,Magnemite,Goodra,Diglett,
	//					Pinsir,Shuckle,Tauros,Magmar,Starmie,Aerodactyl,Muk,Aggron,Tropius,Mankey};
	//

	//	public int getAbilityTypeIndex(String abilityTypeParameter){
	//		
	//		if (abilityTypeParameter == "Bug"){
	//			return 0;
	//		}
	//		else (abilityTypeParameter == "Bug")
	//		
	//		}


	public void startBattle(Pokemon userPokemon, Pokemon opponentPokemon, int index1, int index2, int index3, int index4, int index5, int index6, Player playerObj){

		this.userPokemon = userPokemon;
		this.opponentPokemon = opponentPokemon;
		
		System.out.println("You are:"+this.userPokemon.getName());
		System.out.println("You are fighting against:"+this.opponentPokemon.getName());
		//System.out.println("we are now in Battle class");
		System.out.println("\nLet the battle begin!");

		while (flag !=0){
			System.out.println("What will you do?");
			System.out.println(" 1: Attack \n 2: Use Potion\n 3: Use Pokeball");
			
			//accept's the user's selection and stores it locally
			Scanner reader = new Scanner (System.in);
			int selection = reader.nextInt();

			//Applies the user's selection, and names the user's first pokemon accordingly
			switch(selection)
			{
			case 1:
				System.out.println("You attack first on "+this.opponentPokemon.getName());
				int userPokemonDamage = (int)(this.userPokemon.getAbility1().getAbilityPower()*this.userPokemon.getStrength()*multiplier[index1][index2]*multiplier[index1][index3])/100;
				int opponentPokemonDamage = (int)(this.opponentPokemon.getAbility1().getAbilityPower()*this.opponentPokemon.getStrength()*multiplier[index4][index5]*multiplier[index4][index6])/100;
				this.opponentPokemon.reduceHP(userPokemonDamage);
				
				//After each attack, the player gains a random experience
				checkEvolutionAndPlayerXPStatus(playerObj);
			
				System.out.println("\n\nScore:\n"+this.userPokemon.getName()+": "+this.userPokemon.getHP()+"\t\t"+this.opponentPokemon.getName()+": "+this.opponentPokemon.getHP());
				System.out.println(this.opponentPokemon.getName()+"'s turn to attack you");
				this.userPokemon.reduceHP(opponentPokemonDamage);
				System.out.println("\n\nScore:\n"+this.userPokemon.getName()+": "+this.userPokemon.getHP()+"\t\t"+this.opponentPokemon.getName()+": "+this.opponentPokemon.getHP());
				
				checkWinner(0);
				break;

			case 2: 
//				System.out.println("Switch case 2 for Potions");
				Potions potionObj = new Potions();
//				this.userPokemon = potionObj.usePotions(this.userPokemon);
				potionObj.usePotions(this.userPokemon);
				checkWinner(0);
				flag =1;
				break;

			case 3: 
				//System.out.println("Switch case 3 for Use Pokeballs");
				//prompt pokeball selection
				pokeballObj.usePokeballs(opponentPokemon);
				flag = 1;
				if(pokeballObj.getCaughtStatus() == true)
					flag = 0;
				break;
			default:
				System.out.println("Not a valid option");
				flag = 1;
			}
		}
	}

	public void checkWinner(int flag){
		if(this.userPokemon.getHP()<=0){
			flag = 0;
			//System.out.println("Score:\n"+this.userPokemon.getName()+": "+this.userPokemon.getHP()+"\t\t"+this.opponentPokemon.getName()+": "+this.opponentPokemon.getHP());
			System.out.println("Game Over...You are out of HP\n");
			System.exit(0);
			return;
		}
		else if(this.opponentPokemon.getHP()<=0){
			flag = 0;
			//System.out.println("Score:\n"+this.userPokemon.getName()+": "+this.userPokemon.getStrength()+"\t\t"+this.opponentPokemon.getName()+": "+this.opponentPokemon.getStrength());
			System.out.println("You won against "+this.opponentPokemon.getName());
			return;
		}
//		else{System.out.println("\n 1: Attack \n 2: Use Potion\n 3: Use Pokeball");}
	}
	
	public void checkEvolutionAndPlayerXPStatus(Player playerObj){
		playerObj.gainExperience(50 + (int)(Math.random() * 150));
		userPokemon.gainExperience(1 + (int)(Math.random() * 9));
	}
}
