package org.project.interfaceEx;

public class InterfaceEx1Main implements InterfaceEx1,InterfaceEx2{
	int num1;
	int num2;

	@Override
	public void abstractEx() {
		System.out.println("abstract1 �������̵�");
	}
	public void abstractEx2() {
		System.out.println("abstract2 �������̵�");
	}
	@Override
	public void abstractEx3() {
		System.out.println("abstract3 �������̵�");
	}
}
