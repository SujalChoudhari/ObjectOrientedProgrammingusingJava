package EX_07;

public class Circle {
	public float radius;
	public Circle(float r) {
		radius = r;
	}
	
	public double surfaceArea() {
		return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
}
