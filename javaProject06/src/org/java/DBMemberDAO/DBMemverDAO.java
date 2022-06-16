package org.java.DBMemberDAO;

import java.util.ArrayList;

import org.java.DBMemberDTO.DBMemberDTO;

public class DBMemverDAO {

	//싱글톤 패턴 ==> 객체 한번만 생성
//	private static final DBMemverDAO INSTANCE =  new DBMemverDAO(); 
//	private DBMemverDAO() {};
//	
//	public static DBMemverDAO getInstance() {
//		return INSTANCE;
//	}
	
	public DBMemverDAO() {
		System.out.println("DAO생성자");
	}
	
	//CRUD, DB Access Object
	
	public int insertDo() {
		System.out.println("DB 회원가입");
		int result =0;
		//회원 가입 실행
		return result;
	}
	public ArrayList<DBMemberDTO> list(){
		ArrayList<DBMemberDTO> lists =new ArrayList<DBMemberDTO>();
		
		//회원 조회 실행
		
		return lists;
	}
	public int updateDo() {
		System.out.println("DB 회원정보 수정");
		int result =0;
		return result;
	}
	public int deleteDo() {
		System.out.println("DB회원 탈퇴");
		int result =0;
		return result;
	}
}
