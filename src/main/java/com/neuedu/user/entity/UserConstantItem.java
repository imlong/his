package com.neuedu.user.entity;

//获取医生职称
public class UserConstantItem {

	private Integer id;
	private Integer constantTypeId;//所属常数类别职称ID
	private String constantCode;//常数项编码
	private String constantName;//常数项名称
	private Integer delMark;//删除标记
	
	public UserConstantItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserConstantItem(Integer id, Integer constantTypeId, String constantCode, String constantName, Integer delMark) {
		super();
		this.id = id;
		this.constantTypeId = constantTypeId;
		this.constantCode = constantCode;
		this.constantName = constantName;
		this.delMark = delMark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getConstantTypeId() {
		return constantTypeId;
	}

	public void setConstantTypeId(Integer constantTypeId) {
		this.constantTypeId = constantTypeId;
	}

	public String getConstantCode() {
		return constantCode;
	}

	public void setConstantCode(String constantCode) {
		this.constantCode = constantCode;
	}

	public String getConstantName() {
		return constantName;
	}

	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}

	public Integer getDelMark() {
		return delMark;
	}

	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}

	@Override
	public String toString() {
		return "ConstantItem [id=" + id + ", constantTypeId=" + constantTypeId + ", constantCode=" + constantCode
				+ ", constantName=" + constantName + ", delMark=" + delMark + "]";
	}
}
