package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionDeleteDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ�� Ż��");
		MemberDao dao = new MemberDao();
		int rs = dao.DeleteDo();
		System.out.println(rs);
	}
}
