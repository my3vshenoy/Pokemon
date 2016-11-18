package pokemonGo;


public class Pokemon 
{
	String name;
	double combatPower,hitPoint;
	String ability;
	public Pokemon(String n, double cp, String a, double hp)
	{
		name=n;
		combatPower=cp;
		ability=a;
		hitPoint=hp;
	}
	public void setName(String n)
	{
		n=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCombatPower(double cp)
	{
		cp=combatPower;
	}
	public double getCombatPower()
	{
		return combatPower;
	}
	public void setAbility(String a)
	{
		a=ability;
	}
	public String getAbility()
	{
		return ability;
	}
	public void setHitPoint(double hp)
	{
		hp=hitPoint;
	}
	public double getHitPoint()
	{
		return hitPoint;
	}
	@Override public String toString()
	{
		return ("Name:"+getName()+"\nCP:"+getCombatPower()+"\nAbility:"+getAbility()+"\nHP:"+	getHitPoint());
	}
}
