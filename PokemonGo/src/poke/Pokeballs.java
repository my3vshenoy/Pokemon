//package poke;
//import java.util.Scanner;
//
//public class Pokeballs 
//{
//	private String[] pokeballArray = {"", "Pokeball", "Greatball", "Ultraball"};
//	private String pokeballName = "";
//	private int[] quantityBallArray = {0, 3, 3, 3};
//	private int quantityBall = 0;
//	private double[] ballModifierArray = {0, 0, 0.1, 0.2};
//	private double ballModifier = 0.0;
//	private int ballSelection = 0;
//
//	private double catchRate = 0.0;
//	private int maxHP = 100;
//
//	public Pokeballs (String pokeballName, int quantityBall, double ballModifier)
//	{
//		this.pokeballName = pokeballName;
//		this.quantityBall = quantityBall;
//		this.ballModifier = ballModifier;
//	}
//
//	public void setPokeball(String pokeball)
//		{this.pokeballName = pokeballArray[ballSelection];}
//	
//	public void setQuantityBall (int quantityBall)
//		{this.quantityBall = quantityBallArray[ballSelection];}
//	
//	public void setBallModifier(double ballModifier)
//		{this.ballModifier = ballModifierArray[ballSelection];}
//	
//	public String getPokeball()
//		{return pokeballName;}
//	
//	public int getQuantityBall()
//		{return quantityBall;}
//	
//	public double getBallModifier()
//		{return ballModifier;}
//
//	public void buyPokeball(int itemSelected)
//	{
//		quantityBall = ++quantityBallArray[itemSelected];
//		System.out.println("You now have "+quantityBallArray[itemSelected]+ " " +pokeballArray[itemSelected] +"s.");
//	}

//	public void usePokeballs()
//	{
//		System.out.println("Which type of pokeball do you want to use: (choose from 1~3)");
//		System.out.println("1: Pokeball("+ quantityBallArray[1] +")\n2: Greatball("+quantityBallArray[2]+")\n3. Ultraball("+quantityBallArray[3]+")"); 
//		
//		//accept input from the user
//		ballSelection = new Scanner(System.in).nextInt();
//		System.out.println();
//		
//		//reduce pokeball count by 1
//		if(quantityBallArray[ballSelection]>0)
//		{
//
//			quantityBallArray[ballSelection]--;
//			catchRate = (double) opponentPokemon.getHP() / maxHP - ballModifierArray[ballSelection]; 
//			if(catchRate <= 0.25)
//			{
//				System.out.printf("You caught %s!%n", opponentPokemon.getName());
//				//If you catch the pokemon, the opponent pokemon should be added to the player's team
//			}
//			else
//				System.out.printf("You did not catch %s!%n", opponentPokemon.getName());
//		}			
//
//			quantityBall = quantityBallArray[ballSelection]--;
//			pokeball = pokeballArray[ballSelection];
//			ballModifier = ballModifierArray[ballSelection];
//		}
//
//		else
//		{
//			quantityBall = 0;
//			pokeballName = pokeballArray[ballSelection];
//			ballModifier = 0;
//		}
//	}
//
//}
////
////			//this needs to be moved out to pokemongo
//////			catchRate = (double) opponentPokemon.getHP() / maxHP - ballModifierArray[ballSelection]; 
//////			if(catchRate <= 0.25)
//////			{
//////				System.out.printf("You caught %s!%n", opponentPokemon.getName());
//////				//If you catch the pokemon, need way to exit battle
//////			}
//////			else
//////				System.out.printf("You did not catch %s!%n", opponentPokemon.getName());
//////		}			
//////		else
//////			System.out.printf("You are out of %ss. You lost your turn.%n%n", pokeballArray[ballSelection]);  							
//////			//use another switch statement to call the usePokeball method of the selected potion