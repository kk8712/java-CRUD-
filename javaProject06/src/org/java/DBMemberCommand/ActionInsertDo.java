package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemverDAO;

public class ActionInsertDo implements ActionCommand{

	@Override
	public void excuteQuery() {
		System.out.println("ȸ����ȸ");
		
		DBMemverDAO dao=new DBMemverDAO();
		int rs = dao.insertDo();
		System.out.println(rs);
		
	}
}
