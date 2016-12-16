package poke;
import java.util.Scanner;

public class Pokeballs 
{
	public static String[] pokeballArray = {"", "Pokeball", "Greatball", "Ultraball"};
	private String pokeballName = "";
	public static int[] quantityBallArray = {0, 3, 3, 3};
	private int quantityBall = 0;
	public double[] ballModifierArray = {0, 0, 0.1, 0.2};
	private double ballModifier = 0.0;
	private int ballSelection = 0;

	private double catchRate = 0.0;
	private int maxHP = 100;

	public Pokeballs (String pokeballName, int quantityBall, double ballModifier)
	{
		this.pokeballName = pokeballName;
		this.quantityBall = quantityBall;
		this.ballModifier = ballModifier;
	}
	
	public void setPokeballsFromUserInput(String pokeballName, int quantityBall, double ballModifier){
		this.pokeballName = pokeballName;
		this.quantityBall = quantityBall;
		this.ballModifier = ballModifier;
	}

	public void setPokeball(String pokeball)
		{this.pokeballName = pokeballArray[ballSelection];}
	
	public void setQuantityBall (int quantityBall)
		{this.quantityBall = quantityBallArray[ballSelection];}
	
	public void setBallModifier(double ballModifier)
		{this.ballModifier = ballModifierArray[ballSelection];}
	
	public String getPokeball()
		{return pokeballName;}
	
	public int getQuantityBall()
		{return quantityBall;}
	
	public double getBallModifier()
		{return ballModifier;}

	public void usePokeballs(Pokemon opponentPokemon)
	{
		
		System.out.println("Which type of pokeball do you want to use: (choose from 1~3)");
		System.out.println("1: Pokeball("+ quantityBallArray[1] +")\n2: Greatball("+quantityBallArray[2]+")\n3. Ultraball("+quantityBallArray[3]+")"); 
		
		//accept input from the user
		ballSelection = new Scanner(System.in).nextInt();

		while(ballSelection > 3 || ballSelection < 1 || quantityBallArray[ballSelection] == 0)
		{
			System.out.println("That is not a valid selection.");
			System.out.println("Which type of pokeball do you want to use: (choose from 1~3)");
			System.out.println("1: Pokeball("+ quantityBallArray[1] +")\n2: Greatball("+quantityBallArray[2]+")\n3. Ultraball("+quantityBallArray[3]+")"); 
			ballSelection = new Scanner(System.in).nextInt();	
		}
		
		setPokeballsFromUserInput(pokeballArray[ballSelection], quantityBallArray[ballSelection], ballModifierArray[ballSelection]);
		
		//reduce pokeball count by 1
		quantityBallArray[ballSelection]--;
		catchRate = (double) opponentPokemon.getHP() / maxHP - ballModifierArray[ballSelection]; 
		if(catchRate <= 0.25)
		{
			System.out.println("You caught "+opponentPokemon.getName());
			//If you catch the pokemon, the opponent pokemon should be added to the player's team
		}
		else{
			System.out.println("You did not catch "+opponentPokemon.getName());
		}
							
		quantityBall = quantityBallArray[ballSelection];
		pokeballName = pokeballArray[ballSelection];
		ballModifier = ballModifierArray[ballSelection];
	}
}
