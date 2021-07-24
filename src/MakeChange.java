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
					while(centsOwed > 0) {
						if (centsOwed%0.25 == 0) {
							int quarters = (int) (centsOwed/0.25);
							System.out.println("Quarters: "+ quarters);
							centsOwed = 0;
						}
						else {
							
						}
					}
				
				
				}
		}
		
		
	}
	
	
	
}
