package org.mgang.urlcheck.vo;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author meigang 2014-11-4 8:22
 * 用户实体类
 *
 */
public class User {
	/**
	 * 
  `userId` int(11) NOT NULL auto_increment,
  `userName` varchar(16) default NULL,
  `password` varchar(16) default NULL,
  `userType` tinyint(4) default NULL,
  `score` int(11) default NULL,
  `companyName` varchar(32) default NULL,
  `companyAddress` varchar(128) default NULL,
  `publishedAdCount` tinyint(4) default NULL,
  `phone` char(11) default NULL,
  `email` varchar(64) default NULL,
  `regTime` datetime default NULL,
  `lastLoginTime` datetime default NULL,
  `loginCount` int(11) default NULL,
  `status` tinyint(4) default NULL,
	 */
	private int userId;
	private String userName;
	private String password;
	/**
	 * 会员类型：userType
		1:超级管理员
		2:普通管理员
		3:个人会员
		4:企业会员
	 */
	private int userType;
	private int score;
	private String companyName;
	private String companyAddress;
	private int publishedAdCount;
	private String phone;
	private String email;
	private Date regTime;
	private Date lastLoginTime;
	private int loginCount;
	/**
	 * 用户状态：status
	 * 1:可用
	 * 0:不可用
	 */
	private int status;
	
	private List<Role> roleList;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public int getPublishedAdCount() {
		return publishedAdCount;
	}
	public void setPublishedAdCount(int publishedAdCount) {
		this.publishedAdCount = publishedAdCount;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	
	
}
