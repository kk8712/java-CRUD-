package org.project.commend;

import org.project.dao.MemberDao;

public class ActionInsert extends ExcuteCommand {
	
	@Override
	public void excuteQuery() {
		System.out.println("ȸ������");
							//�̱��� ���� ��ü ����(�ѹ��� ����)
//		MemberDao dao =  MemberDao.getInstance();
		MemberDao dao = new MemberDao();
		int rs = dao.insertDo();
		System.out.println("rs��ȯ�� : "+rs);
	}
}
