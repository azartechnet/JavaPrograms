package test3;

import java.util.concurrent.atomic.AtomicInteger;

public class Sample {

	public static void main(String[] args) 
	{
		AtomicInteger ai=new AtomicInteger(9);
		if(ai.compareAndSet(5,9))
		{
			System.out.println(ai);
		}

	}

}
