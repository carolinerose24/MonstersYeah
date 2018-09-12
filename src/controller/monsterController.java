package controller;

import model.MarshmallowMonster;
//scanner lives in java utilities and has to be imported

public class monsterController
{

	//Data member section
	private MarshmallowMonster myMonster;
	
	//Constructor section
	public monsterController()
	{
		//job1: initialize data members
		myMonster = new MarshmallowMonster("Sharktopus", 1.5, 2, false, 3);
	}
	
	//method section
	public void start()
	{
		System.out.println(myMonster);
	}
}
