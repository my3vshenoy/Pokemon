package pokemonGo;

public class EvolvablePokemon extends Pokemon
{
	EvolvablePokemon pokemonAfterEvolution;
	public EvolvablePokemon(String n,double cp,String a, double hp, EvolvablePokemon eo1)
	{
		super(n, cp, a, hp);
		pokemonAfterEvolution=eo1;
	}
	public void evolve()
	{
		name=pokemonAfterEvolution.name;
		combatPower=pokemonAfterEvolution.combatPower;
		ability=pokemonAfterEvolution.ability;
	}
}
