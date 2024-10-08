//****************************************************//
//* Author:1717859                                    *//
//* Week:3                                            *//
//*                                                  *//
//* Description: This class extends ModArray to       *//
//*              filter modulus results, specifically *//
//*              retaining only even numbers. It      *//
//*              overrides the basic modulus function *//
//*              by adding an additional layer that   *//
//*              filters for even values.             *//
//*                                                  *//
//*              The applyModAndFilterEven method     *//
//*              applies a modulus operation and      *//
//*              collects only even results,          *//
//*              demonstrating inheritance and        *//
//*              custom filtering in subclass         *//
//*              implementation.                      *//
//*                                                  *//
//* Date: 08/10/2024                                  *//
//****************************************************//
import java.util.ArrayList;

public class EvenModArray extends ModArray {

    // Constructor to initialize EvenModArray with the list of integers
    // Calls the superclass (ModArray) constructor to set up the numbers list
    public EvenModArray(ArrayList<Integer> numbers) {
        super(numbers); // Pass numbers to the superclass constructor
    }

    // Method to apply modulus and filter only even results
    // Takes an integer modValue for the modulus operation
    public ArrayList<Integer> applyModAndFilterEven(int modValue) {
        ArrayList<Integer> modResults = applyMod(modValue); // Get modulus results using superclass's method
        ArrayList<Integer> evenResults = new ArrayList<>(); // To store even modulus results

        // Iterate through modResults and add only even numbers to evenResults
        for (int result : modResults) {
            if (result % 2 == 0) { // Check if the result is even
                evenResults.add(result); // Add even result to the list
            }
        }
        return evenResults; // Return the list containing only even results
    }
}
