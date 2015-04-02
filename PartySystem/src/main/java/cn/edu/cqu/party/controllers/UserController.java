package cn.edu.cqu.party.controllers;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import cn.edu.cqu.party.domains.User;
import cn.edu.cqu.party.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/upload.do")
	public String upload(HttpServletRequest request,
			HttpServletResponse response) throws IllegalStateException,
			IOException {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		if (multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;

			Iterator<String> iter = multiRequest.getFileNames();
			while (iter.hasNext()) {
				MultipartFile file = multiRequest.getFile((String) iter.next());
				if (file != null) {
					String fileName = "demoUpload" + file.getOriginalFilename();
					String path = "D:/" + fileName;

					File localFile = new File(path);

					file.transferTo(localFile);
				}

			}

		}
		return "/user/success";
	}

	@RequestMapping("/user/toUpload.do")
	public String toUpload() {
		System.out.println("---1111---");
		return "/user/upload";
	}
	
	@RequestMapping("/user/findAllUser.do")
	public @ResponseBody List<User> findAllUser(){
		List<User> users = userService.findAllUsers();
		return users;
	}
	
	@RequestMapping("/user/tolistUser.do")
	public String tolist(){
		return "/partyDue/listPartyDue";
	}
}
