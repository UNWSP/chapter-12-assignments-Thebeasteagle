package chapter12assignmentsThebeasteagle;

import java.util.*;
public class Distance
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String val;
		double entry=0;
		double total = 0;
		double average = 0;
		final int QUIT = 99999;
		int x = 0, y,size=0,count=0;
		double[] numbers = new double[5];
		boolean isValOk = false;
		boolean success = false;
	while (!success) {
		try {
			System.out.print("Enter array size: ");
				val=input.next();
				size=Integer.parseInt(val);
				success = true;
		}
catch (NumberFormatException e) {
		System.out.println("You have entered invalid data");
}
}
try {
	numbers = new double[size];
}
catch (NegativeArraySizeException ex) {
	System.out.println("Can't create array of negative size!!!So setting the array size to a default value of five.");
	size=5;
}

while(entry != QUIT && x < numbers.length){

if(x < numbers.length){
	try{
		System.out.print("Enter next numeric value or " +QUIT + " to quit >> ");
		entry = input.nextDouble();
		numbers[x] = entry;
		total += numbers[x];
		++x;
}
catch(InputMismatchException e){
		System.out.println("Entered array value should be a double");
		System.out.println(e.getClass().getCanonicalName());
		input.nextLine();
}
}
}
if(x == 0)
	System.out.println("Average cannot be computed because no numbers were entered");
else{
	average = total / x;
	System.out.println("You entered " + x +
			" numbers and their average is " + average);
for(y = 0; y < x; ++y)
	System.out.println(numbers[y] + " is " +
			(numbers[y] - average) + " away from the average");
}
}
}