package org.project.interfaceEx;

//인터페이스는 접근제한자 PUBLIC 생략 가능
public interface InterfaceEx3sub extends InterfaceEx3,InterfaceEx4 {
	void abstractMethod3();
	@Override
	default void abstractMethod1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	default void abstractMethod2() {
		// TODO Auto-generated method stub
		
	}

}

