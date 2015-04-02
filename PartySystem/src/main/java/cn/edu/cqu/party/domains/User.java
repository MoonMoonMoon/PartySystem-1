package cn.edu.cqu.party.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




/**
 * 普通用户表
 * @author RongchenLiu
 *
 */
@Entity
public class User {
	/**
	 * 逻辑主键，自增长
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 登录账号
	 */
	@Column(nullable=false,unique=true,length=50)
	private String account;
	/**
	 * 密码
	 */
	@Column(nullable=false,length=50)
	private String pwd;
	/**
	 * 学校
	 */
	@ManyToOne(optional=false)
	private School school;
	/**
	 * 学院
	 */
	@ManyToOne(optional=false)
	private College college;
	/**
	 * 所在组织
	 */
	@ManyToOne(optional=true)
	private Organization organization;
	/**
	 * 年级
	 */
	@Column(nullable=true,length=50)
	private String grade;
	/**
	 * 党员照片
	 */
	@Column(nullable=true,length=255)
	private String photoLoc;
	/**
	 * 人员类别
	 */
	@Column(nullable=true,length=50)
	private String userType;
	/**
	 * 姓名
	 */
	@Column(nullable=false,length=50)
	private String name;
	/**
	 * 性别
	 */
	@Column(nullable=false,length=50)
	private String gender;
	/**
	 * 民族
	 */
	@Column(nullable=false,length=50)
	private String nation;
	/**
	 * 籍贯
	 */
	@Column(nullable=true,length=50)
	private String nativePlace;
	/**
	 * 电话
	 */
	@Column(nullable=true,length=50)
	private String mobile;
	/**
	 * 身份证
	 */
	@Column(nullable=true,length=50)
	private String idCard;
	/**
	 * 出生日期
	 */
	@Column(nullable=true)
	private Date birthDate;
	/**
	 * 入党日期
	 */
	@Column(nullable=true)
	private Date joinDate;
	/**
	 * 转正日期
	 */
	@Column(nullable=true)
	private Date confirmationDate;
	/**
	 * 学历
	 */
	@Column(nullable=true,length=50)
	private String edu;
	/**
	 * 学位
	 */
	@Column(nullable=true,length=50)
	private String degree;
	/**
	 * 工作岗位
	 */
	@Column(nullable=true,length=50)
	private String job;
	/**
	 * 工作单位
	 */
	@Column(nullable=true,length=50)
	private String position;
	/**
	 * 档案所在地
	 */
	@Column(nullable=true,length=50)
	private String archivesLoc;
	/**
	 * 技术职位
	 */
	@Column(nullable=true,length=50)
	private String technicalPosition;
	/**
	 * 技术等级
	 */
	@Column(nullable=true,length=50)
	private String technicalLevel;
	/**
	 * 社会阶层
	 */
	@Column(nullable=true,length=50)
	private String socialClass;
	/**
	 * 一线情况 First case
	 */
	@Column(nullable=true,length=50)
	private String firstCase;
	/**
	 * 住址
	 */
	@Column(nullable=true,length=255)
	private String address;
	/**
	 * QQ
	 */
	@Column(nullable=true,length=50)
	private String qqNumber;
	/**
	 * 邮箱
	 */
	@Column(nullable=true,length=50)
	private String email;
	/**
	 * 个性签名
	 */
	@Column(nullable=true,length=255)
	private String signature;
	/**
	 * 个人简介
	 */
	@Column(nullable=true,length=255)
	private String resume;
	
	/**
	 * 专业
	 */
	@Column(nullable=true,length=50)
	private String major;
	/**
	 * 导师
	 */
	@Column(nullable=true,length=255)
	private String tutor;
	/**
	 * 政治面貌
	 */
	@Column(nullable=true,length=255)
	private String identity;
	/**
	 * 上传时间
	 */
	@Column(nullable=false)
	private Date time;
	
	/**
	 * 缴费状态
	 */
	@Column(nullable=false,length=50)
	private String state;
	/**
	 * 与党费标准关联
	 */
	@Column(nullable=false)
	private double partyDueStandard;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getPartyDueStandard() {
		return partyDueStandard;
	}
	public void setPartyDueStandard(double partyDueStandard) {
		this.partyDueStandard = partyDueStandard;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhotoLoc() {
		return photoLoc;
	}
	public void setPhotoLoc(String photoLoc) {
		this.photoLoc = photoLoc;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getConfirmationDate() {
		return confirmationDate;
	}
	public void setConfirmationDate(Date confirmationDate) {
		this.confirmationDate = confirmationDate;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getArchivesLoc() {
		return archivesLoc;
	}
	public void setArchivesLoc(String archivesLoc) {
		this.archivesLoc = archivesLoc;
	}
	public String getTechnicalPosition() {
		return technicalPosition;
	}
	public void setTechnicalPosition(String technicalPosition) {
		this.technicalPosition = technicalPosition;
	}
	public String getTechnicalLevel() {
		return technicalLevel;
	}
	public void setTechnicalLevel(String technicalLevel) {
		this.technicalLevel = technicalLevel;
	}
	public String getSocialClass() {
		return socialClass;
	}
	public void setSocialClass(String socialClass) {
		this.socialClass = socialClass;
	}
	public String getFirstCase() {
		return firstCase;
	}
	public void setFirstCase(String firstCase) {
		this.firstCase = firstCase;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQqNumber() {
		return qqNumber;
	}
	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
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
		User other = (User) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		return true;
	}
	
	
}
