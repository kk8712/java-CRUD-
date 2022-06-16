package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemverDAO;

public class ActionInsertDo implements ActionCommand{

	@Override
	public void excuteQuery() {
		System.out.println("회원조회");
		
		DBMemverDAO dao=new DBMemverDAO();
		int rs = dao.insertDo();
		System.out.println(rs);
		
	}
}
