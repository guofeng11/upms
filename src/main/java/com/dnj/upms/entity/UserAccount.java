package com.dnj.upms.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class UserAccount {
	private Integer ID;
	private String UserName;
	private String NickName;
	private String PassWord;
	private UUID Token;
	private Integer Status;
	private String Email;
	private String Phone;
	private String UserType;
	private Integer ComeForm;
	private Integer UserLevel;
	private Integer OrgId;
	private Integer JobTitleId;
	private LocalDateTime CreateTime;
	private LocalDateTime CreaterId;
	private String Creater;
	
		
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public UUID getToken() {
		return Token;
	}
	public void setToken(UUID token) {
		Token = token;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public Integer getComeForm() {
		return ComeForm;
	}
	public void setComeForm(Integer comeForm) {
		ComeForm = comeForm;
	}
	public Integer getUserLevel() {
		return UserLevel;
	}
	public void setUserLevel(Integer userLevel) {
		UserLevel = userLevel;
	}
	public Integer getOrgId() {
		return OrgId;
	}
	public void setOrgId(Integer orgId) {
		OrgId = orgId;
	}
	public Integer getJobTitleId() {
		return JobTitleId;
	}
	public void setJobTitleId(Integer jobTitleId) {
		JobTitleId = jobTitleId;
	}
	public LocalDateTime getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		CreateTime = createTime;
	}
	public LocalDateTime getCreaterId() {
		return CreaterId;
	}
	public void setCreaterId(LocalDateTime createrId) {
		CreaterId = createrId;
	}
	public String getCreater() {
		return Creater;
	}
	public void setCreater(String creater) {
		Creater = creater;
	}
	public UserAccount() {
	}
	public UserAccount(String userName, String passWord,UUID token, String email, String phone,Integer comeform, Integer userLevel,
			LocalDateTime createTime) {
		UserName = userName;
		PassWord = passWord;
        Token=token;
		Email = email;
		Phone = phone;
		ComeForm=comeform;
		UserLevel = userLevel;
		CreateTime = createTime;
	}
	public UserAccount(Integer iD, String userName, String nickName, String passWord, UUID token, Integer status,
			String email, String phone, String userType, Integer comeForm, Integer userLevel, Integer orgId,
			Integer jobTitleId, LocalDateTime createTime, LocalDateTime createrId, String creater) {
		super();
		ID = iD;
		UserName = userName;
		NickName = nickName;
		PassWord = passWord;
		Token = token;
		Status = status;
		Email = email;
		Phone = phone;
		UserType = userType;
		ComeForm = comeForm;
		UserLevel = userLevel;
		OrgId = orgId;
		JobTitleId = jobTitleId;
		CreateTime = createTime;
		CreaterId = createrId;
		Creater = creater;
	}
	
	
	
}
