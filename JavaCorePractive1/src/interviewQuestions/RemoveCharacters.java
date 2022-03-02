package interviewQuestions;

public class RemoveCharacters {

	public static void main(String[] args) {
		String str="Hello";

		StringBuffer sb= new StringBuffer(str);
	
		//sb.append(" Kamal");
		//System.out.println(sb);
		
		sb.deleteCharAt(2);
		
		System.out.println(sb);
	

	}

}
