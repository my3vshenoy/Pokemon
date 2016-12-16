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
		this.money = 300;
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
//		String message = "";
		while(enoughXPForNextLevel()) 
			levelUP();
//			message = levelUP();
//		System.out.println(message);
	}
	
	public int getMoney(){
		return this.money;
	}
	
	public void useMoney(int price){
		this.money-=price;
	}
	
	public String levelUP(){
		this.level++;
		System.out.println("Congratulations! You just leveled up to Level "+getLevel()+"!");
		getLevelUPreward(this.level);
//		String message = "Congratulations! You just leveled up to Level "+getLevel()+"!";
//		return getLevelUPreward(this.level, message);
		
	}
	
	public boolean enoughXPForNextLevel(){
		return this.experience>=XPNeededForNextLevelPlayer[level];
	}
	
//	private String getLevelUPreward(int level, String message){
	private void getLevelUPreward(int level){
	//For now provide credit to buy more stuff from store
		//If we have time, we should give the player a new potion or Pokeball
		int credit =(int)(Math.random()*200);
		System.out.println("You gained free Pokemon Credit of "+ credit+". Redeem at the PokeStore\n\n" );
		this.money += credit; 
//		return message+"\n"+"You gained free Pokemon Credit of "+ credit+". Redeem at the PokeStore\n\n";
	}
}