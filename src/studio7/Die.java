package studio7;
import java.util.Scanner;

public class Die {

	private static int sides; 
	
	public Die(int n) {
		this.sides=n;
	}
		
	public static int result(int n) {
		int result = (int)(Math.random() * n);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
