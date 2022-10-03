package Chapter4;
import java.util.*;

public class PSISession7Practice1Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of weeks: ");
	    int weeks = input.nextInt();
	    System.out.println("Enter the number of days in the week: ");
	    int days = input.nextInt();

	    // outer loop prints weeks
	    for (int i = 1; i <= weeks; i++) {
	      System.out.println("Week: " + i);

	      // inner loop prints days
	      for (int j = 1; j <= days; j++) {
	        System.out.println("  Day: " + j);
	      }
	    }
	  }
	}
