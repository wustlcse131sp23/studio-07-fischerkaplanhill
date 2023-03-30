package studio7;

import java.util.Scanner;
import studio7.Die;
import javax.naming.spi.DirStateFactory.Result;

public class mainDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many sides?");
		int n = in.nextInt();
		//int x= new Die(n);
		Die x = new Die(n);
		int result = x.result(n);
		System.out.println(result);
	}

}
