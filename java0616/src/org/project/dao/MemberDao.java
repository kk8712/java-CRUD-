package org.project.dao;

import java.util.ArrayList;

import org.project.dto.MemberDto;

public class MemberDao {
	// 싱글톤 패턴 -> 객체를 한번만 생성
	//final 상수는 한번만 초기화 ->MemberDao객체가 한번만 생성
//	private static final MemberDao INSTANCE = new MemberDao();
//	private MemberDao() {}
//	
//	//static 
//	public static MemberDao getInstance() {
//		return INSTANCE;
//	}
//	
	
	public MemberDao() {
	}
	public int insertDo() {
		System.out.println("DB회원가입");
		int rs = 0;
		
		
		return rs;
	}
	public int updateDo() {
		System.out.println("DB회원수정");
		int rs = 0;
		
		return rs;
	}
	public int DeleteDo() {
		System.out.println("DB회원탈퇴");
		int rs = 0;
		
		return rs;
	}
	
	public ArrayList<MemberDto> list(){
		System.out.println("DB회원조회");
		ArrayList<MemberDto> lists =new ArrayList<MemberDto>();
		
		return lists;
	}
}
