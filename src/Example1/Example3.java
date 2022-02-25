package Example1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Example3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>(); 
//li.add(10);
//li.add(5);
//li.add(18);
//li.add(12);
//li.add(3);
//li.add(1);
//Collections.sort(li);
//System.out.println(li);
//System.out.println(li.lastIndexOf(li));
//int largest =0;
//int second_largest=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
for(int i=0;i<size;i++)
{
	System.out.println("enter list values");
	li.add(sc.nextInt());
}
System.out.println(li);
li.remove(Collections.max(li));
System.out.println("second largest number is "+Collections.max(li));
	}
}