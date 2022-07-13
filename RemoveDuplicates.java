package week2.day2;

import java.util.Arrays;

public class RemoveDuplicates {
public static void main(String[] args) {
	int[] numbers = {4,2,1,4,6,8,10,12,12};
	int length = numbers.length;
	int[] temp = new int[length];
	Arrays.sort(numbers);
	int j=0;
	for (int i=0; i<length; i++)
	{	
		//System.out.println(numbers[i]);
		
		if(i == length - 1)
		{
			temp[j]=numbers[i];
			System.out.println(temp[j]);
		}
		else if (numbers[i]!=numbers[i+1])
		{
			temp[j]=numbers[i];
			System.out.println(temp[j]);			
		}
		j++;
	}
	
}
}
