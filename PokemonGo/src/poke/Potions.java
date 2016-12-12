package poke;
import java.util.Scanner;

public class Potions 
{
	private String[] potionArray = {"", "Potion", "Super Potion", "Hyper Potion"};
	private String potion = "";
	private int[] quantityPotionArray = {0, 3, 3, 3};
	private int quantityPotion = 0;
	private int[] HPRestoredArray = {0, 20, 50, 100};
	private int HPRestored = 0;
	private int potionSelection = 0;

	public Potions (String potion, int quantityPotion, int HPRestored)
	{
		this.potion = potion;
		this.quantityPotion = quantityPotion;
		this.HPRestored = HPRestored;
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
	
	public void usePotions()
	{
		System.out.println("Which type of potion do you want to use: (choose from 1~3)");
		System.out.printf("1. Potion(%d)%n2. Super Potion(%d)%n3. Hyper Potion(%d)%n", 
			quantityPotionArray[1], quantityPotionArray[2], quantityPotionArray[3]);
		//accept input from the user
		potionSelection = new Scanner(System.in).nextInt();
		System.out.println();
		//reduce potion count by 1
		if(quantityPotionArray[potionSelection]>0)
		{
			quantityPotion = quantityPotionArray[potionSelection]--;
			potion = potionArray[potionSelection];
			HPRestored = HPRestoredArray[potionSelection];
		}
		else
		{
			quantityPotion = 0;
			potion = potionArray[potionSelection];
			HPRestored = 0;
		}
	}				
}

//lalalalalala

package poke;
import java.util.Scanner;

public class Potions 
{
	private String[] potionArray = {"", "Potion", "Super Potion", "Hyper Potion"};
	private String potion = "";
	private int[] quantityPotionArray = {0, 3, 3, 3};
	private int quantityPotion = 0;
	private int[] HPRestoredArray = {0, 20, 50, 100};
	private int HPRestored = 0;
	private int potionSelection = 0;

	public Potions (String potion, int quantityPotion, int HPRestored)
	{
		this.potion = potion;
		this.quantityPotion = quantityPotion;
		this.HPRestored = HPRestored;
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
	
	public void usePotions()
	{
		System.out.println("Which type of potion do you want to use: (choose from 1~3)");
		System.out.printf("1. Potion(%d)%n2. Super Potion(%d)%n3. Hyper Potion(%d)%n", 
			quantityPotionArray[1], quantityPotionArray[2], quantityPotionArray[3]);
		//accept input from the user
		potionSelection = new Scanner(System.in).nextInt();
		System.out.println();
		//reduce potion count by 1
		if(quantityPotionArray[potionSelection]>0)
		{
			quantityPotion = quantityPotionArray[potionSelection]--;
			potion = potionArray[potionSelection];
			HPRestored = HPRestoredArray[potionSelection];
		}
		else
		{
			quantityPotion = 0;
			potion = potionArray[potionSelection];
			HPRestored = 0;
		}
	}				
}

//lalalalalalapackage poke;
import java.util.Scanner;

import static java.lang.System.out;
