package com.neuedu.checkapply.entity;

import java.util.Date;

public class ApplyRegister {

	private Integer id;
	private String caseNumber;//病历号
	private String realName;//姓名
	private Integer gender;//性别
	private String idNumber;//身份证号
	private Date birthDate;//出生日期
	private Integer age;//年龄
	private String ageType;//年龄类型 岁/月/天
	private String homeAddress;//家庭住址
	private Date visitDate;//看诊日期
	private String noon;//午别（上午、下午）
	private Integer deptId;//挂号科室
	private Integer userId;//挂号医生
	private Integer registLeId;//挂号级别
	private Integer settleId;//结算类别
	private String isBook;//是否要病历本
	private Date registTime;//挂号时间
	private Integer registerId;//挂号员
	private Integer visitState;//看诊状态
	
	public ApplyRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplyRegister(Integer id, String caseNumber, String realName, Integer gender, String idNumber,
			Date birthDate, Integer age, String ageType, String homeAddress, Date visitDate, String noon,
			Integer deptId, Integer userId, Integer registLeId, Integer settleId, String isBook, Date registTime,
			Integer registerId, Integer visitState) {
		super();
		this.id = id;
		this.caseNumber = caseNumber;
		this.realName = realName;
		this.gender = gender;
		this.idNumber = idNumber;
		this.birthDate = birthDate;
		this.age = age;
		this.ageType = ageType;
		this.homeAddress = homeAddress;
		this.visitDate = visitDate;
		this.noon = noon;
		this.deptId = deptId;
		this.userId = userId;
		this.registLeId = registLeId;
		this.settleId = settleId;
		this.isBook = isBook;
		this.registTime = registTime;
		this.registerId = registerId;
		this.visitState = visitState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAgeType() {
		return ageType;
	}

	public void setAgeType(String ageType) {
		this.ageType = ageType;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public String getNoon() {
		return noon;
	}

	public void setNoon(String noon) {
		this.noon = noon;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRegistLeId() {
		return registLeId;
	}

	public void setRegistLeId(Integer registLeId) {
		this.registLeId = registLeId;
	}

	public Integer getSettleId() {
		return settleId;
	}

	public void setSettleId(Integer settleId) {
		this.settleId = settleId;
	}

	public String getIsBook() {
		return isBook;
	}

	public void setIsBook(String isBook) {
		this.isBook = isBook;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public Integer getVisitState() {
		return visitState;
	}

	public void setVisitState(Integer visitState) {
		this.visitState = visitState;
	}

	@Override
	public String toString() {
		return "ApplyRegister [id=" + id + ", caseNumber=" + caseNumber + ", realName=" + realName + ", gender="
				+ gender + ", idNumber=" + idNumber + ", birthDate=" + birthDate + ", age=" + age + ", ageType="
				+ ageType + ", homeAddress=" + homeAddress + ", visitDate=" + visitDate + ", noon=" + noon + ", deptId="
				+ deptId + ", userId=" + userId + ", registLeId=" + registLeId + ", settleId=" + settleId + ", isBook="
				+ isBook + ", registTime=" + registTime + ", registerId=" + registerId + ", visitState=" + visitState
				+ "]";
	}
}
