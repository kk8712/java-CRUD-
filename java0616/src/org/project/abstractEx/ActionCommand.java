package org.project.abstractEx;

public abstract class ActionCommand {
	public int num;
	public void son() {
		System.out.println("인스턴스 메소드");
		
	}
	public abstract void excuteQuery();
}
