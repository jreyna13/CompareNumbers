//Javier Reyna EG1305A 02/12/2015

import java.util.Scanner;

public class CompareNumbers {
	
	public static void main(String[] args) {
			
		int first_integer;
		int second_integer;
		int third_integer;
		int largest; //largest number
		int smallest; //smallest number
		int sum; //sum of numbers
		int product; // product of numbers
		int average; // average of numbers
		
		
		Scanner input = new Scanner(System.in);
		
		//algorithm for 1st integer
		System.out.print("Please enter the first integer: ");
		first_integer = input.nextInt();
		
		//algorithm for second integer
		
		System.out.print("Please enter the second integer: ");
		second_integer = input.nextInt();
		
		//algorithm for third integer
		
		System.out.print("Please enter the third integer: ");
		third_integer = input.nextInt();
	
		
		//determine largest value
				largest = first_integer; //assume number 1 is the largest
				
				if (second_integer > largest ) //determine whether number2 is larger
					largest = second_integer;
				
				if (third_integer >largest ) // determine whether number 3 is larger
					largest = third_integer;
				
				//determine smallest value
				smallest = first_integer; // assume number1 is the smallest
				
				if (second_integer < smallest ) //determine whether number 2 is smallest
				smallest = second_integer;
				
				if (third_integer < smallest ) //determine whether number 3 is smallest
					smallest = third_integer;
				
				//calculations
				sum = first_integer + second_integer + third_integer;
				product = first_integer * second_integer * third_integer;
				average = sum/3;
				
				//print
				System.out.printf("For the numbers: " + first_integer+", " + second_integer+"," + " and " + third_integer);
				System.out.printf("\nLargest is: " + largest);
				System.out.printf("\nSmallest: " + smallest);
				System.out.printf("\nSum is: " + sum);
				System.out.printf("\nProduct is: " + product);
				System.out.println("\nAverage: " + average);
		}
		}
