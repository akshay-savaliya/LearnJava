package College;

public class P18_SortArray {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify the size of the array and its elements as command line arguments.");
            return;
        }

        // Parse the size of the array from the first command line argument
        int size = Integer.parseInt(args[0]);

        if (args.length != size + 1) {
            System.out.println("Please specify the correct number of elements for the array.");
            return;
        }

        // Parse the elements of the array from the remaining command line arguments
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(args[i + 1]);
        }

        // Sort the array using the bubble sort algorithm
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.print("Sorted array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

