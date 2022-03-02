package interviewQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping :");
		System.out.println("a=" +a);
		System.out.println("b="+b);
		
		System.out.println("After swapping :");
		
//		int temp;
//		temp = a;
//		a=b;
//		b=temp;
		 a=a-b;//-10
		 b=a+b;//10
		 a=b-a;//20
		System.out.println("a=" +a);
		System.out.println("b="+b);
	}

}
