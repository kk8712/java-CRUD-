package org.project.memberCommend;

import java.util.ArrayList;

import org.project.memberDao.MemberDao;
import org.project.memberDto.MemberDto;

public class ActionSelectDo extends ExcuteCommend {

	@Override
	public void excuteQuery() {
		System.out.println("ȸ�� ��ȸ");
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> list= dao.list();
		System.out.println(list);
	}
}
