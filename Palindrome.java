package week2.day2;

public class Palindrome {
public static void main(String[] args) {
	String str = "mam";
	String revStr = "";
	char[] ch1 = str.toCharArray();
//	char[] ch2 = null;
	for (int i = ch1.length-1; i>=0; i--)
	{		
		revStr = revStr+ch1[i];	
		
		
	}
	System.out.println(revStr);
	if (str.equals(revStr))
	{
		System.out.println("It is a Palindrome");
	}
	else
	{
		System.out.println("It is not a Palindrome");
	}
}

}



