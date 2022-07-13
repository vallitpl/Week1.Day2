package week2.day2;

import java.util.Arrays;

public class FindMinMax {
public static void main(String[] args) {
	int[] numbers = {22, 8746, -19, 64, 0, 53, 47};
	int length = numbers.length;
	System.out.println("The length is :"+length);
	Arrays.sort(numbers);
	System.out.println("The min number is :"+numbers[0]);
	System.out.println("The max number is :"+numbers[length-1]);
}
}
