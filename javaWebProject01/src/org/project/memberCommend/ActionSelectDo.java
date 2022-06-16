package org.project.memberCommend;

import java.util.ArrayList;

import org.project.memberDao.MemberDao;
import org.project.memberDto.MemberDto;

public class ActionSelectDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("회원 조회");
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> list= dao.list();
		System.out.println(list);
	}
}
