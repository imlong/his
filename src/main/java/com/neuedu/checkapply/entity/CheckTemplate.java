package com.neuedu.checkapply.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.neuedu.user.entity.User;
import com.neuedu.util.Pager;

public class CheckTemplate {

	private Integer id;
	private String name;//名称
	private Integer userId;//医生ID
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date creationTime;//创建时间
	private String scope;//使用范围
	private Integer recordType;//记录类型
	private Integer delMark;//删除标记
	//外键关联属性
	private ApplyUser applyUser;//医生ID找名字
	//分页显示
	private Pager pager;
	
	public CheckTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckTemplate(Integer id, String name, Integer userId, Date creationTime, String scope, Integer recordType,
			Integer delMark, ApplyUser applyUser, Pager pager) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.creationTime = creationTime;
		this.scope = scope;
		this.recordType = recordType;
		this.delMark = delMark;
		this.applyUser = applyUser;
		this.pager = pager;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getRecordType() {
		return recordType;
	}

	public void setRecordType(Integer recordType) {
		this.recordType = recordType;
	}

	public Integer getDelMark() {
		return delMark;
	}

	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}

	public ApplyUser getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(ApplyUser applyUser) {
		this.applyUser = applyUser;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	@Override
	public String toString() {
		return "CheckTemplate [id=" + id + ", name=" + name + ", userId=" + userId + ", creationTime=" + creationTime
				+ ", scope=" + scope + ", recordType=" + recordType + ", delMark=" + delMark + ", applyUser="
				+ applyUser + ", pager=" + pager + "]";
	}

	
}
