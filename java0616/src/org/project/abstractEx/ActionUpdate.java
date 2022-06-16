package org.project.abstractEx;

public class ActionUpdate extends ActionCommand {
	
	@Override
	public void excuteQuery() {
		System.out.println("회원 정보 수정");
	}

}
