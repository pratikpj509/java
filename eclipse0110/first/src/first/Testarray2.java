package first;

import java.util.Scanner;

public class Testarray2 {
	public static void acceptData(int [] arr){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Elements of array ");
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
}
	public static void displayData(int [] arr){
		System.out.println("Display Elements of array ");
		for(int i=0; i<arr.length;i++){
		System.out.println(arr[i]+" ");
		}
}
	public static int[] prime(int []arr){// 6 101 3 5 1
		int[] temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			boolean a=true;
			for(int j=2;j<num;j++) {
				if(num%j==0) {
					a=false;
					break;
				}
			}
			if(a==true) {
				temp[i]=num;
			}
			
		}
		return temp;
}
	public static void AddDigits(int[] arr) {
				
		for(int i=0;i<arr.length;i++) { // 11 23 45
			int rem=0;
			int sum=0;
			int num =arr[i];
			if(arr[i]%2==1) {
				while(arr[i]>0) {
				 rem=arr[i]%10;
				 sum=sum+rem;
				 arr[i]=arr[i]/10;
				}
				System.out.println(num+ "is a odd number and sum of digits: "+sum);			} 
			
		}

	}
	public static int[] FactorialFind(int arr[]) {
		
		int temp[]=new int[arr.length];
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			int fac=1;
			if(arr[i]<7) {
				int n=arr[i];
				for(int j=1;j<=n;j++) {
					fac=fac*j;
			  }
				temp[cnt]=fac;
				cnt++;
			}
		}
		return temp;
	}
	

}
