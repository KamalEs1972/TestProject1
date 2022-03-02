package interviewQuestions;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		
		String str="$Ja&%v^a#st%a@r";
	String plainString=	str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(plainString);

	}

}
