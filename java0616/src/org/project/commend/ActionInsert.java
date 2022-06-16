package org.project.commend;

import org.project.dao.MemberDao;

public class ActionInsert extends ExcuteCommand {
	
	@Override
	public void excuteQuery() {
		System.out.println("회원가입");
							//싱글톤 패턴 객체 생성(한번만 생성)
//		MemberDao dao =  MemberDao.getInstance();
		MemberDao dao = new MemberDao();
		int rs = dao.insertDo();
		System.out.println("rs반환값 : "+rs);
	}
}
