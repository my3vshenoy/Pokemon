package poke;
import java.util.Scanner;



public class PokemonGo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Pokemon Go\n");
		System.out.println("Let the coding begin");
		//pokemonlist= new pokemon();
		System.out.println("Let the battle begin!");
		System.out.println("What will you do?");
		System.out.printf(" 1: Attack %n 2: Use Potion%n 3: Use Pokeball");
		
		//accept's the user's selection and stores it locally
				Scanner reader = new Scanner (System.in);
				int selection = reader.nextInt();
					
			//Applies the user's selection, and names the user's first pokemon accordingly
				switch(selection)
					{
				case 1://TODO write formula to pull th us
					int damage = //Damage= (abilityPower*Strength*multiplier1*multiplier2)/100
					opponentPokemon.setHP(HP=HP-damage)
					break;
				case 2: //display the list of Potion items
						//accept input from the user
						//use another switch statement to call the usePotion method of the selected potion
					String Potion;
					System.out.println("Choose your potion: /n 1 - Potion1/n 2 - Potion2/n 3 - Potion3");
					String Potion1, Potion2, Potion3;
					Scanner reader1 = new Scanner (System.in);
					String input = reader1. nextLine();
					
					if (Potion==Potion1)
					{Pokemon.getHP
							settHP(HP=HP*2);
							}
					else if(Potion==Potion2)
					{
							setHP(HP=HP*4);
							}
					else if (Potion==Potion3)
					{
							setHP(HP=HP*4);
							}
					else
					{
						System.out.println("Invalid Potion");
					}
						//accept input from the user
						//use another switch statement to call the usePotion method of the selected potion
					break;
				case 3: 
		//need better error correction 
		  			//prompt pokeball selection
		  			System.out.println("Which type of pokeball do you want to use: (choose from 1~3)");
		  			System.out.printf("1. Pokeball(%d)%n2. Greatball(%d)%n3. Ultraball(%d)%n", 
		  				quantityBall[1], quantityBall[2], quantityBall[3]);
		  			//accept input from the user
		  			ballSelection = new Scanner(System.in).nextInt();
		  			System.out.println();
		  			//reduce pokeball count by 1
		  			if(quantityBall[ballSelection]>0)
		  			{
		  				quantityBall[ballSelection]--;
	  					catchRate = (maxHP2 - (double) pokemon2.getHP()) / maxHP2 * ballModifier[ballSelection]; 
	  					if(catchRate >= 0.85)
	  						{
	  						System.out.printf("You caught %s!%n", pokemon2.getName());
	  						}
	  					else
	  						System.out.printf("You did not catch %s!%n", pokemon2.getName());
					}
		//need some catch rate formula  			
		  			else
		  				System.out.printf("You are out of %ss. You lost your turn.%n%n", pokeball[ballSelection]);  					
					break;
				default: System.out.println("That is not a valid selection. What would you like to do?");
					}
			}
		
	
		//Logic for level up
	System.out.println("Please enter your name:");
	String playerName=input.nextLine();
	
	Player player1=new Player (playerName);
	Pokemon myPokemon2=new Pokemon("Raichu",500+(Math.random()*500),"StrongerShock",200);
	Pokemon myPokemon1=new EvolvablePokemon("Pikachu",(Math.random()*500),"Shock",20+(int)(Math.random()*80),myPokemon2,5);

	Leveled_Object[] leveledObjects=new Leveled_Object[3];
	leveledObjects[0]=player1;
	leveledObjects[1]=myPokemon1;
	leveledObjects[2]=myPokemon2;
	
	for (LeveledObject x:leveledObjects){
		x.gainExperience(600);
		System.out.println();
	}
}

}
}