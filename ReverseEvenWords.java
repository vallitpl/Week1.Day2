package week2.day2;

public class ReverseEvenWords {
public static void main(String[] args) {
	String[] strArray = {"happy","joy","sad","surprise","angry"};
	String[] strTemp = new String[strArray.length];
	//String strTemp;
	
	for (int i=0; i<strArray.length; i++)
	{
		if(i%2 == 0)
		{
			String revStr = "";
			String str = strArray[i];
			char[] ch1 = str.toCharArray();
//			char[] ch2 = null;
			for (int j = ch1.length-1; j>=0; j--)
			{		
				revStr = revStr+ch1[j];			
				
			}
		strTemp[i] = revStr;
		
		}
		else
		{
		strTemp[i] = strArray[i];
		}
		System.out.println(strTemp[i]);
	}
	
}
}
