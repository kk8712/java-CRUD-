package org.project.abstractEx;

import java.util.Scanner;

public class ExcuteController {
	public static void main(String[] args) {
		Scanner query = new Scanner(System.in);
		ActionCommand action = null;
		while (true) {
			System.out.println("쿼리문 입력");
			String qu = query.next();
			if (qu.equals("insert")) {
				action = new ActionInsert();
				action.excuteQuery();
			} else if (qu.equals("delete")) {
				action = new ActionDelete();
				action.excuteQuery();
			} else if (qu.equals("update")) {
				action = new ActionUpdate();
				action.excuteQuery();
			} else if (qu.equals("select")) {
				action = new ActionSelect();
				action.excuteQuery();
			} else if (qu.equals("exit")) {
				System.out.println("종료");
				query.close();
				break;
			} else {
				System.out.println("다시 입력해");
			}
		}
	}
}
