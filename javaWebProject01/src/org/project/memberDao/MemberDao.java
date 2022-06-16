package org.project.memberDao;

import java.util.ArrayList;

import org.project.memberDto.MemberDto;

public class MemberDao {
	public MemberDao() {
	}
	public int insertDo() {
		System.out.println("DB회원가입");
		
		int rs =0;
		return rs;
	}
	public int updateDo() {
		System.out.println("DB회원정보 수정");
		
		int rs =1;
		return rs;
	}
	public int DeleteDo() {
		System.out.println("DB회원탈퇴");
		
		int rs =2;
		return rs;
	}
	public ArrayList<MemberDto> list(){
		ArrayList<MemberDto> lists=new ArrayList<MemberDto>();
        return lists;
	}
}
