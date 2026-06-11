package chandana;
interface Rectangle {
	void areaRectangle(); // Interface for Rectangle
}
	interface Triangle { // Interface for Triangle
		void areaTriangle();
}
// Class implementing both interfaces
class Shape implements Rectangle, Triangle {
	double length = 10, breadth = 5; // For rectangle
	double base = 8, height = 6; // For triangle
	// Implementing Rectangle interface
	public void areaRectangle() {
		double area = length * breadth;
		System.out.println("Area of Rectangle = " + area);
	}
	// Implementing Triangle interface	
	public void areaTriangle() {
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle = " + area);
	}
}
class InheritanceDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println("Using Multiple Inheritance through Interfaces:");
		shape.areaRectangle();
		shape.areaTriangle();
	}
}