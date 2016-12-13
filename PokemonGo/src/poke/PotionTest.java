//package poke;
//import java.util.Scanner;
//
//public class PotionTest 
//{
//
//	public static void main(String[] args) 
//	{
//		Pokemon userPokemon = new Pokemon(null, 0, null, 0, 0);
//		Potions userPotion = new Potions(null, 1, 0);
//		Pokeballs userPokeball = new Pokeballs(null, 1, 0.0);
//		Pokemon opponentPokemon = new Pokemon(null, 0, null, 0, 0);
//		Potions opponentPotion = new Potions(null, 1, 0);
//		Pokeballs opponentPokeball = new Pokeballs(null, 1, 0.0);
//		int turn = 1; //1 for 1st players move, 2 for 2nd players move
//		int arrayPosition = 0;
//		double catchRate = 0.0;
//		int maxHP = 100;
//	    String[] names = {"","Pikachu", "Charizard", "Blastoise", "Venusaur", "Pidgeot", "Snorlax", "Dragonite", "Rhydon", "Meowth", "Poliwhirl"};
//	    String[] abilities = {"","Thunderbolt", "Flame Thrower", "Water Gun", "Leaf Dance", "Wing Attack", "Tackle", "Water Beam", "Rock Smash", "Scratch", "Bubble"};	    
//	    
//	    for(int counter = 1; counter <= 2; counter++)
//	    {	  
//	    	System.out.println("Please choose Pokemon " + counter + ": (choose from 1~10)"); // prompt
//	    	System.out.printf("1:%-10s 2:%-10s 3:%-10s 4:%-10s 5:%-10s\n",names[1],names[2],names[3],names[4],names[5]);
//			System.out.printf("6:%-10s 7:%-10s 8:%-10s 9:%-10s 10:%-10s\n",names[6],names[7],names[8],names[9],names[10]);
//			arrayPosition = new Scanner(System.in).nextInt(); // read a line of text
//		    System.out.println(); // blank space 
//		      
//			switch (counter)
//			{
//				case 1:
//			  	{
//			  		userPokemon.setName(names[arrayPosition]);
//			  		userPokemon.setAbility(abilities[arrayPosition]);
//			  		userPokemon.setCombatPower((int)(Math.random()*1000)); //CP 0-999
//			  		userPokemon.setStrength(10); //Strength is 1-20
//			  		userPokemon.setHP(80); //HP 20-100
////			  	  	userPokemon.setHP(20+(int)(Math.random()*80)); //HP 20-100
//			       	System.out.printf("A wild %s with CP %.1f and HP %d has appeared! .........."
//		 	      		+ "%n%s has ability %s with strength %d%n%n", userPokemon.getName(), 
//		 	      		userPokemon.getCombatPower(), userPokemon.getHP(), userPokemon.getName(), 
//		 	      		userPokemon.getAbility(), userPokemon.getStrength());		  	      
//			       	break;
//			  	}
//			  	case 2:
//				{
//		  			opponentPokemon.setName(names[arrayPosition]);
//			  	    opponentPokemon.setAbility(abilities[arrayPosition]); 
//			  	    opponentPokemon.setCombatPower((int)(Math.random()*1000));
//			  	    opponentPokemon.setStrength(1+(int)(Math.random()*19));
//			  	    opponentPokemon.setHP(20+(int)(Math.random()*80));
//			  	    System.out.printf("A wild %s with CP %.1f and HP %d has appeared! .........."
//			  	      	+ "%n%s has ability %s with strength %d%n%n", opponentPokemon.getName(), 
//			  	      	opponentPokemon.getCombatPower(), opponentPokemon.getHP(), opponentPokemon.getName(), 
//			  	      	opponentPokemon.getAbility(), opponentPokemon.getStrength());
//			  	    break;	
//			  	}
//			}
//	      }
//	         		        
//	      System.out.println("Let the battle begin!");
//	      
//	      while (userPokemon.getHP() > 0 && opponentPokemon.getHP() > 0)
//	      {
//	          turn = 1;
//	    	  System.out.println("What will you do?");
//	          System.out.printf(" 1: Attack %n 2: Use Potion%n 3: Use Pokeball%n");
//	          
//	          int selection = new Scanner(System.in).nextInt();
//	          System.out.println();
//	  			
//	  	//Applies the user's selection, and names the user's first pokemon accordingly
//	  		switch(selection)
//	  			{
//	  		case 1://TODO write formula to pull th us
//	  			//Player1 attacks
//	  			//set hp of opponentPokemon after attack from pokemon1
//	  			opponentPokemon.setHP(opponentPokemon.getHP() - userPokemon.getStrength());
//	  			// display text
//	            System.out.printf("The %s used %s against %s......%s's HP decreased to %d%n", 
//	            	userPokemon.getName(), userPokemon.getAbility(), opponentPokemon.getName(), 
//	          		opponentPokemon.getName(), opponentPokemon.getHP());
//	  			break;
//	  		case 2: //display the list of Potion items
//	  				//accept input from the user
//	  				//use another switch statement to call the usePotion method of the selected potion
//	  			if(turn == 1)
//	  			{
//  					userPotion.usePotions();
//	  				if(userPotion.getQuantityPotion() > 0)
//	  				{
//	  					userPokemon.setHP(userPokemon.getHP() + userPotion.getHPRestored());
//	  					System.out.printf("%n%s restored %d HP by using a %s. %s now has %d HP.%n", 
//	  						userPokemon.getName(), userPotion.getHPRestored(), userPotion.getPotion(), 
//	  						userPokemon.getName(), userPokemon.getHP());
//	  				}
//	  				else
//	  					{System.out.printf("%nYou are out of %ss. You lost your turn.%n", userPotion.getPotion());}
//	  			}
//	  			else
//	  			{
//	  				if(opponentPotion.getQuantityPotion() > 0)
//	  				{
//	  					opponentPotion.usePotions();
//		  				opponentPokemon.setHP(opponentPokemon.getHP() + opponentPotion.getHPRestored());	
//		  				System.out.printf("%n%s restored %d HP by using a %s. %s now has %d HP.%n", 
//		  						opponentPokemon.getName(), opponentPotion.getHPRestored(), opponentPotion.getPotion(), 
//		  						opponentPokemon.getName(), opponentPokemon.getHP());
//	  				}
//	  				else
//	  					{System.out.printf("%nYou are out of %ss. You lost your turn.%n", opponentPotion.getPotion());}
//	  			}
//	  			break;
//	  		case 3: //display the list of Pokeball items
//	  			if(turn == 1)
//	  			{
//  					userPokeball.usePokeballs();
//	  				if(userPokeball.getQuantityBall() > 0)
//	  				{
//	  					catchRate = (double) opponentPokemon.getHP() / maxHP - userPokeball.getBallModifier(); 
//	  					if(catchRate <= 0.33)
//	  					{
//	  						System.out.printf("You caught %s!%n", opponentPokemon.getName());
//	  						opponentPokemon.setHP(0);
//	  					}
//	  					else
//	  						System.out.printf("You did not catch %s!%n", opponentPokemon.getName());
//	  				}			
//	  				else
//	  					System.out.printf("You are out of %ss. You lost your turn.%n%n", userPokeball.getPokeball());  	  					
//	  			}
//	  			else
//	  			{
//	  				opponentPokeball.usePokeballs();
//		  			if(opponentPokeball.getQuantityBall() > 0)
//		  			{
//		  				catchRate = (double) userPokemon.getHP() / maxHP - opponentPokeball.getBallModifier(); 
//		  				if(catchRate <= 0.33)
//		  				{
//		  					System.out.printf("You caught %s!%n", userPokemon.getName());
//		  					userPokemon.setHP(0);
//		  				}
//		  				else
//		  					System.out.printf("You did not catch %s!%n", userPokemon.getName());
//		  			}			
//		  			else
//		  				System.out.printf("You are out of %ss. You lost your turn.%n%n", opponentPokeball.getPokeball());  	  
//	  			}
//		  		break;
////////////////////////	  			
//	  		default: System.out.println("That is not a valid selection. What would you like to do?");
//	  			}
//
//	         
//	  turn = 2;
//	          //Player2 auto attacks only for now
//	    	  //set hp of pokemon1 after attack from opponentPokemon
//	  		userPokemon.setHP(userPokemon.getHP() - opponentPokemon.getStrength());
//	          // display text
//	          System.out.printf("The %s used %s against %s......%s's HP decreased to %d%n%n", 
//	        		opponentPokemon.getName(), opponentPokemon.getAbility(), userPokemon.getName(), 
//	        		userPokemon.getName(), userPokemon.getHP());
//
//
//	      
//	      }	  	
//	       
//	      System.out.println("\nResults:"); 
//	      
//	      if (userPokemon.getHP() <= 0 && opponentPokemon.getHP() <= 0)
//	    	  System.out.println("There are no winners.");
//	      else if (userPokemon.getHP() <= 0)
//	      {
//	    	  System.out.printf("%s defeated %s, remaining HP: %d", 
//	          		opponentPokemon.getName(), userPokemon.getName(), opponentPokemon.getHP());
//	      }
//	      else
//	      {
//	    	  System.out.printf("%s defeated %s, remaining HP: %d", 
//	    			  userPokemon.getName(), opponentPokemon.getName(), userPokemon.getHP());
//	      }
//	   } // end main
//} // end class PokemonGo