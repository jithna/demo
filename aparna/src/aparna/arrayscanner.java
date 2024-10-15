package aparna;

import java.util.Scanner;

public class arrayscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int i;
for(i=0;i<a.length-1;i++)
{
System.out.println(a[i]);
}
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int b[]=new int [n];
System.out.println("enter array element");
for(i=0;i<a.length-1;i++)
{
	a[i]=sc.nextInt();
}
for(i=0;i<a.length-1;i++)
{	
System.out.println(a[i]);
}
}
}