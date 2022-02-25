package Example1;
import java.util.Scanner;
public class ArraySec {
public static void main(String[] args) {
	// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
int ar[]=new int[size];
int largest=0;
int second_largest=0;
for(int i=0;i<ar.length;i++)
{
	System.out.println("enter array values");
	ar[i]=sc.nextInt();
}
for(int i=0;i<ar.length;i++)
{
	System.out.print(ar[i]+" ");
}
System.out.println();
for(int i=0;i<ar.length;i++){
	if(ar[i]>largest){
		second_largest=largest;
		largest=ar[i];
	}
	else if(ar[i]>second_largest)
		second_largest=ar[i];
}
System.out.println("second_largest is "+second_largest);
	}
}