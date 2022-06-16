package org.java.DBMemberController;

import java.util.Scanner;

import org.java.DBMemberCommand.ActionCommand;
import org.java.DBMemberCommand.ActionDeleteDo;
import org.java.DBMemberCommand.ActionInsertDo;
import org.java.DBMemberCommand.ActionSelectDo;
import org.java.DBMemberCommand.ActionUpdateDo;


public class DBMemverController {
	public static void main(String[] args) {
		Scanner query = new Scanner(System.in);
		ActionCommand commend =null;


		while (true) {
			System.out.println("쿼리문 입력 하세요 (insert/select/update/delete)");
			String q = query.next();

			if (q.equals("insert")) {
				commend = new ActionInsertDo();
				commend.excuteQuery();
			} else if (q.equals("select")) {
				commend = new ActionSelectDo();
				commend.excuteQuery();
			} else if (q.equals("delete")) {
				commend = new ActionDeleteDo();
				commend.excuteQuery();
			} else if (q.equals("update")) {
				commend = new ActionUpdateDo();
				commend.excuteQuery();
			} else if (q.equals("exit")) {
				System.out.println("종료");
				query.close();
				break;
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}
}
