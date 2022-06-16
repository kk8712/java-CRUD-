package org.project.memberDto;

public class MemberDto {
	private String userId;
	private String userPw;
	private int userAge;
	private String uesrPhone;
	
	public MemberDto() {
		super();
	}
	
	public MemberDto(String userId, String userPw, int userAge, String uesrPhone) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userAge = userAge;
		this.uesrPhone = uesrPhone;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUesrPhone() {
		return uesrPhone;
	}
	public void setUesrPhone(String uesrPhone) {
		this.uesrPhone = uesrPhone;
	}
	
	
	
}
