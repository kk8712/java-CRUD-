package org.project.interfaceEx;

public interface InterfaceEx1 {
	//�������̽��� ���
	//int num1; //final�� �ƴ� �ʵ�� ����Ҽ� ����.
	
	//�ѹ��� �ʱ�ȭ , final �ʵ�� ���
	public static final int MAXIMUN =100; 
	
	//�߻� �޼ҵ�, �ݵ�� �������̵�� �����ؾߵ�
	public abstract void abstractEx(); 
	// public abstract ����� �ڵ��Է� 
	void abstractEx2();
	
	default void defaultMethod() {
		System.out.println("default�޼ҵ�");
	}
	
	public static void staticMethod() {
		System.out.println("static�޼ҵ�");
	}
//	public void basicMethod() {}  //�Ϲ� �޼ҵ�� ��� �ȵ�
}
