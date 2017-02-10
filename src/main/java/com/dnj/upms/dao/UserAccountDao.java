package com.dnj.upms.dao;

import org.apache.ibatis.annotations.Param;

import com.dnj.upms.entity.UserAccount;

/**
 * 用户登录信息
 * @author guofeng
 *
 */
public interface UserAccountDao {

	/**
	 * 添加用户
	 * @param userAccount
	 * @return 大于0添加成功
	 */
	int addUserAccount(UserAccount userAccount);
	/**
	 * 登录
	 * @param userName
	 * @param PWD
	 * @return 登录成功返回登录用户信息
	 */
	UserAccount login(@Param("username") String userName,@Param("pwd") String PWD);
	/**
	 * 验证用户是否登录
	 * @param userID
	 * @param token
	 * @return 大于0成功
	 */
	int checkLogin(@Param("userid") int userID,@Param("token") String token );
}
