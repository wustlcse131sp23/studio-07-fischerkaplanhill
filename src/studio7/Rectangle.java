package studio7;



public class Rectangle {
	
	private static double width;
	private static double height; 
	
	public Rectangle(int w, int h) {
		width=w;
		height=h;
	}
	
	
	public static double area() {
		
		return width*height;
	}
	
	public static double perimeter() {
		
		return 2*width + 2*height;
	}
}
	

