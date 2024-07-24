package Hw;

import java.util.Scanner;

public class Secondlargestelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();

		if (size < 2) {
			System.out.println("Array size must be at least 2 to find the second largest element.");
			sc.close();
			return;
		}

		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		int secondLargest = findSecondLargest(array);
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element (array may contain all identical elements).");
		} else {
			System.out.println("The second largest element is: " + secondLargest);
		}

		sc.close();
	}

	public static int findSecondLargest(int[] array) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}

		return secondLargest;
	}
}
