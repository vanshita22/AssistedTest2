package Prog5;

import java.util.Scanner;

import Prog5.VotingException;

class VotingException extends Exception {
	static public boolean isEligible(int age) {
		if (age > 18)
			return true;
		else
			return false;
	}
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("age");
		int age=sc.nextInt();
		try {
		if (VotingException.isEligible(age)) {
		System.out.println("yes");}
	
	else {
		throw new VotingException();}
	}
	catch(VotingException e) {
		e.printStackTrace();
	}
	
}

}
