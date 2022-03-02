package interviewQuestions;

public class SmallestLargestNumber {

	public static void main(String[] args) {
		int arr[]= {-12,2,43,7,9,20,-2};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length ; i++) {
			
			if(arr[i]<min){
				min = arr[i];
				
			}
		
			if(arr[i]>max){
				max = arr[i];
		
		}
		
			}
		System.out.println("The Smallest number is " + min + " and The biggest is "  +  max);

}
}