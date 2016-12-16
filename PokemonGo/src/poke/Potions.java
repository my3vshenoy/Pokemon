package poke;
import java.util.Scanner;
import java.lang.*;

public class Potions 
{
	public static String[] potionArray = {"", "Potion", "Super Potion", "Hyper Potion"};
	private String potion = "";
	public static int[] quantityPotionArray = {0, 3, 3, 3};
	private int quantityPotion = 0;
	public int[] HPRestoredArray = {0, 20, 50, 100};
	private int HPRestored = 0;
	private int potionSelection = 0;
	
	public Potions(){
		
	}

	public Potions (String potion, int quantityPotion, int HPRestored)
	{
		this.potion = potion;
		this.quantityPotion = quantityPotion;
		this.HPRestored = HPRestored;
	}
	
	public void setPotionsFromUserInput (String potion, int quantityPotion, int HPRestored)
	{
		this.potion = potion;
		this.quantityPotion = quantityPotion;
		this.HPRestored = HPRestored;
	}
	
	public void displayPotions(){
		for (int i = 1; i<potionArray.length; i++){
			System.out.println(i+": "+potionArray[i]);
		}
	}
	
	public String toString() {
		return potion;
	}
	public void setPotion(String potion)
		{this.potion = potionArray[potionSelection];}
	
	public void setQuantityPotion (int quantityPotion)
		{this.quantityPotion = quantityPotionArray[potionSelection];}
	
	public void setHPRestored(int HPRestored)
		{this.HPRestored = HPRestoredArray[potionSelection];}
	
	public String getPotion()
		{return potion;}
	
	public int getQuantityPotion ()
		{return quantityPotion;}
	
	public int getHPRestored()
		{return HPRestored;}
	
//	public Pokemon usePotions(Pokemon userPokemon)
	public void usePotions(Pokemon userPokemon)
	{
		System.out.println("Which type of potion do you want to use: (choose from 1~3)");
		System.out.println("1. Potion ("+quantityPotionArray[1]+")");
		System.out.println("2. Super Potion ("+quantityPotionArray[2]+")");
		System.out.println("3. Hyper Potion ("+quantityPotionArray[3]+")");
		 
		//accept input from the user
		potionSelection = new Scanner(System.in).nextInt();
		
		//error correction on the input
		while(potionSelection > 3 || potionSelection < 1 || quantityPotionArray[potionSelection] == 0)
		{
			System.out.println("That is not a valid selection.");
			System.out.println("Which type of potion do you want to use: (choose from 1~3)");
			System.out.println("1. Potion ("+quantityPotionArray[1]+")");
			System.out.println("2. Super Potion ("+quantityPotionArray[2]+")");
			System.out.println("3. Hyper Potion ("+quantityPotionArray[3]+")");
			potionSelection = new Scanner(System.in).nextInt();	
		}
		
		//		System.out.println(potionSelection);
		//reduce potion count by 1
//		if(quantityPotionArray[potionSelection]>0)
//		{
			quantityPotion = --quantityPotionArray[potionSelection];
			potion = potionArray[potionSelection];
			HPRestored = HPRestoredArray[potionSelection];
			userPokemon.setHP(userPokemon.getHP()+HPRestored);
			System.out.println("Potion Status: \n"+ potion+ " left: "+quantityPotion+"\nHP Restored: "+HPRestored);
//		}
//		else
//		{
//			quantityPotion = 0;
//			potion = potionArray[potionSelection];
//			HPRestored = 0;
//			System.out.println("You don't have enough "+potion);
//		}
//		return userPokemon;
	}				
}

//-------------------------------------------------------------------------
//
//package poke;
//import java.util.Scanner;
//
//public class Potions 
//{
//	private String[] potionArray = {"", "Potion", "Super Potion", "Hyper Potion"};
//	private String potion = "";
//	private int[] quantityPotionArray = {0, 3, 3, 3};
//	private int quantityPotion = 0;
//	private int[] HPRestoredArray = {0, 20, 50, 100};
//	private int HPRestored = 0;
//	private int potionSelection = 0;
//
//	public Potions (String potion, int quantityPotion, int HPRestored)
//	{
//		this.potion = potion;
//		this.quantityPotion = quantityPotion;
//		this.HPRestored = HPRestored;
//	}
//	
//	public void setPotion(String potion)
//		{this.potion = potionArray[potionSelection];}
//	public void setQuantityPotion (int quantityPotion)
//		{this.quantityPotion = quantityPotionArray[potionSelection];}
//	public void setHPRestored(int HPRestored)
//		{this.HPRestored = HPRestoredArray[potionSelection];}
//	
//	public String getPotion()
//		{return potion;}
//	public int getQuantityPotion ()
//		{return quantityPotion;}
//	public int getHPRestored()
//		{return HPRestored;}
//	
//	public void usePotions()
//	{
//		System.out.println("Which type of potion do you want to use: (choose from 1~3)");
//		System.out.printf("1. Potion(%d)%n2. Super Potion(%d)%n3. Hyper Potion(%d)%n", 
//			quantityPotionArray[1], quantityPotionArray[2], quantityPotionArray[3]);
//		//accept input from the user
//		potionSelection = new Scanner(System.in).nextInt();
//		System.out.println();
//		//reduce potion count by 1
//		if(quantityPotionArray[potionSelection]>0)
//		{
//			quantityPotion = quantityPotionArray[potionSelection]--;
//			potion = potionArray[potionSelection];
//			HPRestored = HPRestoredArray[potionSelection];
//		}
//		else
//		{
//			quantityPotion = 0;
//			potion = potionArray[potionSelection];
//			HPRestored = 0;
//		}
//	}				
//}


