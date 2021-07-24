import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		System.out.println("Enter the Price: ");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		System.out.println("Enter the amount Tendered: ");
		double tender = input.nextDouble();
		if(price>tender) {
			System.out.println("Insufficient amount tendered");
			
		}
		else if(price == tender) {
			System.out.println("Price paid exactly, no change due. \n Have a Nice Day!");
		}
		else {
		
			calculateChange(price, tender);
			//		ENSURE PARAMETERS/////
		}
		}

	public static void calculateChange(double price, double tender) {
		double value = price;
		double money = tender;
		
		double amountOwed = money-value;
		System.out.printf("Change due: $%.2f\n", amountOwed);
		if (amountOwed > 1.00) {
			
		int dollarsOwed = (int)(amountOwed / 1);
		System.out.println("Dollars owed :" + dollarsOwed);
				if (amountOwed % 1 !=0) {
					
					double centsOwed = (amountOwed % 1);
					int quarters = (int)(centsOwed/0.25);
					int dimes = (int)(centsOwed/0.10);
					int nickels =(int)(centsOwed/0.05);
					int pennies = (int)(centsOwed/0.01);
					
					System.out.println("Quarters: " + quarters+" Dimes: "+  dimes + " Nickels: "+  nickels + " Pennies: " +pennies);
					
					
				}
		}
	}
}

		
		
	
	
	
	

