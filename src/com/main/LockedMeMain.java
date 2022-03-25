package com.main;

import java.util.Scanner;

import com.main.opertaions.Operation;

public class LockedMeMain {
	static Scanner sc = new Scanner(System.in);
	static boolean flag1= true;
	static boolean flag2= true;
	static	String home = System.getProperty("user.home");
	static StringBuilder path = new StringBuilder(home+"/Downloads/");

	public static void main(String[] args) {
		System.out.println("********************************************");
		System.out.println("Welcome to Lockedme.com application");
		System.out.println("Developed by : Shilpa Ranjan");
		System.out.println("********************************************");
		int userInput = 0;
		int userInput2 = 0;
l1:
		while(flag1  && (userInput2== 0 || userInput2==4)) {
			
	 	System.out.println("You can choose from the list of option available");
	 	System.out.println("1. Retrieving the file \n");
		System.out.println("2. Perform file operations\n");
		System.out.println("3. To close application\n");
 
		try {
			userInput = sc.nextInt();
			if (userInput == 2) {
				System.out.println("1. Add a file\n");
				System.out.println("2. Delete a file \n");
				System.out.println("3. Search a file\n");
				System.out.println("4. Back to main Application\n");
				userInput2 = sc.nextInt();
				if(userInput2==4)
				{ flag2 = false;
					continue l1;
					
				}
				else if(userInput2==1) {
					System.out.println("You choose to add file ");
					Operation.addFile(sc,path);
				}
				else if(userInput2==2) {
					System.out.println("You choose to delete file ");

					Operation.deleteFile(sc,path);
				}
				else if(userInput2==3) {
					System.out.println("You choose to search file ");

					Operation.searchFile(sc,path);
				}
				else
				{
					System.out.println("No operation available with this user input please try again !");
				}
			}
			
			else if(userInput==3)
			{
				
			System.out.println("Exiting application LockedMe.com ");
			System.out.println("********************************************");

			flag1 = false;
			}
			else if(userInput ==1)
			{
				Operation.listFiles(path);
			}

		} catch (Exception ex) {
			System.out.println("Some error occured while performing opeartion or invalid user input entered");
			flag1= false;
		}
	}
	}

	
}
