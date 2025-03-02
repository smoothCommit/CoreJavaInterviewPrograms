package InterviewPrograms25;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// Question 2:  Write a Java Program to swap two given Strings
		
		String string1 ="I'm Frist String";
		String string2 ="I'm Second String";

		String temp="";
		
		temp=string1;
		string1=string2;
		string2= temp;
		

		System.out.println(string1+"   "+ string2);
	}

}
