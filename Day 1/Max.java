import java.util.Scanner;

class Max{
	public static void main(String [] args){
	Scanner sc=new Scanner (System.in);
System.out.println("Enter three numbers : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	if(a>b && a>c){
	System.out.println("Maximum no out of three : "+a);	
}else if(b>a && b>c){
System.out.println("Maximum no out of three : "+b);
}else{
System.out.println("Maximum no out of three : "+c);


}
	
		
	}

}
