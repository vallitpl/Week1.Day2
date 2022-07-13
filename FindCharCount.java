package week2.day2;

public class FindCharCount {
public static void main(String[] args) {
	String str = "cognizantc";
	char ch = 'a';
	int count = 0;
	//Convert the string to character Array
	//Loop and compare with the input character
	//If matches keep adding the count
	//Finally print the count
	char[] ch1 = str.toCharArray();
	for (int i = 0; i < ch1.length; i++) {
		System.out.println(ch1[i]);
		if (ch == ch1[i])
		{
			
			count = count+1;
		}				
	}
	System.out.println(count);
}
}
