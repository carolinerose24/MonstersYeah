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
		JOptionPane.showMessageDialog(null,"put your \ntext here"); //void because it does not return anything--only further input is the OKAY button
		//use this method instead of System.out.Println("ASDF");
		
//		JOptionPane.showMessageDialog(null, myMonster);
		//-------------------if you want it to be on multiple lines, put \n where the break should be------------------
		
		
		
		String nameOfMonster= JOptionPane.showInputDialog(null, "What is the name of your monster?");
		String userLegCount = JOptionPane.showInputDialog(null, "How many legs does your monster have?");
		String userEyeCount = JOptionPane.showInputDialog(null, "How many eyes does your monster have?");
		String userArmCount = JOptionPane.showInputDialog(null, "How many arms does your monster have?");
		String userNose = JOptionPane.showInputDialog(null, "Does your monster have a nose? (yes/no)");
		String userNose111 = "yes";
		String input1 = "1";
		
		
		if (userNose.equals(userNose111)) // == does not work well in Java!! cannot be used with objects such as string!!!!!-----------------------------only primitives (ints, doubles)
		{
			String userNose2 = JOptionPane.showInputDialog(null, "How many noses?");
			if (userLegCount.equals(input1))
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arms." + "\nIt has " + userNose2 + " noses.") ;
			}
			
			//put the ! things on each one!!!
			if (userEyeCount.equals(input1) && !(userArmCount.equals(input1)) && !(userLegCount.equals(input1)))
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eye, and " + userArmCount  + " arms." + "\nIt has " + userNose2 + " noses.") ;
			}
			if (userArmCount.equals(input1) && !(userLegCount.equals(input1)) && !(userEyeCount.equals(input1)))
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arm." + "\nIt has " + userNose2 + " noses.") ;
			}
		
			
			if (!(userLegCount.equals(input1)) && !(userEyeCount.equals(input1)) && !(userArmCount.equals(input1)))  //this is the original
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arms." + "\nIt has " + userNose2 + " noses.") ;
			}
			
			
			//----------------combos-------------------------
			
			if (userLegCount.equals(input1) && userEyeCount.equals(input1) && !userArmCount.equals(input1)) //1 leg and 1 eye
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eye, and " + userArmCount  + " arms." + "\nIt has " + userNose2 + " noses.") ;
			}
			if (userLegCount.equals(input1) && userArmCount.equals(input1) && !userEyeCount.equals(input1)) //1 leg and 1 arm
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arm." + "\nIt has " + userNose2 + " noses.") ;
			}
			if (userArmCount.equals(input1) && userEyeCount.equals(input1) && !userLegCount.equals(input1)) //1 eye and 1 arm
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eye, and " + userArmCount  + " arm." + "\nIt has " + userNose2 + " noses.") ;
			}
			if (userLegCount.equals(input1) && userEyeCount.equals(input1) && userArmCount.equals(input1)) //ALL THREE
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eye, and " + userArmCount  + " arm." + "\nIt has " + userNose2 + " noses.") ;
			}
			
			
			
			
		}
		else
		{
			if (userLegCount.equals(input1) && !(userEyeCount.equals(input1)) && !(userArmCount.equals(input1)))
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arms."+ "\nIt does not have a nose.");
			}
			if (userEyeCount.equals(input1) && !(userLegCount.equals(input1)) && !(userArmCount.equals(input1)))
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eye, and " + userArmCount  + " arms."+ "\nIt does not have a nose.");
			}
			if (userArmCount.equals(input1) && !(userEyeCount.equals(input1)) && !(userLegCount.equals(input1)))
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arm."+ "\nIt does not have a nose.");
			}
			if (!(userLegCount.equals(input1)) && !(userEyeCount.equals(input1)) && !(userArmCount.equals(input1))) //original
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arms."+ "\nIt does not have a nose.");
			}
			
			
			//----------------combos-------------------------
			if (userLegCount.equals(input1) && userEyeCount.equals(input1) && !userArmCount.equals(input1)) //1 leg and 1 eye
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eye, and " + userArmCount  + " arms."+ "\nIt does not have a nose.");
			}
			if (userLegCount.equals(input1) && userArmCount.equals(input1)&& !userEyeCount.equals(input1)) //1 leg and 1 arm
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eyes, and " + userArmCount  + " arm."+ "\nIt does not have a nose.");
			}
			if (userArmCount.equals(input1) && userEyeCount.equals(input1) && !userLegCount.equals(input1)) //1 arm and 1 eye
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " legs, "
						+ userEyeCount + " eye, and " + userArmCount  + " arm."+ "\nIt does not have a nose.");
			}
			if (userLegCount.equals(input1) && userEyeCount.equals(input1) && userArmCount.equals(input1)) //1 leg and 1 eye and 1 arm
			{
				JOptionPane.showMessageDialog(null, "Your monster is named " + nameOfMonster + "." + "\nIt has " + userLegCount + " leg, "
						+ userEyeCount + " eye, and " + userArmCount  + " arm."+ "\nIt does not have a nose.");
			}

			
			//make it so it only pops up 1 message instead of doing it all!!!!!!!! And fix the nose/noses with if statements
			
			
		}

		
		
		
