package poke;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.io.*;
import java.io.IOException;
//

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class PokemonGo {

	public static void main(String[] args) {

		Pokemon[] pokemonTeamBefore = new Pokemon[100];
		Pokemon[] pokemonTeamAfter = new Pokemon[100];

		Pokemon opponentPokemon;
		Player playerObj =  new Player("Player 1");
		Battle batteObj = new Battle();
		PokeStore shopObj = new PokeStore();
//		EvolvablePokemon ePokemon = new EvolvablePokemon("Ivysaur","Grass","Poison",null,null,156,350,0,3,100,null);
		Scanner reader1 = new Scanner(System.in);
		
		//Flag for user to exit the game. Can have 0 or 1
		int flag = 1;

		String types[] = new String [19];
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

		//		//Initialize all of the pokemon objects	
		EvolvablePokemon Ivysaur = new EvolvablePokemon("Ivysaur","Grass","Poison",abilityList[18],abilityList[19],156,350,0,3,100,null);
		EvolvablePokemon Bulbasaur = new EvolvablePokemon("Bulbasaur","Grass","None",abilityList[18],abilityList[24],126,220,0, 1,3,Ivysaur);	
		EvolvablePokemon Wartortle = new EvolvablePokemon("Wartortle","Water","None",abilityList[25],abilityList[38],144,350,0,3,100,null);
		EvolvablePokemon Squirtle = new EvolvablePokemon("Squirtle","Water","None",abilityList[25],abilityList[36],112,220,0, 1,3,Wartortle);
		EvolvablePokemon Charmeleon = new EvolvablePokemon("Charmeleon","Fire","None",abilityList[42],abilityList[47],160,350,0, 3,100,null);
		EvolvablePokemon Charmander = new EvolvablePokemon("Charmander","Fire","None",abilityList[46],abilityList[40],128,220,0, 1,3,Charmeleon);
		EvolvablePokemon Scizor = new EvolvablePokemon("Scizor","Bug","Steel",abilityList[3],abilityList[34],210,400, 0, 4,100,null);
		EvolvablePokemon Scyther = new EvolvablePokemon("Scyther","Bug","Flying",abilityList[30],abilityList[13],176,250,0, 1,3, Scizor);
		Pokemon Onix = new Pokemon("Onix","Ground","Rock",abilityList[31],abilityList[21],90,480,0,2);
		Pokemon Electabuzz = new Pokemon("Electabuzz","Electric","None",abilityList[6],abilityList[7],198,325,0,3);
		Pokemon Haunter = new Pokemon("Haunter","Ghost","Poison",abilityList[15],abilityList[16],172,400,0,4);
		Pokemon Lapras = new Pokemon("Lapras","Water","Ice",abilityList[22],abilityList[37],186,300,0,2);
		Pokemon Hitmonchan = new Pokemon("Hitmonchan","Fighting","None",abilityList[48],abilityList[50],138,340,0,2);
		Pokemon Hitmonlee = new Pokemon("Hitmonlee","Fighting","None",abilityList[11],abilityList[25],148,340,0,2);
		Pokemon Drowzee = new Pokemon("Drowzee","Psychic","None",abilityList[29],abilityList[44],104,275,0,1);
		Pokemon Snorlax = new Pokemon("Snorlax","Normal","None",abilityList[26],abilityList[41],180,550,0,3);
		Pokemon Mew = new Pokemon("Mew","Psychic","None",abilityList[30],abilityList[7],250,900,0,10);
		Pokemon Jigglypuff = new Pokemon("Jigglypuff","Fairy","None",abilityList[8],abilityList[9],98,175,0,1);
		Pokemon Zapdos = new Pokemon("Zapdos","Electric","Flying",abilityList[40],abilityList[7],232,480,0,7);
		Pokemon Articuno = new Pokemon("Articuno","Ice","Flying",abilityList[13],abilityList[23],225,480,0,7);
		Pokemon Moltres = new Pokemon("Moltres","Fire","Flying",abilityList[13],abilityList[47],242,480,0,7);
		Pokemon Hippowodon = new Pokemon("Hippowodon","Ground","None",abilityList[41],abilityList[21],220,390,0,4);
		Pokemon Absol = new Pokemon("Absol","Dark","None",abilityList[3],abilityList[45],195,275,0,3);
		Pokemon Magnemite = new Pokemon("Magnemite","Electric","Steel",abilityList[6],abilityList[49],128,230,0,1);
		Pokemon Goodra = new Pokemon("Goodra","Dragon","None",abilityList[5],abilityList[43],195,300,0,5);
		Pokemon Diglett = new Pokemon("Diglett","Ground","None",abilityList[45],abilityList[20],108,190,0,1);
		Pokemon Pinsir = new Pokemon("Pinsir","Bug","None",abilityList[0],abilityList[1],184,200,0,1);
		Pokemon Shuckle = new Pokemon("Shuckle","Bug","Rock",abilityList[31],abilityList[1],50,500,0,3);
		Pokemon Tauros = new Pokemon("Tauros","Normal","None",abilityList[2],abilityList[26],148,215,0,2);
		Pokemon Magmar = new Pokemon("Magmar","Fire","None",abilityList[47],abilityList[12],214,230,0,2);
		Pokemon Starmie = new Pokemon("Starmie","Water","Psychic",abilityList[30],abilityList[39],194,300,0,5);
		Pokemon Aerodactyl = new Pokemon("Aerodactyl","Flying","Rock",abilityList[14],abilityList[33],182,282,0,4);
		Pokemon Muk = new Pokemon("Muk","Poison","None",abilityList[27],abilityList[28],180,290,0,3);
		Pokemon Aggron = new Pokemon("Aggron","Steel","Rock",abilityList[35],abilityList[32],205,520,0,6);
		Pokemon Tropius = new Pokemon("Tropius","Grass","Flying",abilityList[17],abilityList[4],120,250,0,3);
		Pokemon Mankey = new Pokemon("Mankey","Fighting","None",abilityList[10],abilityList[26],122,220,0,3);

		//Create an array to store all of the pokemon
		Pokemon[] pokemonList={Bulbasaur,Ivysaur,Squirtle,Wartortle,Charmander,Charmeleon,Scyther,Scizor,Onix,Electabuzz,Haunter,Lapras,
				Hitmonchan,Hitmonlee,Drowzee,Snorlax,Mew,Jigglypuff,Zapdos,Articuno,Moltres,Hippowodon,Absol,Magnemite,Goodra,Diglett,
				Pinsir,Shuckle,Tauros,Magmar,Starmie,Aerodactyl,Muk,Aggron,Tropius,Mankey};

		// This is the start of the user interface
		//It will prompt the user to select a starting pokemon, 
		//then add that pokemon to their team
		System.out.println("Welcome to the world of Pokemon\n");
		System.out.println("Enter Player name:");
		playerObj.setName(reader1.nextLine());
		System.out.println("Hey "+playerObj.getName()+",  It's time to explore!");
		System.out.println("But wait! It's dangerous out there! Take one of these:");

		//Display images of the three starter pokemon
		System.out.println(" 1: Bulbasaur  2: Squirtle  3: Charmander");
		System.out.println("Which one will you choose?");

		//accepts the user's selection
		
		int selection;
		
		while (flag != 0){
		selection = reader1.nextInt();


		switch(selection){
		case 1:
			System.out.println("You've chosen Bulbasaur, the Grass-type!");
			pokemonTeamBefore[0]=Bulbasaur;
			flag = 0;
			break;
		case 2: 
			System.out.println("You've chosen Squirtle, the Water-type!");
			pokemonTeamBefore[0]=Squirtle;
			flag = 0;
			break;
		case 3:
			System.out.println("You've chosen Charmander, the Fire-type!");
			pokemonTeamBefore[0]=Charmander;
			flag = 0;
			break;				
		default:
			System.out.println("That is not a valid selection. Please try again.");
			System.out.println(" 1: Bulbasaur  2: Squirtle  3: Charmander");
			flag = 1;
		}
		}
		flag = 1;
		//Ask the user if they would like to fight or go to the store
		//What a bleak existence in which combat and consumerism are the only options
		//Use a switch statement to call up whichever class the user chooses
		System.out.println("\n\nNow that you have a Pokemon partner, you're ready for anything.");
		while (flag != 0){
			System.out.println("What would you like to do");
			System.out.println("1: Fight Wild Pokemon  2:Visit the PokeStore 3: Exit the game");
			selection = reader1.nextInt();

			switch(selection){
			case 1:
				//call the Battle class
				opponentPokemon = pokemonList[0 + (int)(Math.random() * 35)];
				int index1 = Arrays.asList(types).indexOf(pokemonTeamBefore[0].getAbility1().getAbilityType());
				int index2 = Arrays.asList(types).indexOf(pokemonTeamBefore[0].getType1());
				int index3 = Arrays.asList(types).indexOf(pokemonTeamBefore[0].getAbility2().getAbilityType());
				int index4 = Arrays.asList(types).indexOf(opponentPokemon.getAbility1().getAbilityType());
				int index5 = Arrays.asList(types).indexOf(opponentPokemon.getType1());
				int index6 = Arrays.asList(types).indexOf(opponentPokemon.getAbility2().getAbilityType());
				//System.out.println(index+1);
				batteObj.startBattle(pokemonTeamBefore[0], opponentPokemon, index1, index2, index3, index4, index5, index6, playerObj);
				flag = 1;
				break;
			case 2:
				//call the PokeStore class
				shopObj.visitStore();
				flag = 1;
				break;

			case 3: //Allow User to exit the game
				flag = 0;
				System.out.println("Thank you for playing Pokemon Go");
				System.exit(0);
				break;

			default:
				System.out.println("That is not a valid selection. Please try again.");
				flag = 1;

			}
		}
	}
	//
	//		//Logic for level up
	//	System.out.println("Please enter your name:");
	//	String playerName=input.nextLine();
	//	
	//	Player player1=new Player (playerName);
	//	Pokemon myPokemon2=new Pokemon("Raichu",500+(Math.random()*500),"StrongerShock",200);
	//	Pokemon myPokemon1=new EvolvablePokemon("Pikachu",(Math.random()*500),"Shock",20+(int)(Math.random()*80),myPokemon2,5);
	//
	//	Leveled_Object[] leveledObjects=new Leveled_Object[3];
	//	leveledObjects[0]=player1;
	//	leveledObjects[1]=myPokemon1;
	//	leveledObjects[2]=myPokemon2;
	//	
	//	for (LeveledObject x:leveledObjects){
	//		x.gainExperience(600);
	//		System.out.println();
	//	}
	//}


}