package test2;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {

		Employee e = new Employee();
		sc = new Scanner(System.in);
		
		String name, sex, marital, jobClass;
		int age, health;
		double wage;
		System.out.println("Please enter name");
		name = sc.nextLine();
		System.out.println("Please enter age");
		age = sc.nextInt();
		System.out.println("Please enter sex (male/female)");
		sex = sc.nextLine();
		System.out.println("Please enter marital status (married/single)");
		marital = sc.nextLine();
		System.out.println("Please enter job class (industrial/Information)");
		jobClass = sc.nextLine();
		System.out.println("Please enter health (1 = very good, 2 = good)");
		health = sc.nextInt();
		System.out.println("Please enter wage");
		wage = sc.nextDouble();
		
		e.setEmployee(name, age, sex, marital, jobClass, health, wage);
		e.display();
		
	}

}
