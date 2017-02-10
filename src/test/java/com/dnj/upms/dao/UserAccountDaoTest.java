package com.dnj.upms.dao;


import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Test;

import com.dnj.upms.BaseTest;
import com.dnj.upms.entity.UserAccount;



public class UserAccountDaoTest extends BaseTest{

	//注入Dao实现类依赖
	@Resource
	private UserAccountDao userAccountDao;

	@Test
	public void addUserAccount() throws Exception {
		UserAccount userAccount=new UserAccount("admin","123456",UUID.randomUUID(),"admin@dnj.com","12345678901",1,1,LocalDateTime.now());
		int r=userAccountDao.addUserAccount(userAccount);
		System.out.println(r);
	}
	@Test
   public void login() {
		UserAccount userAccount=userAccountDao.login("admin", "123456");
		System.out.println("id:"+userAccount.getID()+"token:"+userAccount.getToken());
	}
	@Test
	   public void checkLogin() {
			int i=userAccountDao.checkLogin(2, "05a31884-fcfb-4a96-9b23-1983a37a8f2b");
			if (i>0) {
				System.out.println("登录成功");
			}
			else {
				System.out.println("登录失败");
			}
		}
}
