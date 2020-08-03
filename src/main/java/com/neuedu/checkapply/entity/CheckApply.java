package com.neuedu.checkapply.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.neuedu.util.Pager;

public class CheckApply {

	private Integer id;
	private Integer medicalId;//病历ID
	private Integer registId;//挂号ID
	private Integer itemId;//项目ID
	private String name;//项目名称
	private String objective;//目的要求
	private String position;//检查部位
	private String treatment;//处置方法
	private Integer isUrgent;//是否加急，1为加急，0为不加急
	private Integer num;//数量
	@DateTimeFormat(pattern = "yyyy-MM-dd")//使用注解进行转换
	private Date creationTime;//开立时间
	private Integer doctorId;//开立医生
	private Integer checkOperId;//检察人员
	private Integer resultOperId;//检查录入人员
	@DateTimeFormat(pattern = "yyyy-MM-dd")//使用注解进行转换
	private Date checkTime;//检查时间
	private String result;//检查结果
	@DateTimeFormat(pattern = "yyyy-MM-dd")//使用注解进行转换
	private Date resultTime;//结果时间
	private Integer state;//状态
	private Integer recordType;//记录类型
	
	//外键关联属性
	private ApplyUser applyUser1;//用户表取开立医生姓名
	private ApplyUser applyUser2;//用户表取检查人员姓名
	private ApplyUser applyUser3;//用户表取录入人员姓名
	private ApplyRegister applyRegister;//挂号信息表
	
	//增加pager属性，用于分页功能
	private Pager pager;
		
	public CheckApply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckApply(Integer id, Integer medicalId, Integer registId, Integer itemId, String name, String objective,
			String position, String treatment, Integer isUrgent, Integer num, Date creationTime, Integer doctorId,
			Integer checkOperId, Integer resultOperId, Date checkTime, String result, Date resultTime, Integer state,
			Integer recordType, ApplyUser applyUser1, ApplyUser applyUser2, ApplyUser applyUser3,
			ApplyRegister applyRegister, Pager pager) {
		super();
		this.id = id;
		this.medicalId = medicalId;
		this.registId = registId;
		this.itemId = itemId;
		this.name = name;
		this.objective = objective;
		this.position = position;
		this.treatment = treatment;
		this.isUrgent = isUrgent;
		this.num = num;
		this.creationTime = creationTime;
		this.doctorId = doctorId;
		this.checkOperId = checkOperId;
		this.resultOperId = resultOperId;
		this.checkTime = checkTime;
		this.result = result;
		this.resultTime = resultTime;
		this.state = state;
		this.recordType = recordType;
		this.applyUser1 = applyUser1;
		this.applyUser2 = applyUser2;
		this.applyUser3 = applyUser3;
		this.applyRegister = applyRegister;
		this.pager = pager;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(Integer medicalId) {
		this.medicalId = medicalId;
	}

	public Integer getRegistId() {
		return registId;
	}

	public void setRegistId(Integer registId) {
		this.registId = registId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Integer getIsUrgent() {
		return isUrgent;
	}

	public void setIsUrgent(Integer isUrgent) {
		this.isUrgent = isUrgent;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getCheckOperId() {
		return checkOperId;
	}

	public void setCheckOperId(Integer checkOperId) {
		this.checkOperId = checkOperId;
	}

	public Integer getResultOperId() {
		return resultOperId;
	}

	public void setResultOperId(Integer resultOperId) {
		this.resultOperId = resultOperId;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getResultTime() {
		return resultTime;
	}

	public void setResultTime(Date resultTime) {
		this.resultTime = resultTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getRecordType() {
		return recordType;
	}

	public void setRecordType(Integer recordType) {
		this.recordType = recordType;
	}

	public ApplyUser getApplyUser1() {
		return applyUser1;
	}

	public void setApplyUser1(ApplyUser applyUser1) {
		this.applyUser1 = applyUser1;
	}

	public ApplyUser getApplyUser2() {
		return applyUser2;
	}

	public void setApplyUser2(ApplyUser applyUser2) {
		this.applyUser2 = applyUser2;
	}

	public ApplyUser getApplyUser3() {
		return applyUser3;
	}

	public void setApplyUser3(ApplyUser applyUser3) {
		this.applyUser3 = applyUser3;
	}

	public ApplyRegister getApplyRegister() {
		return applyRegister;
	}

	public void setApplyRegister(ApplyRegister applyRegister) {
		this.applyRegister = applyRegister;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	@Override
	public String toString() {
		return "CheckApply [id=" + id + ", medicalId=" + medicalId + ", registId=" + registId + ", itemId=" + itemId
				+ ", name=" + name + ", objective=" + objective + ", position=" + position + ", treatment=" + treatment
				+ ", isUrgent=" + isUrgent + ", num=" + num + ", creationTime=" + creationTime + ", doctorId="
				+ doctorId + ", checkOperId=" + checkOperId + ", resultOperId=" + resultOperId + ", checkTime="
				+ checkTime + ", result=" + result + ", resultTime=" + resultTime + ", state=" + state + ", recordType="
				+ recordType + ", applyUser1=" + applyUser1 + ", applyUser2=" + applyUser2 + ", applyUser3="
				+ applyUser3 + ", applyRegister=" + applyRegister + ", pager=" + pager + "]";
	}
	
}
