package cn.edu.cqu.party.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.edu.cqu.party.domains.User;
@Service
public class UserService extends BaseService{
	public List<User> findAllUsers(){
		return this.find(User.class, "from User");
	}
}