//		
////		String userMonsterName = 	JOptionPane.showInputDialog(null, "What is the name of your monster?");
//		//variable + jop + null, question for input (comment for output)
//		
//		
//		System.out.println(myMonster);
//		myMonster.setArmCount(3);
////		System.out.println("Sharktopus has " + myMonster.getArmCount() +" arms or tentacles."); //must talk to instance of my monster (instance.method)						
//		//instance is the variable, access all public methods--will return arm count
//		
////		boolean answerNose = false; // = anotherInputScanner.nextBoolean();
//
//		
//		Scanner anotherInputScanner;
//		anotherInputScanner = new Scanner(System.in);
//		
////		String nameOfMonster= JOptionPane.showInputDialog(null, "What is the name of your monster?");
//		System.out.println("What is the name of your monster?");
//		String answer = anotherInputScanner.nextLine();
//		
////		String userLegCount = JOptionPane.showInputDialog(null, "How many legs does your monster have?");
//		System.out.println("How many legs does your monster have?");
//		double answerLegs = anotherInputScanner.nextDouble();
//		
////		String userEyeCount = JOptionPane.showInputDialog(null, "How many eyes does your monster have?");
//		System.out.println("How many eyes does your monster have?");
//		int answerEyes = anotherInputScanner.nextInt();
//		
////		String userArmCount = JOptionPane.showInputDialog(null, "How many arms does your monster have?");
//		System.out.println("How many arms does your monster have?");
//		int answerArms = anotherInputScanner.nextInt();
//		
////		String userNoseym = JOptionPane.showInputDialog(null, "Does your monster have a nose?");
//		System.out.println("Does your monster have a nose?");
//		String answerNoses = anotherInputScanner.nextLine();
//		
////		System.out.println("Does your monster have a nose?");
//		String answerN = anotherInputScanner.nextLine();
//		
//	//	boolean answerNose1 = true;
//		
//		
//		System.out.println("How many noses?");
//		int answerHowMany = anotherInputScanner.nextInt();
//		//if no noses, assume Zero. if yes, ask how many noses?
//	
//		
//	
//		
//		
//		System.out.println("Your monster is named " + answer + ".");
//		System.out.println("It has " + answerLegs + " legs, "
//						+ answerEyes + " eyes, and " + answerArms  + " arms.");
//		System.out.println("It has " + answerNoses + " noses.");
	

		
		
		
		
		//make a a new monster and customize from user input
		MarshmallowMonster userMonster; //now call the constructor
		userMonster = new MarshmallowMonster();
		
//		userMonster.setArmCount = answerInputScanner.nextInt;
		
	}

	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error) //type, variable -- formal parameter
		{
			JOptionPane.showMessageDialog(null, "Put in an integer");
		}
		
		
		return isValid;
	}
	
	
	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		try
		{
			Double.parseDouble(maybeDouble); //String to double conversion
			isValid=true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Put in an double");
		}
		return isValid;
	}
	
	
	
	
//	public void monsterInput()
//	{
//		
//	}
	
}
