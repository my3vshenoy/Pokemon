
package poke;

public class Player implements Leveled_Object{
	private String name;
	private int level;
	private int experience;
	private int money;
	
	public Player(String name){
		this.name=name;
		this.level=1;
		this.experience=0;
		this.money = 100;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getLevel(){
		return this.level;
	}
	
	public int getExperience(){
		return this.experience;
	}

	public void gainExperience(int amount){
		
		this.experience+=amount;
		while(enoughXPForNextLevel()) 
			levelUP();
	}
	
	public int getMoney(){
		return this.money;
	}
	
	public void useMoney(int price){
		this.money-=price;
	}
	
	public void levelUP(){
		
		this.level++;
		System.out.println("Congratulations! You just leveled up to LV "+getLevel()+"!");
		getLevelUPreward(this.level);
		
	}
	
	public boolean enoughXPForNextLevel(){
		return this.experience>=XPNeededForNextLevel[level];
	}
	
	private void getLevelUPreward(int level){
		//For now provide credit to buy more stuff from store
		//If we have time, we should give the player a new potion or Pokeball
		int credit =(int)(Math.random()*20);
		System.out.println("You gained new items as reward for Level "+getLevel()+": Free Pokemon Credit of"+ credit );
		this.money += credit; 
	}

}
 