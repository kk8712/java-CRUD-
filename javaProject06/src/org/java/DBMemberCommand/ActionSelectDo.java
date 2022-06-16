package org.java.DBMemberCommand;

import java.util.ArrayList;
import org.java.DBMemberDAO.DBMemverDAO;
import org.java.DBMemberDTO.DBMemberDTO;

public class ActionSelectDo implements ActionCommand{

	@Override
	public void excuteQuery() {
		System.out.println("È¸¿øÅ»Åð");
		
		DBMemverDAO dao =new DBMemverDAO();
		ArrayList<DBMemberDTO> list=dao.list();
		
		System.out.println(list);
		
	}
}
