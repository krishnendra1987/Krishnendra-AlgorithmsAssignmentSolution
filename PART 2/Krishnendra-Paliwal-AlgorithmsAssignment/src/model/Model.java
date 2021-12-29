package model;

import java.util.Scanner;

public class Model {
    /*method to create double array of company stock price and boolean array of stock price rose w.r.t 
	previous day company stock price. Inputs for both array has to be provided by user.*/
	public static void compPrice(double[] compPriceArry, boolean[] priceRoseArry, int length) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<length ; i++) {
			System.out.println("Enter current stock price of the company " + (i+1) + " :- ");
			compPriceArry[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? (True/False)  ");
			//System.out.println("Provide Inputs in True/False only");
			priceRoseArry[i] = sc.nextBoolean();
			
		}
		//display(compPriceArry,length);
	}
	
}