package org.project.interfaceEx;

public interface InterfaceEx1 {
	//인터페이스의 멤버
	//int num1; //final이 아닌 필드는 사용할수 없다.
	
	//한번만 초기화 , final 필드와 사용
	public static final int MAXIMUN =100; 
	
	//추상 메소드, 반드시 오버라이드로 구현해야됨
	public abstract void abstractEx(); 
	// public abstract 안적어도 자동입력 
	void abstractEx2();
	
	default void defaultMethod() {
		System.out.println("default메소드");
	}
	
	public static void staticMethod() {
		System.out.println("static메소드");
	}
//	public void basicMethod() {}  //일반 메소드는 사용 안됨
}
