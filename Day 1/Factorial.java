import java.util.Scanner;
class Factorial{
  	public static int fact(int f){
		int fac=1;
		for(int i=1;i<=f;i++){
			fac=fac*i;
		}
	return fac;
	}
  	public static void main(String []args){
       		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
         	int n=sc.nextInt();
         	int ans=fact(n);
        	System.out.println("factorial is:"+ans);
	}
}

