package org.java.DBMemberDAO;

import java.util.ArrayList;

import org.java.DBMemberDTO.DBMemberDTO;

public class DBMemverDAO {

	//�̱��� ���� ==> ��ü �ѹ��� ����
//	private static final DBMemverDAO INSTANCE =  new DBMemverDAO(); 
//	private DBMemverDAO() {};
//	
//	public static DBMemverDAO getInstance() {
//		return INSTANCE;
//	}
	
	public DBMemverDAO() {
		System.out.println("DAO������");
	}
	
	//CRUD, DB Access Object
	
	public int insertDo() {
		System.out.println("DB ȸ������");
		int result =0;
		//ȸ�� ���� ����
		return result;
	}
	public ArrayList<DBMemberDTO> list(){
		ArrayList<DBMemberDTO> lists =new ArrayList<DBMemberDTO>();
		
		//ȸ�� ��ȸ ����
		
		return lists;
	}
	public int updateDo() {
		System.out.println("DB ȸ������ ����");
		int result =0;
		return result;
	}
	public int deleteDo() {
		System.out.println("DBȸ�� Ż��");
		int result =0;
		return result;
	}
}
