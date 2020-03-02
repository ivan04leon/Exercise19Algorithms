import java.math.*;
import java.util.Scanner;
public class HackerRank2 {
	
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double mealCost;
		int tax;
		int tip;
		System.out.print("What is the meat price? ");
		mealCost = sc.nextDouble();
		System.out.print("What is the meat tax? ");
		tax = sc.nextInt();
		System.out.print("What is the tip? ");
		tip = sc.nextInt();
		
		System.out.println("Final cost: " +FinalCost(mealCost, tax, tip));

	}
	
	private static int FinalCost(double mealCost, int tax, int tip) {
		double totalCost;
		totalCost = mealCost + mealCost*tax/100 + mealCost*tip/100;
	
		System.out.println("Cost without rounding: " +totalCost);
		return (int)Math.round(totalCost);
	}

}
