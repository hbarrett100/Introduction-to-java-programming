/*********************************************************************************
(Merge two sorted lists) Write the following method that merges two sorted     
lists into a new sorted list.                                                  
                                                                               
public static int[] merge(int[] list1, int[] list2)                            
                                                                                
Implement the method in a way that takes at most list1.length + list2.         
length comparisons. Write a test program that prompts the user to enter two    
sorted lists and displays the merged list. Here is a sample run. Note that the 
first number in the input indicates the number of the elements in the list.    
This number is not part of the list.                                            
*********************************************************************************/

package practise;

import java.util.Scanner;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt the user to enter the two lists
		System.out.println("Enter list1:");

		int list1Size = input.nextInt();
		int[] list1 = new int[list1Size];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.println("Enter list2:");

		int list2Size = input.nextInt();
		int[] list2 = new int[list2Size];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		//create merged list 
		int[] mergedLists = merge(list1, list2);
		//display the merged list
		printArray(mergedLists);
		
		//close the scanner
		input.close();
	}

	//return a sorted list containing the two lists merged together
	public static int[] merge(int[] list1, int[] list2) {
		int[] mergedLists = new int[list1.length + list2.length];

		for (int i = 0; i < list1.length; i++) {
			mergedLists[i] = list1[i];
		}

		for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
			mergedLists[j] = list2[i];
		}

		//call the sort method to sort the new list
		sort(mergedLists);

		return mergedLists;

	}

	//sort the list in ascending order
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}

			}
			
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
	}

	//display the list
	public static void printArray(int[] arr) {
		System.out.println("The sorted merged list is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
