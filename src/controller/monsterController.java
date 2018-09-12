package controller;

import model.MarshmallowMonster;
//scanner lives in java utilities and has to be imported
import java.util.Scanner;

public class monsterController
{

	//Data member section
	private MarshmallowMonster myMonster;
	
	//Constructor section
	public monsterController()
	{
		//job1: initialize data members
		myMonster = new MarshmallowMonster("Sharktopus", 1.5, 2, false, 3);//this is the constructor call
	}
	
	//method section
	public void start()
	{
		System.out.println(myMonster);
		myMonster.setArmCount(3);
//		System.out.println("Sharktopus has " + myMonster.getArmCount() +" arms or tentacles."); //must talk to instance of my monster (instance.method)						
		//instance is the variable, access all public methods--will return arm count
		
//		boolean answerNose = false; // = anotherInputScanner.nextBoolean();

		
		Scanner anotherInputScanner;
		anotherInputScanner = new Scanner(System.in);
		System.out.println("What is the name of your monster?");
		String answer = anotherInputScanner.nextLine();
		
		System.out.println("How many legs does your monster have?");
		double answerLegs = anotherInputScanner.nextDouble();
		
		System.out.println("How many eyes does your monster have?");
		int answerEyes = anotherInputScanner.nextInt();
		
		System.out.println("Does your monster have a nose?");
		String answerNoses = anotherInputScanner.nextLine();
		boolean answerNose;
		
		if (answerNoses == "no")
		{
			boolean answerNose = false;
		}
		if (answerNoses == "yes")
		{
			boolean answerNose = true;
		}

		
		System.out.println("How many arms does your monster have?");
		int answerArms = anotherInputScanner.nextInt();
		
		System.out.println("Your monster is named " + answer + ".");
		System.out.println("It has " + answerLegs + " legs, "
							+ answerEyes + " eyes, and " + answerArms  + " arms.");
		if (answerNose == false)
		{
			System.out.println("It does not have a nose.");
		}
		if (answerNose == true)
		{
			System.out.println("It has a nose.");
		}
		
	


		
		
		

		
		
		
		
		//make a a new monster and customize from user input
		MarshmallowMonster userMonster; //now call the constructor
		userMonster = new MarshmallowMonster();
		
//		userMonster.setArmCount = answerInputScanner.nextInt;
		
	}
	
//	public void monsterInput()
//	{
//		
//	}
	
}
