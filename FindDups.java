package week2.day2;

import java.util.Arrays;

public class FindDups {
public static void main(String[] args) {
	int[] numbers = {5,10,15,5,10,20,10};
	int length = numbers.length;
	//System.out.println(length);
	Arrays.sort(numbers);
	for(int i = 0; i <numbers.length-1; i++)
	{
		//System.out.println(numbers[i]);
		if(numbers[i]==numbers[i+1])
		{
			System.out.println("The number "+ numbers[i] +" is duplicated");
		}
	}
}
}
