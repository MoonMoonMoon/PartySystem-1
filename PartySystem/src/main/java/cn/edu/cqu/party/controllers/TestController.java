package cn.edu.cqu.party.controllers;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.cqu.party.domains.TestBook;
import cn.edu.cqu.party.domains.TestUser;
import cn.edu.cqu.party.services.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping("/add.do")
	public void add(String username,int age,String gender,PrintWriter pw) throws Exception{
		TestUser user = new TestUser();
		user.setAge(age);
		user.setGender(gender);
		user.setUsername(username);
		testService.addUser(user);
		pw.write("添加用户成功");
		pw.flush();
		pw.close();
	}
	
	@RequestMapping("/login.do")
	public String login(String username,int age,HttpSession session){
		TestUser user = testService.findTestUserByUsernameAndAge(username, age);
		if(null==user){
			return "test/fail";
		}else{
			session.setAttribute("user", user);
			return "redirect:/test/toAddBook.do";
		}
	}
	
	@RequestMapping("/addBook.do")
	public String add(TestBook book,HttpSession session){
		try {
			TestUser user = (TestUser) session.getAttribute("user");
			book.setTestUser(user);
			testService.addTestBook(book);
		} catch (Exception e) {
			e.printStackTrace();
			return "test/fail";
		}
		return "test/success";
	}
	
	@RequestMapping("/listBookInfos.do")
	public String listBookInfos(){
		return "test/listBooks";
	}
}
