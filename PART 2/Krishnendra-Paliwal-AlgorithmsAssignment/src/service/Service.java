package service;

public class Service {

	public static int roseCountTrue(boolean[] priceRoseArry, int length) {
		// TODO Auto-generated method stub
		int counter =0;
		for (int i = 0; i<=length-1 ; i++) {
		
			if (priceRoseArry [i] == true ) {
				
				counter++;
			}
			
			
			
		}
		
		return counter;
	}
	
	public static int roseCountFalse(boolean[] priceRoseArry, int length) {
		// TODO Auto-generated method stub
		int counter =0;
		for (int i = 0; i<=length-1 ; i++) {
		
			if (priceRoseArry [i] == false ) {
				
				counter++;
			}
			
			
			
		}
		
		return counter;
	}
	
	//method to display double array
	public static void display(double[] compPriceArry, int length) {
			
			System.out.print(" { ");
			for (int i = 0; i<length ; i++) {
				
				System.out.print( compPriceArry[i] + " , " );
				
			}
			System.out.println("}");
		}

	//method to display boolean array
	public static void display(boolean[] priceRoseArry, int length) {
			
			System.out.print(" { ");
			for (int i = 0; i<length ; i++) {
				
				System.out.print( priceRoseArry[i] + " , " );
				
			}
			System.out.println(" } ");
		}
	
	//Binary search implementation for search value of stock present in array
	public static int searchValue(double[] compPriceArry, int l , int r, double searchElement) {
			
		if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the middle itself
            if (compPriceArry[mid] == searchElement)
                return mid;
 
            // If element is smaller than mid, then it can only be present in left sub array
            if (compPriceArry[mid] > searchElement)
                return searchValue(compPriceArry, l, mid - 1, searchElement);
 
            // Else the element can only be present in right sub array
            return searchValue(compPriceArry, mid + 1, r, searchElement);
        }
 
        // We reach here when element is not present in array
		
		return -1;
	}	

	//Display Menu to user for selection of function they desire to do.
    public static void displayMenu() {
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Enter the operation that you want to perform :- ");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("1. Display the companies stock prices in ascending order. ");
		System.out.println("2. Display the companies stock prices in descending order. ");
		System.out.println("3. Display the total no of companies for which stock prices rose today.");
		System.out.println("4. Display the total no of companies for which stock prices declined today. ");
		System.out.println("5. Search a specific stock price.");
		System.out.println("6. press 0 to exit ");
		System.out.println("------------------------------------------------------------------------------");
		
	}
}
