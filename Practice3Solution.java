package Chapter4;

import java.util.Scanner;

public class Practice3Solution {
	
	 public static void main(String[] args) {
		 
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of employees: ");
	    int numEmployees = input.nextInt();
	    
	    int count = 0;
	    double totalPay = 0.00;
	    
	    for (int i = 0; i < numEmployees; i++) {
	    	count++;
	      
	      System.out.printf("Enter the number of hours worked for employee %d: \n",count);
	      int hoursWorked = input.nextInt();
	      
	      System.out.print("Enter the pay rate per hour: \n");
	      double payRate = input.nextDouble();
	      
	      double pay = hoursWorked * payRate;
	      System.out.printf("Pay for employee %d: $%.2f\n",count ,pay);
	      
	      totalPay += pay;
	    }
	 
	     System.out.printf("Total pay: $%.2f\n", totalPay);
	  }
}