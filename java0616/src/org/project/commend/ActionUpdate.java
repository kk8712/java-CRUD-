package org.project.commend;

import org.project.dao.MemberDao;

public class ActionUpdate extends ExcuteCommand {
	
	@Override
	public void excuteQuery() {
		System.out.println("ȸ������");
		
		MemberDao doa = new MemberDao();
		int rs = doa.updateDo();
		System.out.println("rs��ȯ�� : "+rs);
	}
}
