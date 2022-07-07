package criticalThinking6;

import java.util.Scanner;

public class criticalThinking6 {

	
	
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String output = collectColor(scnr);
		System.out.println(output);
		output = collectColor(scnr);
		System.out.println(output);
		output = collectColor(scnr);
		System.out.println(output);
	}


	public static String collectColor(Scanner scnr) {
		try {
			String userInfo;
			
			System.out.print("Enter a color: ");
			userInfo = scnr.nextLine();
			System.out.println("The color you entered is " + userInfo);
			return "Success";
			
		} catch (Exception e) {
			return "Failure";
		}
		
	}

}