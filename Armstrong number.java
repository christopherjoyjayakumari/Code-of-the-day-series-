package codeoftheday;

public class ArmstrongNumber {
		static void checkArmstrongNumber(int number)
		{
			int copyofNumber = number;
			int noOfDigits = String.valueOf(number).length();
			int sum = 0;
			while(copyofNumber !=0)
			{
				int lastDigit = copyofNumber % 10;
				int lastDigitToThepowerOfNoOfDigits = 1;
				for(int i = 0;i< noOfDigits;i++)
				{
					lastDigitToThepowerOfNoOfDigits = lastDigitToThepowerOfNoOfDigits* lastDigit;
				}
				sum = sum + lastDigitToThepowerOfNoOfDigits;
				copyofNumber = copyofNumber / 10;
			}
			if(sum == number)
			{
				System.out.println(number+" is an armstrong number");
			}
			else
			{
				System.out.println(number+" is not an armstrong number");
			}
		}
		public static void main(String[] args)
		{
			checkArmstrongNumber(153);
			checkArmstrongNumber(371);
			checkArmstrongNumber(123);
		}
}
