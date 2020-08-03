package com.neuedu.employee.entity;

public class Emp {

	private String id;//编号
	private String name;//姓名
	private String sex;//性别
	private String edu;//学历
	private String post;//岗位
	private String dept;//部门
	private String type;//员工类型
	private String station;//职员状态
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String id, String name, String sex, String edu, String post, String dept, String type,
			String station) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.edu = edu;
		this.post = post;
		this.dept = dept;
		this.type = type;
		this.station = station;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sex=" + sex + ", edu=" + edu + ", post=" + post + ", dept="
				+ dept + ", type=" + type + ", station=" + station + "]";
	}
	
}
