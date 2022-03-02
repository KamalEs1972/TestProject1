package interviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		
		// !5=5x4x3x2x1=120
		
		int num=0;
		getFatc(num);
		
	}
		public static void getFatc(int num) {
			int fact =1;
			for(int i=1;i<=num;i++) {
				fact =fact *i;
			}
		
		System.out.println("Factorial of : " + num +" is " + fact );

}
}
		