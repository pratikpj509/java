package first;
import java.util.*;
public class TestArray {
		
		public static void main(String args[]){
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter Size of Array ");
			int n=sc.nextInt();
			int arr[]=new int[n];
			Testarray2.acceptData(arr);
			Testarray2.displayData(arr);
			
			int choice;
			do{
				System.out.println("1. Display all Prime numbers from array \n 2. Find addition of digits of odd numbers in array \n");
				System.out.println("3. Find factorials of all numbers in array which are less than 7 \n 4. find Nth Max Prime number \n");
				System.out.println("\n 5. find Nth Min prime numbers \n");
				choice= sc.nextInt();
				switch(choice) {
					case 1:
						int arr1[]=Testarray2.prime(arr);
						for(int i=0;i<arr1.length;i++) {
							System.out.println(arr1[i]);
							
						}
						break;
					case 2:
						Testarray2.AddDigits(arr);
						break;
					case 3:
						int ans[]=Testarray2.FactorialFind(arr);
						for(int i=0;i<ans.length;i++) {
							System.out.println(ans[i]);
						}
						break;
				}
			}
			while(choice!=5);
			  
			}

	

}
