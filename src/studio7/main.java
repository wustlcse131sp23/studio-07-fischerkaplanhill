package studio7;
import studio7.Rectangle;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height=3;
		int width=2;
		
		Rectangle x = new Rectangle(width,height);
		double area= x.area();
		double perimeter = x.perimeter();
		System.out.println(area);
		System.out.println(perimeter);

	}


}
