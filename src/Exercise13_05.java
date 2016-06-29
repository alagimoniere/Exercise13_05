public class Exercise13_05 {
	
	public static void main(String[] args) {
		
		/** Create two comparable circles */
		Circle circle1 = new Circle(5.0);
		Circle circle2 = new Circle(4.0);

		/** Display the max circle */
		Circle max = (Circle)GeometricObject.max(circle1, circle2);
		System.out.println("The max circle's radius is " +
				max.getRadius());
		System.out.println(max);
	}
}

