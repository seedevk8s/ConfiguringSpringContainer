package com.chu2code.springPractice;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
	
	// create an array of strings
	private String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);  //0~data.length 사이의 난수 반환(data.length 미포함)
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
