package cn.edu.cqu.party.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cn.edu.cqu.party.domains.TestBook;
import cn.edu.cqu.party.domains.TestUser;

@Service
public class TestService extends BaseService{
	
	@Transactional
	public void addUser(TestUser testUser) throws Exception{
		this.save(testUser);
	}
	
	@Transactional
	public void addTestBook(TestBook testBook) throws Exception{
		this.save(testBook);
	}

	public TestUser findTestUserByUsernameAndAge(String username, int age) {
		return this.getFirst(TestUser.class, "from TestUser where username=? and age=?", username,age);
	}
	
	public List<TestBook> findBookInfos(){
		return this.find(TestBook.class, "from TestBook");
	}
	
}
