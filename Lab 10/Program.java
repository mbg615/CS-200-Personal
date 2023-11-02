package edu.ua.cs.cs200.lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) {
		new Program().start();
	}
	
	public void start() {
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		System.out.println("Enter a regular integer between 0 and 3999: ");
		
		int number = 0;
		
		try {
			String fromUser = br.readLine();
			number = Integer.parseInt(fromUser);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		RomanNumeral romanNumeral = new RomanNumeral(number);
		
		System.out.println("Roman equivalent of "+number+" is "+romanNumeral.toString());
	}

}
