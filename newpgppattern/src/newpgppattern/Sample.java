package newpgppattern;

import java.util.regex.Pattern;

public class Sample {

	public static void main(String[] args) {
		
		
		Pattern pt=Pattern.compile(":");
		
		String[] split=pt.split("one:two:three",2);
		
		for(String ele:split)
		{
		System.out.println("Splitting Element::"+ele);	
		}

	}

}
