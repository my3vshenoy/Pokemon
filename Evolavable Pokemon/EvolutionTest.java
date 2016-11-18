package pokemonGo;

public class EvolutionTest 
{

		public static void main(String[] args) {
			EvolvablePokemon strongerPokemon=new EvolvablePokemon("Raichu",500+(Math.random()*500),"StrongerShock",200, null);
			EvolvablePokemon currentPokemon=new EvolvablePokemon("Pikachu",(Math.random()*500),"Shock",20+(int)(Math.random()*80),strongerPokemon);
			
			System.out.println("Before Evolution");
			System.out.println(currentPokemon);
			
			currentPokemon.evolve();
			System.out.println("\nAfter Evolution");
			System.out.println(currentPokemon);
		}

}
	


