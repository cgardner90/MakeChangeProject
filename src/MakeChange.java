import java.util.Scanner;

public class MakeChange {

					public static void main(String[] args) {
				
						makePurchase();
				
					}

				public static void makePurchase() {
					boolean answer = true;
					do {
			
						System.out.println("     Enter the Price: ");
						Scanner input = new Scanner(System.in);
						double price = input.nextDouble();
						System.out.println("     Enter the amount Tendered: ");
						double tender = input.nextDouble();
						if (price > tender) {
							System.out.println("Insufficient amount tendered");
			
						} else if (price == tender) {
							System.out.println("Price paid exactly, no change due. \n Have a Nice Day!");
						} else {
							calculateChange(price, tender);
						}
			
						System.out.print("\n\n\t\t********  Repeat this process? (Y or N):  ******** \n");
						String response = input.next();
						switch (response) {
						case "Y":
						case "y":
							break;
						case "N":
						case "n":
							System.out.println("You've Chosen to Exit the Program. Goodbye!!");
							answer = false;
							break;
			
						default:
							System.out.println("Invalid Entry, Goodbye.");
						}
					} while (answer);
				}

				public static void calculateChange(double price, double tender) {
					double value = price;
					double money = tender;
			
					double amountOwed = money - value;
					System.out.printf("\n\t\t ********** Total Change due: $%.2f ************\n\n", amountOwed);
					System.out.println("\t\t ----- Your change will be returned in the following denominations: \n");
					;
					int dollarsOwed = (int) (amountOwed / 1);
					System.out.print("\t\t  Dollar Bills: " + dollarsOwed);
					if (amountOwed % 1 != 0) {
			
						double centsOwed = (amountOwed % 1);
						int quarters = (int) (centsOwed / 0.25);
						if (quarters > 0) {
							System.out.print("\tQuarters: " + quarters);
							centsOwed = (centsOwed - (quarters * 0.25));
						}
			
						int dimes = (int) (centsOwed / 0.10);
			
						if (dimes > 0) {
							System.out.print("\t Dimes: " + dimes);
							centsOwed = (centsOwed - (dimes * 0.1));
						}
						int nickels = (int) (centsOwed / 0.05);
						if (nickels > 0) {
							System.out.print("\t Nickels: " + nickels);
							centsOwed = (centsOwed - (nickels * 0.05));
							
						}
			
						int pennies = (int)(centsOwed / 0.01);
						if (pennies > 0) {
							System.out.print("\t Pennies: " + pennies);
							centsOwed = (centsOwed - (pennies * 0.01));
						}
					}
				}
			}
//}
