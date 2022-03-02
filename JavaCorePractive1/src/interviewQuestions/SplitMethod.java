package interviewQuestions;

public class SplitMethod {

	public static void main(String[] args) {
		
		String s="The Best Of Fairuz";
		
		String parts[]=s.split(" ");
		
		for(int i=0; i<parts.length;i++)
		{
			
			System.out.println("========>" + parts[i]);
		
		 }

	}

}
