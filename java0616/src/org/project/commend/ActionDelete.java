package org.project.commend;

import org.project.dao.MemberDao;

public class ActionDelete extends ExcuteCommand {
	
	@Override
	public void excuteQuery() {
		System.out.println("È¸¿øÅ»Åð");
		
		MemberDao dao = new MemberDao();
		int rs = dao.DeleteDo();
		System.out.println("rs¹ÝÈ¯°ª : "+rs);
	}
}
