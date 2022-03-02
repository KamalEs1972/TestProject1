package interviewQuestions;

public class DublicateMultiNumberInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,6,5,4,6,2};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The doublicatenumber is " + arr[j]);
				}
			}
		
		}

	}

}
