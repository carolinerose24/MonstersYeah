package model;

public class MarshmallowMonster
{
	//-----------Data members section-----------------------------(always private)
	private String name; //default null (objects)
	private double legCount; //default Zero (numbers)
	private int eyeCount;
	private boolean hasNoses; //default false (booleans)
	private int armCount;
	
	
	public MarshmallowMonster() 	//default constructor has no parameters/always zero 
	{
		
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name;
		//parameter is being assigned into the data member (name --> name)
	}
	
	public MarshmallowMonster (String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
		
		
	}
	
	//--------Getters: Always the return type of the type (ex name return type will be a string)-----------------------------------------
	public String getName()
	{
		return name;
		//do not put code after the return!!!! It will not run the code after it (Automatic exit point of a method)
	}

	public double getLegCount()//All getters have zero parameters-nothing in the parenthesis
	{
		return legCount;
	}
	
	public int getEyeCount()//Getters get access to data members (which must stay private)--give a copy instead of ability to change original
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	//--------------setters (changes or sets the value)--------------------------------------------------------------------------------
	//return type is VOID
	public void setName(String name)//ALL SETTERS HAVE ONE PARAMETER --- THE TYPE AND THEN ITS NAME (FORMAL PARAMETER)
	{
		this.name = name; 
	}//white 'name' disappears outside this {} while this.name exists anywhere in the MarshmallowMonster class
	
	public void setLegCount(double legs)
	{
		this.legCount = legs;
	}//parameter does not have to match the data member legCount
	
	public void setEyeCount (int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setHasNoses(boolean hasNose)
	{
		this.hasNoses = hasNose;
	}
	
	public void setArmCount (int arms)
	{
		this.armCount = arms;
	}
	
	
	
	//any object in model should have a toString-----------------------------------------------------------------------------------------
	public String toString()
	{
		String description = "My monster's name is " + name 
				+ ". He has " + armCount + " tentacles."
				+ " The scary thing he says is RAWR XD!";
		
		
		return description;
	}
}
