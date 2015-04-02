package sometest;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.cqu.party.domains.TestBook;
import cn.edu.cqu.party.domains.TestUser;
import cn.edu.cqu.party.services.TestService;

public class TestCascadeOperates extends JUnitDaoBase{
	@Autowired
	private TestService testService;
	
	@Test
	public void testAddUser() throws Exception{
		TestUser testUser = new TestUser();
		testUser.setUsername("jack");
		testUser.setAge(34);
		testUser.setGender("男");
		testService.addUser(testUser);
	}
	
	@Test
	public void testFindUser(){
		TestUser user = testService.findTestUserByUsernameAndAge("admin", 45);
		System.out.println(user.getId());
	}
	
	@Test
	public void testFindBookInfo(){
		List<TestBook> infos = testService.findBookInfos();
		for(TestBook book: infos){
			System.out.println(book.getBookName());
			System.out.println(book.getPages());
			System.out.println(book.getTestUser().getAge()+book.getTestUser().getUsername());
		}
	}
	
}
