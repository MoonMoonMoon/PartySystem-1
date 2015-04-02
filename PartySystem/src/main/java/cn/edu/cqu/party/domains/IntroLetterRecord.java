package cn.edu.cqu.party.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IntroLetterRecord {
	/**
	 * 逻辑主键，自增长
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 学校
	 */
	@Column(nullable=false,length=50)
	private String school;
	/**
	 * 学院
	 */
	@Column(nullable=false,length=50)
	private String college;
	/**
	 * 年度
	 */
	@Column(nullable=false)
	private Date year;
	/**
	 * 领用人
	 */
	@Column(nullable=false,length=50)
	private String receiver;
	/**
	 * 年级
	 */
	@Column(nullable=false,length=50)
	private String grade;
	/**
	 * 类型
	 */
	@Column(nullable=false,length=50)
	private String type;
	/**
	 * 起止编号
	 */
	@Column(nullable=false,length=50)
	private String startNumber;
	/**
	 * 终止编号
	 */
	@Column(nullable=false,length=50)
	private String endNumber;
	/**
	 * 数量
	 */
	@Column(nullable=false)
	private int number;
	/**
	 * 状态 ：回收/发放
	 */
	@Column(nullable=false,length=50)
	private String state;
	/**
	 * 领取日期
	 */
	@Column(nullable=false)
	private Date time;
	/**
	 *  操作
	 */
	@Column(nullable=false,length=50)
	private String operation;
	/**
	 * 缺失
	 */
	@Column(nullable=false)
	private int absence;
	
	public int getAbsence() {
		return absence;
	}
	public void setAbsence(int absence) {
		this.absence = absence;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStartNumber() {
		return startNumber;
	}
	public void setStartNumber(String startNumber) {
		this.startNumber = startNumber;
	}
	public String getEndNumber() {
		return endNumber;
	}
	public void setEndNumber(String endNumber) {
		this.endNumber = endNumber;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((endNumber == null) ? 0 : endNumber.hashCode());
		result = prime * result
				+ ((startNumber == null) ? 0 : startNumber.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntroLetterRecord other = (IntroLetterRecord) obj;
		if (endNumber == null) {
			if (other.endNumber != null)
				return false;
		} else if (!endNumber.equals(other.endNumber))
			return false;
		if (startNumber == null) {
			if (other.startNumber != null)
				return false;
		} else if (!startNumber.equals(other.startNumber))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	
	
}
