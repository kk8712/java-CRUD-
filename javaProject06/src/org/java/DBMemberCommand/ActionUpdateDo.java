package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemverDAO;

public class ActionUpdateDo implements ActionCommand{

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������ ����");
		
		DBMemverDAO dao =new DBMemverDAO();
		int rs = dao.updateDo();
		System.out.println(rs);
		
		
	}
}
