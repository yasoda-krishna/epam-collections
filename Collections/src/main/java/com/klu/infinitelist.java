package com.klu;
import java.util.*;
public class infinitelist {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("epam");
		list.add("collection");
		list.add("webina");
		for(String x: list)
		{
			System.out.print(x+" ");
		}
	}
}
