package Example1;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enyer size of array");
	n=sc.nextInt();
		int arr[]=new int[n];
//	System.out.println("enter size");
	//Size=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println("enter array value"+"\t"+i+"\t"+"index");
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
			
		

	}

}
