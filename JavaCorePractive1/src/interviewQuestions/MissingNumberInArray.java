package interviewQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// n=6;
		//sum=(n*(n+1))/2=21
		int [] arr= {3,1,5,7,4,2};
		int n=arr.length+1;
		int sum=(n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
			sum=sum-arr[i];
		}
			System.out.println("The missing number is " +sum);
	}

}
