
public class Rectangle extends Geometry {
	
	
	public void area(int edge1,int edge2) {
		System.out.println("area of rectangle:"+(edge2*edge1));
	}
	public void perimeter(int edge1,int edge2) {
		System.out.println("perimeter of rectangle:"+(2*(edge2+edge1)));
	}

}
