package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;
import org.project.commend.ExcuteCommand;

public class MemberController {
	public static void main(String[] args) {
		
		Scanner query = new Scanner(System.in);
		ExcuteCommand ins = new ActionInsert();
		ExcuteCommand del = new ActionDelete();
		ExcuteCommand up = new ActionUpdate();
		ExcuteCommand sel = new ActionSelect();
		while(true) {
		System.out.println("쿼리문 입력");
		String q=query.next();
		if(q .equals("ins")) {
			ins.excuteQuery();
			System.out.println();
		}else if (q .equals("del")) {
			del.excuteQuery();
			System.out.println();
		}else if(q.equals("up")) {
			up.excuteQuery();
			System.out.println();
		}else if(q.equals("sel")) {
			sel.excuteQuery();
			System.out.println();
		}else if(q.equals("exit")) {
			System.out.println("실행종료");
			query.close();
			break;
		}else {
			System.out.println("잘못 입력함");
		}
		}
		
		
		
	}
}
