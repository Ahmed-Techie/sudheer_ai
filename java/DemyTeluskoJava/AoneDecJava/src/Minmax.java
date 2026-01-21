public class Minmax {
    public static void main(String[] args) {

        // Declare and initialize an integer array
        int[] numbers = {45, 22, 89, 16, 90, 33};

        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        // Use an enhanced for loop to find min and max
        for (int value : numbers) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        // Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}


//