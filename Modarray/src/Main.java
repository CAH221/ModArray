//****************************************************//
//* Author:1717859                                    *//
//* Week:3                                            *//
//*                                                  *//
//* Description: This class demonstrates the use of   *//
//*              polymorphism and modular design to   *//
//*              apply modulus operations on an       *//
//*              ArrayList of integers. It creates    *//
//*              instances of ModArray and EvenModArray*//
//*              to perform modulus filtering, with   *//
//*              the latter filtering results to      *//
//*              include only even values. This       *//
//*              setup showcases flexibility in       *//
//*              processing numbers using class       *//
//*              hierarchy and modular methods.       *//
//*                                                  *//
//* Date: 08/10/2024                                  *//
//****************************************************//
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArrayList with integers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));

        // Create an instance of ModArray to apply modulus operation on the numbers list
        ModArray modArray = new ModArray(numbers);
        System.out.println("Modulus results:");
        System.out.println(modArray.applyMod(3)); // Print modulus results with 3 as divisor

        // Create an instance of EvenModArray to apply modulus and filter for even results
        EvenModArray evenModArray = new EvenModArray(numbers);
        System.out.println("\nEven modulus results:");
        System.out.println(evenModArray.applyModAndFilterEven(3)); // Print even modulus results with 3 as divisor
    }
}
