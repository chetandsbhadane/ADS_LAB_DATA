import java.util.Scanner;

public class program_01 {

	public static int findMax(int arr[], int size) {
		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (max < arr[i]) { // 33 66 88 22 44 33>66
				max = arr[i];
			}
		}
		return max;
	}

	public static int findmin(int arr[], int size) {
		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (max > arr[i]) { // 33 66 88 22 44 33>66
				max = arr[i];
			}
		}
		return max;
	}

	public static int findSum(int arr[], int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static int secondLargest(int arr[], int size) {
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) { // 33 55 88 22 44 ---> if 33<55 =>55, 55<88, 88
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}

	public static void reverseArray(int arr[], int size) {
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static int findOccurrence(int arr[], int number) {
		int count = 0;
		for (int i = 0; i<arr.length; i++) {
			if(number == arr[i]) {
				count++;
			}			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements to an array..");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int ch = 0;
		do {
			System.out.println("Enter you choice \n1.Find Max\n2.Find Min\n3.Find sum\n4.sec largest\n5.reverseArray\n6.Occurrence Number\n0.exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				// max number in array
				int max = findMax(arr, size);
				System.out.println("Max number in array is " + max + "\n\n");
				break;

			case 2:
				// min number in array
				int min = findmin(arr, size);
				System.out.println("Min number in array is " + min + "\n\n");
				break;

			case 3:
				// sum number in array
				int sum = findSum(arr, size);
				System.out.println("sum of the numbers in array is " + sum + "\n\n");
				break;
				
			case 4:
				// second largest number in array
				int secondLargest = secondLargest(arr, size);
				System.out.println("second Largest number in array is " + secondLargest + "\n\n");
	
				break;
				
			case 5:
				// reverse array
				reverseArray(arr, size);
				break;
				
			case 6:
				//find the occurrence of the number in given array...
				System.out.println("Enter number to find occurrence");
				int number = sc.nextInt();
				int occurrence = findOccurrence(arr, number);
				System.out.println("The number " + number + " Occurred in " + occurrence + " times in an array");
				break;
			}

		} while (ch != 0);

	}

}
