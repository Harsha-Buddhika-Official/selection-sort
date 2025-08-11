import java.util.Scanner;

public class SelectionSort {
    
    // Selection sort method
    public static void sort(int[] arr) {
        int n = arr.length;
        
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            // Swap the found minimum element with the first element
            swap(arr, minIdx, i);
        }
    }
    
    // Helper method to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Method to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    // Main method to test the selection sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        printArray(arr);
        
        sort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
        
        scanner.close();
    }
}
