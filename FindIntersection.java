package week2.day2;

public class FindIntersection {
public static void main(String[] args) {
	int set1[] = {4,8,10};
	int set2[] = {8,5,20};
	for(int i=0; i<set1.length; i++)
	{
		for(int j=0; j<set2.length; j++)
		{
			if (set1[i] == set2[j])
			{
				System.out.println(set2[j]);
			}
		}
	}
	
	}
}

