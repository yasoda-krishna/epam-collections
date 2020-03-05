package com.klu;
import java.util.*;
public class Methodoflist{ 
public static void main (String args[])
{
	ArrayList<String> list1=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	System.out.println("1-->add   2-->remove   3-->fetch   4-->print   5-->exit");
	int t=sc.nextInt();
	while(t<5)
	{
		if(t==1)
		{
			System.out.println("enter element to add into a list");
			String k=sc.next();
			addition(list1,k);
			System.out.println("1-->add		2-->remove    3-->fetch   4-->print   5-->exit");
			t=sc.nextInt();
		}
		else if(t==2)
		{
			System.out.println("enter element to remove from list");
			String k=sc.next();
			remove(list1,k);
			System.out.println("1-->add		2-->remove    3-->fetch   4-->print   5-->exit");
			t=sc.nextInt();
		}
		else if(t==3)
		{
			System.out.println("enter index value");
			int i=sc.nextInt();
			fetch(list1,i);
			System.out.println("1-->add		2-->remove    3-->fetch   4-->print   5-->exit");
			t=sc.nextInt();
		}
		else if(t==4)  
		{
			printlist(list1);
			System.out.println("1-->add		2-->remove    3-->fetch   4-->print   5-->exit");
			t=sc.nextInt();
		}
	}
	sc.close();
}
private static void fetch(ArrayList<String> list,int v)
{
	System.out.println(list.get(v));
}
private static void remove(ArrayList<String> list,String s)
{
	list.remove(s);
}
private static void addition(ArrayList<String> list,String p) {
	list.add(p);
}
private static void printlist(ArrayList<String> list)
{
	for(String i :list)
	{
		System.out.print(i+"  ");
	}
	System.out.println("");
}
}