package org.project.memberController;

import java.util.Scanner;

import org.project.memberCommend.ActionDeleteDo;
import org.project.memberCommend.ActionInsertDo;
import org.project.memberCommend.ActionSelectDo;
import org.project.memberCommend.ActionUpdateDo;
import org.project.memberCommend.ExcuteCommend;

public class MemberController {
	public static void main(String[] args) {
		Scanner query = new Scanner(System.in);
		ExcuteCommend commend =null;
//		ExcuteCommend in = new ActionInsertDo();
//		ExcuteCommend se = new ActionSelectDo();
//		ExcuteCommend up = new ActionUpdateDo();
//		ExcuteCommend de = new ActionDeleteDo();

		while (true) {
			System.out.println("������ �Է� �ϼ��� (insert/select/update/delete)");
			String q = query.next();

			if (q.equals("insert")) {
//				in.excuteQuery();
				commend = new ActionInsertDo();
				commend.excuteQuery();
			} else if (q.equals("select")) {
//				se.excuteQuery();
				commend = new ActionSelectDo();
				commend.excuteQuery();
			} else if (q.equals("delete")) {
//				de.excuteQuery();
				commend = new ActionDeleteDo();
				commend.excuteQuery();
			} else if (q.equals("update")) {
//				up.excuteQuery();
				commend = new ActionUpdateDo();
				commend.excuteQuery();
			} else if (q.equals("exit")) {
				System.out.println("����");
				query.close();
				break;
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}

	}
}
