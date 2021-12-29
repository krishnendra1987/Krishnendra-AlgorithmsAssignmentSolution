package main;
import java.util.*;


import model.Model;
import service.MergeSort;
import service.Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,choice =1 ,i = 0; //r is number row in array i.e number of company input provided by user		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of companies");
		r = sc.nextInt();
		double compPriceArry[] = new double[r];
		boolean priceRoseArry[] = new boolean[r];
		
		//method call for creation of array of company price and price rose array from user input.
		Model.compPrice(compPriceArry,priceRoseArry, compPriceArry.length);
		
		for ( i = 1 ; i <=5 && choice != 0 ;  ) {			
			
			Service.displayMenu();  // displayMenu method call from service package to display user menu for desired function selection
			choice = sc.nextInt();
			if (choice != 0 ) {							
					switch(choice) {			
				default:
					System.out.println("Enter Correct Option");
					i = 0;	
		 			System.out.println(i);
					break;				
				case 1:
					MergeSort.mergeSortAscending(compPriceArry,0, compPriceArry.length -1);
					System.out.println("Stock prices in ascending order are : ");
					Service.display(compPriceArry,compPriceArry.length);
					i = choice;
					break;
				case 2:
					MergeSort.mergeSortDescending(compPriceArry,0, compPriceArry.length -1);
					System.out.println("Stock prices in descending order are : ");
					Service.display(compPriceArry,compPriceArry.length);
					i = choice;
					break;
				case 3:
					System.out.println("Total no of companies whose stock price rose today : " + Service.roseCountTrue(priceRoseArry,priceRoseArry.length));
					i = choice;
					break;
				case 4:
					System.out.println("Total no of companies whose stock price declined today  : " + Service.roseCountFalse(priceRoseArry,priceRoseArry.length));
					i = choice;
					break;
				case 5:
					MergeSort.mergeSortAscending(compPriceArry,0, compPriceArry.length -1);
					System.out.println("Enter the key value to search");
					double searchElement = sc.nextDouble();
					int result = Service.searchValue(compPriceArry,0,compPriceArry.length-1,searchElement);
					if (result == -1)
			            System.out.println("Value not found");
			        else
			            System.out.println("Stock of value " + searchElement + " is present ");
					i = choice;
					break;
					
						}	
					
					} 
			else {			 
				System.out.println("Exited successfully");					
				i =6;
			}
			
		}

		

	}
	


}
