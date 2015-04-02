package cn.edu.cqu.party.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * 介绍信表
 * @author RongchenLiu
 *
 */
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id","admin_id","time"}) })
public class IntroLetter {
	/**
	 * 逻辑主键，自增长
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 与用户关联
	 */
	@ManyToOne(optional=false)
	private User user;
	/**
	 * 与管理员关联
	 */
	@ManyToOne(optional=false)
	private Admin admin;
	/**
	 * 编号
	 */
	@Column(nullable=false,length=50)
	private String number;
	
	/**
	 * 领取时间
	 */
	@Column(nullable=false)
	private Date time;
	/**
	 * 类型1：市内、市外
	 */
	@Column(nullable=false,length=10)
	private String typeOne;
	/**
	 * 类型2：电子/纸质
	 */
	@Column(nullable=false,length=10)
	private String typeTwo;
	/**
	 * 转接原因
	 */
	@Column(nullable=true,length=255)
	private String reason;
	
	/**
	 * 抬头
	 */
	@Column(nullable=false,length=255)
	private String title;
	
	/**
	 * 单位内容
	 */
	@Column(nullable=false,length=50)
	private String position;
	
	/**
	 * 审批状态
	 */
	@Column(nullable=false,length=50)
	private String state;
	
	/**
	 * 备注
	 */
	@Column(nullable=true,length=255)
	private String content;
	
	/**
	 * 回执意见
	 */
	@Column(nullable=true,length=255)
	private String opinion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}



	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTypeOne() {
		return typeOne;
	}

	public void setTypeOne(String typeOne) {
		this.typeOne = typeOne;
	}

	public String getTypeTwo() {
		return typeTwo;
	}

	public void setTypeTwo(String typeTwo) {
		this.typeTwo = typeTwo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		IntroLetter other = (IntroLetter) obj;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	
	
	
	
}
