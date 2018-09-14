package controller;

import model.MarshmallowMonster;
//scanner lives in java utilities and has to be imported
import java.util.Scanner;

import javax.swing.JOptionPane;//----------------------------------------extended java library--------------------------------joptionpane is the class

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
		JOptionPane.showMessageDialog(null,"put your \n text here"); //void because it does not return anything--only further input is the OKAY button
		//use this method instead of System.out.Println("ASDF");
		
		JOptionPane.showMessageDialog(null, myMonster);
		//-------------------if you want it to be on multiple lines, but \n where the break should be------------------
		
		
		
		
		
		
		
		
		System.out.println(myMonster);
		myMonster.setArmCount(3);
//		System.out.println("Sharktopus has " + myMonster.getArmCount() +" arms or tentacles."); //must talk to instance of my monster (instance.method)						
		//instance is the variable, access all public methods--will return arm count
		
//		boolean answerNose = false; // = anotherInputScanner.nextBoolean();

		
		Scanner anotherInputScanner;
		anotherInputScanner = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "What is the name of your monster?");
		System.out.println("What is the name of your monster?");
		String answer = anotherInputScanner.nextLine();
		
		JOptionPane.showMessageDialog(null, "How many legs does your monster have?");
		System.out.println("How many legs does your monster have?");
		double answerLegs = anotherInputScanner.nextDouble();
		
		JOptionPane.showMessageDialog(null, "How many eyes does your monster have?");
		System.out.println("How many eyes does your monster have?");
		int answerEyes = anotherInputScanner.nextInt();
		
		JOptionPane.showMessageDialog(null, "How many arms does your monster have?");
		System.out.println("How many arms does your monster have?");
		int answerArms = anotherInputScanner.nextInt();
		
		JOptionPane.showMessageDialog(null, "Does your monster have a nose?");
		System.out.println("Does your monster have a nose?");
		String answerNoses = anotherInputScanner.nextLine();
		
//		System.out.println("Does your monster have a nose?");
		String answerN = anotherInputScanner.nextLine();
		
	//	boolean answerNose1 = true;
		
		
		System.out.println("How many noses?");
		int answerHowMany = anotherInputScanner.nextInt();
		

		//if no noses, assume Zero. if yes, ask how many noses?
	
		
		
		
		System.out.println("Your monster is named " + answer + ".");
		System.out.println("It has " + answerLegs + " legs, "
						+ answerEyes + " eyes, and " + answerArms  + " arms.");
		System.out.println("It has " + answerNoses + " noses.");

		
//		if (answerNose1 == false)
//		{
//			System.out.println("It does not have a nose.");
//		}
//
//		if (answerNose1 == true)
//		{
//			System.out.println("It has a nose.");
//		}
//	
		
		
//		if (answerN == "yes")
//		{
//			boolean	answerNose1 = true;
//			System.out.println("It has a nose.");
//		}
//		
//		if (answerNoses == "yes")
//			
//		{
//			boolean	answerNose1 = true;
//			System.out.println("It has a nose.");
//		}
//		
//		if (answerNoses == "no")
//		{
//			boolean	answerNose1 = false;
//			System.out.println("It does not have a nose.");
//		}
//		
//		if (answerN == "no")			
//		{
//			boolean	answerNose1 = false;
//			System.out.println("It does not have a nose.");
//		}
//	


		
		
		

		
		
		
		
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
