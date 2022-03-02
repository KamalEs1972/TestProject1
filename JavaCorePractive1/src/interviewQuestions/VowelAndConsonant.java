package interviewQuestions;

public class VowelAndConsonant {

	public static void main(String[] args) {
		//a e o u i
		
		char ch='k';
//		if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
//			System.out.println(ch+ " is a vowel");
//		} else {
//			System.out.println(ch+ " is a Consonant");
//			
//		}

	//}
		
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch+ " is a vowel");
	break;
	
	default:
		System.out.println(ch+ " is a Consonant");
		

	}

}
}