package Example1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Example5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>(); 
		int largest =0;
		int second_largest=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
for(int i=0;i<size;i++)
{
	System.out.println("enter list values");
	li.add(sc.nextInt());
}
System.out.println(li);
for(int i=0;i<size;i++){
	if(li.get(i)>largest)
	{
		second_largest=largest;
		largest=li.get(i);
	}
	else if(li.get(i)>second_largest)
		second_largest=li.get(i);
}
System.out.println("second_largest is "+second_largest);
	}
}