package week1.day1;

public class Factorial {
	
	public static void main(String[] args) {
		int a = 5;
		int fact = 1;
		for (int i=1;i<=a;i++) {
			fact = i*fact;
		}
		System.out.println(fact);
	}	
	
}
