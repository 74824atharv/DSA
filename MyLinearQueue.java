package com.demo.beans;

import java.util.Arrays;

public class MyLinearQueue {
	private int[]arr;
	private int size;
	private int front;
	private int rear;
	public MyLinearQueue()
	{
		arr=new int[20];
		size=20;
		front=0;
		rear=-1;
	}
	public MyLinearQueue(int s)
	{   //System.out.println("jdskhfs");
		size=s;
		arr=new int[size];
		
		front=0;
		rear=-1;
	}
	public void enqueue(int n)
	{   if(rear==size-1) // is full condition
	  {
		System.out.println("Array is full you cannot add elemnts");
		//return -1;
	  }
	else
	{
		rear++;
		arr[rear]=n;
		System.out.println(n+ "  added at "+rear+ "  position");
		
	}
//	System.out.println(Arrays.toString(arr));
		
	}
	public int dequeue()
	{  if(front>rear) // is empty condition
	{
		System.out.println("Array is empty you cannot delete the elements");
		return -1;
	}
	else
	{
		int n=arr[front];
		System.out.println(n+ " Element delete from array at "+front+" position");
		front++;
		return n;
	}
		
		
	}

}
