/**
 * 
 */
package poke;

/**
 * @author my3shenoy
 *
 */


public class Ability {
	private String abilityName;		
	private String abilityType;
	private int abilityPower;


	//constructor method to initialize the variables
	public Ability (String abilityName, String abilityType, int abilityPower)
		{
		this.abilityName = abilityName;
		this.abilityType = abilityType;
		this.abilityPower = abilityPower;
		}
	//Set methods to assign values to the abilities
	public void setAbilityName(String abilityName)
		{this.abilityName= abilityName;}
	public void setAbilityType (String abilityType)
		{this.abilityType = abilityType;}
	public void setAbilityPower(int abilityPower)
		{this.abilityPower = abilityPower;}




	//Get methods for name and power simply return their value
	public String getAbilityName()
	 {return abilityName;}
	public int getAbilityPower()
	 {return abilityPower;}

}
