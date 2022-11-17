package codeoftheday;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string where you need to remove Whitespaces...:");
		String inputString = sc.nextLine();
		char[] charArray = inputString.toCharArray();
		String stringWithoutSpaces="";
		
		for (int i=0;i<charArray.length;i++)
		{
			if((charArray[i]!=' ')&&(charArray[i]!='\t'))
			{
				stringWithoutSpaces = stringWithoutSpaces + charArray[i];
			}
		}
		System.out.println("input String:"+inputString);
		System.out.println("input String Without Spaces :"+stringWithoutSpaces);
		sc.close();
	}
}
