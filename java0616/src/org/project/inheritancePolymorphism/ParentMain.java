package org.project.inheritancePolymorphism;

public class ParentMain {
	public static void main(String[] args) {
		
		Parent p1=new Parent();
		p1.num1=10;
		p1.num2=50;
		Parent p2 = new Sub1();
		p2.num1=100;
		p2.num2=300;
//		p2.num3=500;
//		p2.num4=700;
		Parent p3 =new Sub1Sub();
		p3.num1=1000;
		p3.num2=3000;
		
	}
}
