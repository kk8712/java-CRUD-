package org.project.memberCommend;

import org.project.memberDao.MemberDao;

public class ActionUpdateDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원 정보 수정");
		
		MemberDao dao =new MemberDao();
		int rs = dao.updateDo();
		System.out.println(rs);
	}
}
