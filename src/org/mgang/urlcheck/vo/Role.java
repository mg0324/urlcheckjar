package org.mgang.urlcheck.vo;

import java.util.List;

/**
 * 
 * @author meigang 2014-11-4 8:37
 * 角色实体
 */
public class Role {
	/**
	 * 
	FieldTypeComment
	roleIdint(11) NOT NULL
	roleNamevarchar(32) NULL
	roleGradetinyint(4) NULL
	 */
	private int roleId;
	private String roleName;
	private String note;
	
	private List<Function> funList;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Function> getFunList() {
		return funList;
	}

	public void setFunList(List<Function> funList) {
		this.funList = funList;
	}
	
	
	
}
