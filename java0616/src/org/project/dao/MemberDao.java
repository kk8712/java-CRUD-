package org.project.dao;

import java.util.ArrayList;

import org.project.dto.MemberDto;

public class MemberDao {
	// �̱��� ���� -> ��ü�� �ѹ��� ����
	//final ����� �ѹ��� �ʱ�ȭ ->MemberDao��ü�� �ѹ��� ����
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
		System.out.println("DBȸ������");
		int rs = 0;
		
		
		return rs;
	}
	public int updateDo() {
		System.out.println("DBȸ������");
		int rs = 0;
		
		return rs;
	}
	public int DeleteDo() {
		System.out.println("DBȸ��Ż��");
		int rs = 0;
		
		return rs;
	}
	
	public ArrayList<MemberDto> list(){
		System.out.println("DBȸ����ȸ");
		ArrayList<MemberDto> lists =new ArrayList<MemberDto>();
		
		return lists;
	}
}
