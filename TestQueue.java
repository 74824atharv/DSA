package com.demo.Test;

import java.util.Arrays;

import com.demo.beans.MyLinearQueue;

public class TestQueue {

	public static void main(String[] args) {
		MyLinearQueue ob=new MyLinearQueue(4);
		ob.enqueue(12);
		ob.enqueue(21);
		ob.enqueue(28);
		ob.enqueue(25);
		ob.enqueue(27);
		
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();

	}

}
