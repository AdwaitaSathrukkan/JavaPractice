package Arrays;
import java.util.*;

public class Main {
    public void search(int[] A,  int x) {
        boolean found = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                System.out.println(x + " found at index: " + i);
                found = true;
                break; // Once found, no need to continue searching
            }
        }
        if (!found) {
            System.out.println(x + " not found");
        }
    }

    public static void main(String[] args) {
        Main mainObject = new Main(); // Create an instance of Main class to use its methods
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Entered elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

        // Example search
        System.out.print("Enter the number to search: ");
        int searchNum = sc.nextInt();
        mainObject.search(marks,  searchNum);


    }
}
