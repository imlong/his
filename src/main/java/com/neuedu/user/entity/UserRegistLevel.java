package com.neuedu.user.entity;

public class UserRegistLevel {

	private Integer id;
	private String registCode;//号别编码
	private String registName;//号别名称
	private Integer sequenceNo;//显示顺序号
	private double registFee;//挂号费
	private Integer registQuota;//挂号限额
	private Integer delMark;//删除标记
	
	public UserRegistLevel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistLevel(Integer id, String registCode, String registName, Integer sequenceNo, double registFee,
			Integer registQuota, Integer delMark) {
		super();
		this.id = id;
		this.registCode = registCode;
		this.registName = registName;
		this.sequenceNo = sequenceNo;
		this.registFee = registFee;
		this.registQuota = registQuota;
		this.delMark = delMark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegistCode() {
		return registCode;
	}

	public void setRegistCode(String registCode) {
		this.registCode = registCode;
	}

	public String getRegistName() {
		return registName;
	}

	public void setRegistName(String registName) {
		this.registName = registName;
	}

	public Integer getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(Integer sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public double getRegistFee() {
		return registFee;
	}

	public void setRegistFee(double registFee) {
		this.registFee = registFee;
	}

	public Integer getRegistQuota() {
		return registQuota;
	}

	public void setRegistQuota(Integer registQuota) {
		this.registQuota = registQuota;
	}

	public Integer getDelMark() {
		return delMark;
	}

	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}

	@Override
	public String toString() {
		return "Regist [id=" + id + ", registCode=" + registCode + ", registName=" + registName + ", sequenceNo="
				+ sequenceNo + ", registFee=" + registFee + ", registQuota=" + registQuota + ", delMark=" + delMark
				+ "]";
	}
	
}
