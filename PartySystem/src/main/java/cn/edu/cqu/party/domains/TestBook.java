package cn.edu.cqu.party.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TestBook {
	/**
	 * 逻辑主键，自增长
	 */
	@Id
	@GeneratedValue
	private Long id;
	@Column(length=30)
	private String bookName;
	@Column
	private int pages;
	@ManyToOne(optional=false)
	private TestUser testUser;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public TestUser getTestUser() {
		return testUser;
	}
	public void setTestUser(TestUser testUser) {
		this.testUser = testUser;
	}
	
}
