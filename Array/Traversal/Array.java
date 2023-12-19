import java.util.Random;

public class Array {
    public static void main(String[] args) {
        // Specify the size of the array
        int arraySize = 1000;

        // Create an array to store random elements
        int[] randomArray = new int[arraySize];

        // Create a Random object
        Random random = new Random();

        // Populate the array with random integers
        for (int i = 0; i < arraySize; i++) {
            randomArray[i] = random.nextInt(); // Generates a random integer
        }

        // Print the array elements (optional)
        for (int i = 0; i < arraySize; i++) {
            System.out.print(randomArray[i] + ",");
        }
    }
}

