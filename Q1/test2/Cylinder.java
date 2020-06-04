package test2;

public class Cylinder {
	
	private double radius;
	private double height;
	
	final double pi = 3.14159265359;
	/**
	 * 
	 */
	public Cylinder() {
		this.radius = 0;
		this.height = 0;
	}
	/**
	 * @param radius
	 * @param height
	 */
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public Cylinder(Cylinder c) {
		this.radius = c.radius;
		this.height = c.height;
	}
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double caclVolume() {
		double V = pi*(this.radius*this.radius)*this.height;
		return V;
	}

}
