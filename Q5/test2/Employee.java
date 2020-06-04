package test2;

public class Employee {
	
	private String name;
	private int age;
	private String sex;
	private String marital; // married/single
	private String jobClass; // industrial/information
	private int health; // 1 = very good, 2 = good
	private double wage;
	/**
	 * 
	 */
	public Employee() {
		this.name = null;
		this.age = 0;
		this.sex = null;
		this.marital = null;
		this.jobClass = null;
		this.health = 0;
		this.wage = 0.00;
	}
	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param marital
	 * @param jobClass
	 * @param health
	 * @param wage
	 */
	public Employee(String name, int age, String sex, String marital, String jobClass, int health, double wage) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.marital = marital;
		this.jobClass = jobClass;
		this.health = health;
		this.wage = wage;
	}
	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param marital
	 * @param jobClass
	 * @param health
	 * @param wage
	 */
	public void setEmployee(String name, int age, String sex, String marital, String jobClass, int health, double wage) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.marital = marital;
		this.jobClass = jobClass;
		this.health = health;
		this.wage = wage;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @return the marital
	 */
	public String getMarital() {
		return marital;
	}
	/**
	 * @return the jobClass
	 */
	public String getJobClass() {
		return jobClass;
	}
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @param marital the marital to set
	 */
	public void setMarital(String marital) {
		this.marital = marital;
	}
	/**
	 * @param jobClass the jobClass to set
	 */
	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}
	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public double calculateTax() {
		double tax;
		if(this.getMarital().equalsIgnoreCase("married") && this.getAge() >= 30) {
			tax = (this.getWage() * 0.03);
		}else {
			tax = (this.getWage() * 0.05);
		}
		return tax;
	}
	
	public void display() {
		if(this.getHealth() == 1) {
			System.out.println("Health: Very good");
		}else if(this.getHealth() == 2) {
			System.out.println("Health: good");
		}
	}

}
