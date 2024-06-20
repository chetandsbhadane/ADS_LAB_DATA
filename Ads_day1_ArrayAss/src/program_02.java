import java.util.Scanner;

//Array Operations...
//1.insert at index 
//2.delete at index 
public class program_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size];
		int num = 66;
		int index = 3;
		//1,2,3,4,5 ==> 2-->6
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt(); 
		}
		
		int newarr[] = new int[size+1];
		for(int i=0;i<size+1;i++) {
			if(i < index-1) {
				newarr[i] = arr[i]; //copy all elements in new array
			}
			else if(i == index-1) {
				newarr[i] = num; //insert particular element in new arr.
			}
			else {
				newarr[i] = arr[i-1]; //insert other after that
			}
		}
		
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]); 
		}
		
	}
}
