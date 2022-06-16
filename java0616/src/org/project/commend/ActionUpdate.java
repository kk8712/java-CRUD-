package org.project.commend;

import org.project.dao.MemberDao;

public class ActionUpdate extends ExcuteCommand {
	
	@Override
	public void excuteQuery() {
		System.out.println("회원수정");
		
		MemberDao doa = new MemberDao();
		int rs = doa.updateDo();
		System.out.println("rs반환값 : "+rs);
	}
}
