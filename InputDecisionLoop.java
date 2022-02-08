import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */
public class InputDecisionLoop{  //Save as "Add2Integers.java"
    public static void Add2Integers(){
        //Declare variables
        int number1, number2, sum;

        //Put up prompting messages and read inputs as "int"
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter first integer: ");  // No newline for prompting message
        number1 = in.nextInt();    
        System.out.print("Enter second integer: ");                 // Read next input as "int"
        number2 = in.nextInt();
        in.close();  // Close Scanner

        //Compute sum
        sum = number1 + number2;

        //Display result
        System.out.println("The sum is: " + sum);   // Print with newline
    }
    public static void SumProductMinMax3(){
        // Declare variables
        int number1, number2, number3;  // The 3 input integers
        int sum, product, min, max;     // To compute these
	  
        // Prompt and read inputs as "int"
        Scanner in = new Scanner(System.in);  // Scan the keyboard
        System.out.print("Enter first integer: ");  // No newline for prompting message
        number1 = in.nextInt();    
        System.out.print("Enter second integer: ");                 // Read next input as "int"
        number2 = in.nextInt();
        System.out.print("Enter Third integer: ");
        number3 = in.nextInt();
        in.close();
	  
        // Compute sum and product
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        // Compute min
        // The "coding pattern" for computing min is:
        // 1. Set min to the first item
        // 2. Compare current min with the second item and update min if second item is smaller
        // 3. Repeat for the next item
        min = number1;        // Assume min is the 1st item
        if (number2 < min) {  // Check if the 2nd item is smaller than current min
            min = number2;     // Update min if so
        }
        if (number3 < min) {  // Continue for the next item
            min = number3;
        }
      
        // Compute max - similar to min
        max = number1;        // Assume max is the 1st item
        if (number2 > max) {  // Check if the 2nd item is bigger than current max
            max = number2;     // Update max if so
        }
        if (number3 > max) {  // Continue for the next item
            max = number3;
        }
      
        // Print results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
    public static void CircleComputation(){
        // Declare variables
        double radius, diameter, circumference, area;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double

        // Compute in "double"
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
    
        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
    }
    public static void SphereComputation(){
        // Declare variables
        double radius, surfaceArea, volume;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double

        // Compute in "double"
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 /3 * Math.PI * radius * radius * radius;
    
        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
    public static void CylinderComputation(){
        // Declare variables
        double radius, height, baseArea, surfaceArea, volume;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double
        System.out.print("Enter the height: ");
        height = in.nextDouble();

        // Compute in "double"
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;
    
        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
    public static void Swap2Integers(){
        int number1, number2, temp;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = in.nextInt();
        System.out.print("Enter second number: ");
        number2 = in.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After the swap, first integer is: " + number1 + ", second integer is: " + number2);  
    }
    public static void main(String[] args){
        // Add2Integers();
        // SumProductMinMax3();
        // CircleComputation();
        // SphereComputation();
        // CylinderComputation();
        Swap2Integers();
    }
}
