package org.mgang.urlcheck.vo;
/**
 * 
 * @author meigang 2014-11-4
 * 角色功能中间实体
 */
public class RoleFunction {
	/**
	 * 
	FieldTypeComment
	roleFunIdint(11) NOT NULL
	roleIdint(11) NULL
	funIdint(11) NULL
	havetinyint(4) NULL
	 */
	private int roleFunId;
	private Role role;
	private Function fun;
	private int roleId;
	private int funId;
	/**
	 * 该角色role拥有的fun
	 * have为1时，表示拥有
	 * have为0是，表示不拥有
	 */
	private int have;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getFunId() {
		return funId;
	}
	public void setFunId(int funId) {
		this.funId = funId;
	}
	public int getRoleFunId() {
		return roleFunId;
	}
	public void setRoleFunId(int roleFunId) {
		this.roleFunId = roleFunId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Function getFun() {
		return fun;
	}
	public void setFun(Function fun) {
		this.fun = fun;
	}
	public int getHave() {
		return have;
	}
	public void setHave(int have) {
		this.have = have;
	}
	
	
}
