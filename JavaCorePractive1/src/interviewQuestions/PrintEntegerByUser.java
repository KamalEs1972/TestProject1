//how to print an Enteger?//

package interviewQuestions;

import java.util.Scanner;

public class PrintEntegerByUser {

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Please eneter a number");
	
	int num = reader.nextInt();
	
	System.out.println("You entered:"+ num );
}
}