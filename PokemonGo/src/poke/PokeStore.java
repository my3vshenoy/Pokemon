public class PokeStore {
	public String[] itemsForSale;{"Pokeball","Greatball","Ultraball","Potion","Super Potion","Hyper Potion"};
	public int[] priceList;
	public int listLength=itemsForSale.length;
	
	
	
	System.out.println("Hello, and welcome to the PokeStore.\n");
	System.out.printf("Your current cash balance is %d. %n",player.getMoney());
	System.out.println("What would you like to purchase today?");
	
	private int counter=0
	while (listLength >= counter){
		System.out.printf("%s   $%d %n", itemsForSale[counter],priceList[counter]);
		counter++;
	}
	Scanner itemSelected = new Scanner (System.in);
	String activitySelection = reader2.next();
	
	//For each of the six items in the itemsForSale list, create a case
	//which adds that item to the Player's list
	switch(itemSelected){
		case 1:
			

}}
}