package edu.ua.cs.cs200.lab8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Actual program
 *
 * @author Frank
 *
 */
public class Program {

	/**
	 * Default fee if user value is not valid or null
	 */
	public static int DEFAULT_FEE = 100;

	/**
	 * Fee manager
	 */
	MembershipFeeManager manager;

	/**
	 * Default constructor
	 */
	public Program() {
		manager = new MembershipFeeManager();
	}

	public void start() {

		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);

		System.out.println("Enter fee to be paid: ");

		int fee = 0;
		try {
			String fromUser = br.readLine();
			fee = Integer.parseInt(fromUser);
		} catch (Exception e) {
			fee = DEFAULT_FEE;
		}

		manager.payMembershipFee(fee);

	}

	/**
	 * Main method to run the application
	 *
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		Program p = new Program();
		p.start();
	}

}
