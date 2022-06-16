package org.project.abstractEx;

public class AbstractEx2subsub extends AbstractEx2sub {
	
	public void abstractEx2subsubMethod() {
		System.out.println("객체화할 클래스 메소드");
	}
	
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("abstractEx2 >>abstractEx2Method");
	}

	public void abstractEx2subMethod(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println("abstractEx2sub >>abstractEx2subMethod \t" + (num1 + num2));

	}
}
