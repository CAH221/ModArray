//****************************************************//
//* Author:1717859                                    *//
//* Week:3                                            *//
//*                                                  *//
//* Description: This class represents a basic data   *//
//*              structure for processing integer     *//
//*              arrays with modulus operations. It   *//
//*              includes a method to apply a given   *//
//*              modulus divisor to each element and  *//
//*              store the results in a new list.     *//
//*                                                  *//
//*              Designed for flexibility, this       *//
//*              class can be extended by subclasses  *//
//*              to add further filtering or          *//
//*              processing based on the modulus      *//
//*              results, enabling more complex data  *//
//*              handling.                            *//
//*                                                  *//
//* Date: 08/10/2024                                  *//
//****************************************************//
import java.util.ArrayList;

public class ModArray {
    // Protected ArrayList to store integers, accessible by subclasses
    protected ArrayList<Integer> numbers;

    // Constructor initializes the ArrayList with given integers
    public ModArray(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    // Method to apply modulus operation to each element in the ArrayList
    // Takes an integer modValue, which is the divisor for the modulus operation
    public ArrayList<Integer> applyMod(int modValue) {
        ArrayList<Integer> modResults = new ArrayList<>(); // To store modulus results
        for (int num : numbers) {
            modResults.add(num % modValue); // Apply modulus to each number and add result to the list
        }
        return modResults; // Return the list containing all modulus results
    }
}
