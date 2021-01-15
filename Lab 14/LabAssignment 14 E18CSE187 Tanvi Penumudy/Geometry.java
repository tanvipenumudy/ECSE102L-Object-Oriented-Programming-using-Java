
public class Geometry {
	public int radius;
	public int edge;
	public void area() {
		System.out.println("area of circle:"+(3.14*radius*radius));
		System.out.println("area of square:"+(edge*edge));
	}
	public void perimeter() {
		System.out.println("perimeter of circle:"+(3.14*2*radius));
		System.out.println("perimeter of square:"+(4*edge));
	}

	
}
