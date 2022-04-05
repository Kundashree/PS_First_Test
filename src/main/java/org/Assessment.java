package org;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		String firstName = sc.nextLine();
		System.out.println("enter last name");
		String lastName = sc.nextLine();
		
		String name = firstName + lastName;
		System.out.println("Output: my name is " + name);
	}

}
