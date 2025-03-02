package code.Proj;

public class Project {

	public static void main(String[] args) {

		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		

			//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			
			int subtract = ages[ages.length-1] - ages[0]; //declare var for subtraction result, access final value with .length - 1
				
				System.out.println(subtract);
				
			//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
			
				int[] ages2 = {7, 11, 22, 33, 45, 56, 68, 92, 98};
			
				//i. Make sure that there are 9 elements of type int in this new array.  
			
			for (int i = 0; i < ages2.length; i++) {
			}
			System.out.println("There are " + ages2.length + " elements in this array.");
			
				//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

			int subtract2 = ages2[ages2.length-1] - ages2[0]; //declare var for subtraction result, access final value with .length - 1
			
			System.out.println(subtract2);
			
			
				//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
			
			int [] ages3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
				
			System.out.println(ages [2]); // 23
			System.out.println(ages2 [2]); // 22
			System.out.println(ages3 [2]);  // 3
	
			
			//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.

			
			int sumOfAges = 0;
			
			for (int ageS : ages2) {
	            sumOfAges += ageS;  
			}    
			int avgAge = sumOfAges / ages2.length;
			
			System.out.println("The average age of ages2 is " + avgAge);
		
			System.out.println("The average ages2 is: " + averageAge(ages2));
			
			
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			for (String name : names) {
				System.out.println(name);
			}
			//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			double sumLetters = 0;
			
			for (String name:names) {
				sumLetters += name.length();
				}
			
			double avgLetters = (sumLetters / names.length);
			System.out.println("Average letters per name in array is " + avgLetters);
			
			
			//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			
			String concatNames = "";
			
			for (int i = 0; i < names.length; i++) {
				concatNames += names[i];
				
			
			  if (i < names.length - 1) {
	                concatNames += " ";
	            }
			}  
			System.out.println(concatNames);  
			
				
		//3. How do you access the last element of any array?
			
			////////// array.length - 1 ///////////

		//4. How do you access the first element of any array?
			
			////////// array[0] //////////
			
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			int [] nameLengths= new int[names.length];
			
			 for (int i = 0; i < names.length; i++) {
		            nameLengths[i] = names[i].length();
		        }
			
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			
			 int sumLength = 0;
			 
			 for (int i = 0; i < nameLengths.length; i++) {
				 
				 sumLength += nameLengths[i];
			 }
			 
			 System.out.println("There are " + sumLength + " elements in this array.");
			 
		//7 test
			 System.out.println(multiplyString("yeet", 7)); 
		//8 test	 
		     String fullNamePull = fullName ("John", "Wick");
		        
		     System.out.println(fullNamePull);
		     
		//9 test 
		     int  ages4[] = {20, 40, 50};
		     int  ages5[] = {10, 20, 30};
		     System.out.println(oldPeople(ages4));
		     System.out.println(oldPeople(ages5));
		 //10 test
		     
		     double abC[] = {1, 3, 5, 7, 9, 11, 13};
		     double deF[] = {2, 4, 6, 8, 10, 12, 14};
		     double ghI[] = {5, 10, 15, 20, 25, 30, 35};
		     
		     System.out.println(greaterAverage(abC, deF));
		     System.out.println(greaterAverage(ghI, abC));
		  //11 test
		  
		     
		     
		  //12 test
		     System.out.println(willBuyDrink(true, 5.00));
		     System.out.println(willBuyDrink(false, 20.00));
		     System.out.println(willBuyDrink(true, 15.00));
		     System.out.println(willBuyDrink(false, 3.50));
		     
		  //13 test
		     System.out.println(willPlantTree(false, 31.0, 0.1));
		     System.out.println(willPlantTree(true, 40.0, 3.0));
		     System.out.println(willPlantTree(false, 35.0, 2.0));
		     System.out.println(willPlantTree(true, 33.0, 0.99));
		     System.out.println(willPlantTree(false, 36.0, 0.15));
		
	} /// main close
			

	///////// CANNOT DECLARE METHODS IN MAIN METHOD, HAVE TO PUT OUTSIDE MAIN///////////////
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
			public static String multiplyString (String word, int n) {    //MoreMethods video
				String result = "";
				for (int i = 0 ; i < n; i++)  {
					result += word;
				}
			     
				return result;
			}
	
			//#7 method
		  
			public static int averageAge(int[] ages2) {   //create method ala More methods video

				int sumAge = 0;

				for (int number : ages2) {
					sumAge += number; // each age in ages2 added to sumAge
				}
				return sumAge / ages2.length;
				
			}
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			public static String fullName(String firstName, String lastName) {
		
				return firstName + " " + lastName;
			}
				

		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			public static boolean oldPeople(int[] ages) {
				int sumAge = 0;
			
				for(int age : ages) {
					sumAge += age;
				}
				return sumAge > 100;
				
			}
	

		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
			
			public static double average(double[] avg) {
				double a = 0;
				
				for (double b : avg) {
					a += b;
				}
			
				return (a / avg.length);
				
			}
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			public static boolean greaterAverage(double a[], double b[]) {
				double x = 0;
				double y = 0;
				for (double z : a) {
					x += z;
				}
				
				for (double bb : b) {
					y += bb;
				}	
				return (x / a.length) > (y / b.length);
			}
				
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				if(isHotOutside && moneyInPocket > 10.50) {
					
				return true;
				}
				else return false;
			}
			
		//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			public static String willPlantTree(boolean spring, double warmEnough, double enoughRain) {
				if(spring && warmEnough >= 32.0 && enoughRain >= 1.0) {
					return "Dig that hole!";				
				} else { return "Hold your shovels!";
				}
			}
		// This method is similar to #12 but returns Strings instead of when conditions are met. The method checks whether the season is spring, the temperature is warm enough, and at least 1.0 inch of rain.
			// the method will return "Dig that hole!" if it is spring, >- 32.0, and >= 1.0 inch of rain//
			// I created this method to help someone evaluate when to plant a tree.
			
			
			
}		/// project class close


