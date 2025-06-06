package newproject;
import java.util.Scanner;
public class Calculator {
	public static int add(int a,int b) {
		return a+b;
		
	}
	public static int subtract(int a,int b) {
		return a-b;
	}
	public static int multiplication(int a,int b) {
		return a*b;
	}
	public static int division(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("enter what you want to do ");
		System.out.println("1. add  "
				+ "  2. subtract "
				+ "3. multiplication"
				+ "4. division");
		
		int c=in.nextInt();
		
		
		switch (c) {
		case 1:
			 System.out.println(add(a,b)); ;
			break;
		case 2:
			 System.out.println(subtract(a,b));
			break;
		case 3:
			 System.out.println(multiplication(a,b));
			break;
		case 4:
			 System.out.println(division(a,b));
			break;
		default:
			System.out.println("you entered wrong number");
		}
		
		
		
		

	}

}
