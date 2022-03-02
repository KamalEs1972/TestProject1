package interviewQuestions;

public class CountingUpperLowerCaseLetter {

	public static void main(String[] args) {
		String s= "The LifE Is GreAt";
		//char c='z';
		int countUpper=0;
		int countLower=0;
		//int l = letter.length();
		 for (int i=0;i<s.length(); i++) {
			  
				 char ch=s.charAt(i);
				 if(Character.isUpperCase(ch))
				 {
			 //if(s.charAt(i)!=' ') { // counting the letter of the String
				 countUpper++;
			 }
				 
			 
	//	 System.out.println("Uppercase are " + countUpper);
//			 if(Character.isUpperCase(c)) {
//				 countUpper++;
//			  
//				 
//				 
//				 
	  else  {
		  countLower++;
	  }
			  }
			  System.out.println("Uppercase are " + countUpper);
			  System.out.println("Uppercase are " + countLower);
////	 
////		 System.out.println("Uppercase are " + countUpper);
////	 System.out.println(countLower);
////	 }
////	
//	}}
}}