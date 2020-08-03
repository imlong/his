package com.neuedu.user.entity;
/*
 * deptType:科室类型
 * 		1.临床
 * 		2.医技
 * 		3.财务
 * 		4.行政
 * 		5.其它
 */
//对应科室信息
public class UserDepartment {

	private Integer id;
	private String deptCode;//科室编码
	private String deptName;//科室名称
	private Integer deptCategoryId;//科室分类
	private Integer deptType;//科室类型
	private Integer delMark;//删除标记
	public UserDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDepartment(Integer id, String deptCode, String deptName, Integer deptCategoryId, Integer deptType,
			Integer delMark) {
		super();
		this.id = id;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.deptCategoryId = deptCategoryId;
		this.deptType = deptType;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getDeptCategoryId() {
		return deptCategoryId;
	}
	public void setDeptCategoryId(Integer deptCategoryId) {
		this.deptCategoryId = deptCategoryId;
	}
	public Integer getDeptType() {
		return deptType;
	}
	public void setDeptType(Integer deptType) {
		this.deptType = deptType;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	
}
