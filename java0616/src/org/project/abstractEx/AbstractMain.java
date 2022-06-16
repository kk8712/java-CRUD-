package org.project.abstractEx;

public class AbstractMain {
	public static void main(String[] args) {
		
		//´ÙÇü¼º
		AbstractEx1sub a1=new AbstractEx1sub();
		a1.abstractMethod();
		a1.m1();
		
		AbstractEx2 a2= new AbstractEx2subsub();
		a2.abstractMethod();
		a2.abstractEx2subMethod(50, 60);
		
	}
}
