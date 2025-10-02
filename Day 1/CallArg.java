class CallArg{
 public static void main(String[] args){
int sum=0;
  if(args.length<0){
    System.out.println("error:give minimum 1 argument"); 
  }
for(int i=0;i<args.length;i++){
//System.out.println(Integer.parseInt(args[i));
sum=sum+Integer.parseInt(args[i]); 
//System.out.println(Integer.parseInt(args[i));
}
System.out.println("sum is:"+sum);
}
}