package week2.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String str = "happya";
		char[] ch1 = str.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{
			if((i%2) == 0)
			{
				System.out.print(ch1[i]);
			}
			else
			{
				System.out.print(Character.toUpperCase(ch1[i]));
			}
				
							
		}
		//System.out.println(count);
		
}

}
