package study1;
import java.io.*;
import java.util.Scanner;


public class IndexDemo {
	public static void main(String[] args)
	{
		int []data = {74,85,102,99,101, 85, 56};
		int index;
		int value;
		System.out.println("enter value:");
		
		value = 85;
		index = lastIndexOf(data,value);
		if(index==-1)
			System.out.println("value not found");
		else
			System.out.println("the last index of the value" + value+ "is" +index);
	}
	public static int lastIndexOf (int arr[],int val)

	{
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val);
					index=i;
		}
		return index;

		}
	}   
