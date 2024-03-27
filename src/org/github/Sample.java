package org.github;

public class Sample {
	
public static void main(String[] args) {
		
		String s="George";
		String s1="George";
		String s2="Arokiya raj";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		String s3=new String("George");
		String s4=new String("George");
		String s5=new String("Arokiya Raj");
		
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		

	}

}



