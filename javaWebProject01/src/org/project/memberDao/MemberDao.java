package org.project.memberDao;

import java.util.ArrayList;

import org.project.memberDto.MemberDto;

public class MemberDao {
	public MemberDao() {
	}
	public int insertDo() {
		System.out.println("DBȸ������");
		
		int rs =0;
		return rs;
	}
	public int updateDo() {
		System.out.println("DBȸ������ ����");
		
		int rs =1;
		return rs;
	}
	public int DeleteDo() {
		System.out.println("DBȸ��Ż��");
		
		int rs =2;
		return rs;
	}
	public ArrayList<MemberDto> list(){
		ArrayList<MemberDto> lists=new ArrayList<MemberDto>();
        return lists;
	}
}
