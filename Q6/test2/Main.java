package test2;

import java.util.Scanner;

public class Main {


	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		CustOrder[] co = new CustOrder[20];
		
		String custName, contactNumber, date;
		int numberOfGuest, dd, mm, yy;
		char custPackage;
		for(int i = 0; i < co.length; i++) {
			System.out.println("Enter customer name");
			custName = sc.nextLine();
			System.out.println("Enter contact number");
			contactNumber = sc.nextLine();
			System.out.println("Enter number of guest");
			numberOfGuest = sc.nextInt();
			System.out.println("Enter customer package (A, B, C)");
			custPackage = sc.nextLine().charAt(0);
			System.out.println("Enter the date in (dd/mm/yyyy) format. // eg (02/01/2020)");
			date = sc.nextLine();
			dd = Integer.parseInt(date.substring(0, 2));
			mm = Integer.parseInt(date.substring(3, 5));
			yy = Integer.parseInt(date.substring(6, 10));
			Date weddingDate = new Date(dd, mm, yy);
			co[i] = new CustOrder(custName, contactNumber, weddingDate, numberOfGuest, custPackage);
		}
		
	}

}
