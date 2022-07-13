package week2.day2;

public class ReverseString {
public static void main(String[] args) {
	String str = "hello";
	//Convert the string to characters (preferred is character Array)
	//Get the characters in reverse order
	char[] ch1 = str.toCharArray();
	for (int i = ch1.length-1; i >= 0; i--) {
		System.out.print(ch1[i]);
	}
}
}
