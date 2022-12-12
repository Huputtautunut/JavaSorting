import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
         int loop=0;
    while (loop == 0){
            //printing menu
            System.out.println("Menu of Searching and Sorting testbed.\n" +
                    "1) Linear searching\n" +
                    "2) Binary Searching\n" +
                    "3) 0(n^2) type sorting\n" +
                    "4) 0(n*log(n)) type of sorting\n" +
                    "5) Sorting performance" +
                    "\n" +
                    "q/Q) Quit\n" +
                    "\n");

            //asking for user input
            Scanner meth = new Scanner(System.in);
            System.out.print("Your choice: ");
            char choice = meth.next().charAt(0);

            if (choice == '1') {
            //Linear search
                //ask user for values
                Scanner val1 = new Scanner(System.in);
                System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
                int linear = val1.nextInt();
                int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                int x = arr.length;
                int i;

                //for loop that goes through the array looking for user input
                for (i=0; i<x; i++){
                    if (arr[i]==linear){
                        System.out.println("\nFound\n");

                        break;
                    }

                }
                if(i==x){
                    System.out.println("\nNot found\n");
                }
             }
            else if (choice == '2') {
                Scanner val1 = new Scanner(System.in);
                System.out.print("In the list are values 0, ..., 9; which value would you like to search with binary search? ");
                int linear = val1.nextInt();
                int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                int x = arr.length;

                //binary search
                int i = Arrays.binarySearch(arr, linear);
                if (i<0)
                    System.out.println("\nNot found\n");
                else
                    System.out.println("\nFound\n");
            }
            else if (choice == '3') {
                //using bubble sort
                int[] arr = new int[10];
                //Generoidaan 10 rändöm numeroo välillä 1 -100
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 100 + 1);
                }//end for loop

                //print array
                System.out.println("Data set before insertion sorting:");

                for(int i=0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.print("\n\n");

                //bubble sort in action
                int n = arr.length;
                int temp = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < (n - i); j++) {
                        if (arr[j - 1] > arr[j]) {
                            //swap elements
                            temp = arr[j - 1];
                            arr[j - 1] = arr[j];
                            arr[j] = temp;
                        }

                    }
                }

                //print sorted array
                System.out.println("Data set after insertion soting:");
                for(int i=0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.print("\n\n");
            }
            else if (choice == '4') {
                //quick sort
                int[] arr = new int[10];
                //Generoidaan 10 rändöm numeroo välillä 1 -100
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 100 + 1);
                }//end for loop

                //print array
                System.out.println("Data set before quicksort:");

                for(int i=0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.print("\n\n");

                sort(arr, 0, arr.length - 1);
                System.out.println("Sorted array: ");
                for (int i = 0; i < arr.length; i++)
                    System.out.print(arr[i] + " ");

                System.out.println("\n");


            } else if (choice == '5') {
                //code coming soon
            } else {
                //code coming soon
            loop=6;
            }
        }

    }

    //This function will swap elements around
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i=(low-1);

    for(int j=low; j<=high-1; j++){
        if (arr[j]<pivot){
            i++;
            swap(arr, i, j);
        }

    }
    swap(arr, i+1, high);
    return(i+1);
    }

    //Quicksort in action

    static void sort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            sort(arr, low, pi -1);
            sort(arr, pi +1, high);
        }
    }
}
