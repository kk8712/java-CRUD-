package org.project.commend;

import java.util.ArrayList;
import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class ActionSelect extends ExcuteCommand {
	
	@Override
	public void excuteQuery() {
		System.out.println("ȸ����ȸ");
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> lists = dao.list();
		System.out.println(lists);
		
	}
}
