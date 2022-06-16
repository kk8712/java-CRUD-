package org.project.interfaceEx;

public class InterfaceEx1Main implements InterfaceEx1,InterfaceEx2{
	int num1;
	int num2;

	@Override
	public void abstractEx() {
		System.out.println("abstract1 오버라이딩");
	}
	public void abstractEx2() {
		System.out.println("abstract2 오버라이딩");
	}
	@Override
	public void abstractEx3() {
		System.out.println("abstract3 오버라이딩");
	}
}
