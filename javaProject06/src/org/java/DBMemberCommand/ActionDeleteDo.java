package org.java.DBMemberCommand;

import org.java.DBMemberDAO.DBMemverDAO;

public class ActionDeleteDo implements ActionCommand{

	@Override
	public void excuteQuery() {
		System.out.println("ȸ������");
		
		DBMemverDAO dao =new DBMemverDAO();
		int rs = dao.deleteDo();
		System.out.println(rs);
		
	}
}
