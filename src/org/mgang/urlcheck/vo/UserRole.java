package org.mgang.urlcheck.vo;
/**
 * 
 * @author Administrator
 * 用户角色中间表实体
 */
public class UserRole {
	/**
	 * 
	FieldTypeComment
	userRoleIdint(11) NOT NULL
	userIdint(11) NULL
	roleIdint(11) NULL
	havetinyint(4) NULL
	 */
	private int userRoleId;
	private User user;
	private Role role;
	private int userId;
	private int roleId;
	/**
	 * have：
	 * 1:表示user有role角色
	 * 0:表示user没有role角色
	 */
	private int have;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getHave() {
		return have;
	}
	public void setHave(int have) {
		this.have = have;
	}
	
}
