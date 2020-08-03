package com.neuedu.checkapply.entity;

/*
 * 用户名类别：
		1-医院管理员
		2-挂号收费员
		3-门诊医生
		4-医技医生
		5-药房操作员
		6-财务管理员
 * 删除标记：
		1-正常
		0-已删除
 */
public class ApplyUser {

	//用户
	private Integer id;
	private String userName;//用户名
	private String password;//密码
	private String realName;//真实姓名
	private Integer useType;//用户类别
	private Integer docTitleId;//职称ID
	private String isScheduling;//是否参与排班
	private Integer deptId;//所在科室
	private Integer registLeId;//挂号级别
	private Integer delMark;//删除标记
	public ApplyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplyUser(Integer id, String userName, String password, String realName, Integer useType, Integer docTitleId,
			String isScheduling, Integer deptId, Integer registLeId, Integer delMark) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.useType = useType;
		this.docTitleId = docTitleId;
		this.isScheduling = isScheduling;
		this.deptId = deptId;
		this.registLeId = registLeId;
		this.delMark = delMark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getUseType() {
		return useType;
	}
	public void setUseType(Integer useType) {
		this.useType = useType;
	}
	public Integer getDocTitleId() {
		return docTitleId;
	}
	public void setDocTitleId(Integer docTitleId) {
		this.docTitleId = docTitleId;
	}
	public String getIsScheduling() {
		return isScheduling;
	}
	public void setIsScheduling(String isScheduling) {
		this.isScheduling = isScheduling;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Integer getRegistLeId() {
		return registLeId;
	}
	public void setRegistLeId(Integer registLeId) {
		this.registLeId = registLeId;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "ApplyUser [id=" + id + ", userName=" + userName + ", password=" + password + ", realName=" + realName
				+ ", useType=" + useType + ", docTitleId=" + docTitleId + ", isScheduling=" + isScheduling + ", deptId="
				+ deptId + ", registLeId=" + registLeId + ", delMark=" + delMark + "]";
	}
}
