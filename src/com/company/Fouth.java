package com.company;

public class Fouth {
    public Fouth()
    {
        int arr[] = { 3,5,6,1,2,3};
        int largest = arr[0];
        int secondLargest = 0;

        System.out.println("The given array is:" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }

        System.out.println("\nSecond largest number is:" + secondLargest);

    }
}

