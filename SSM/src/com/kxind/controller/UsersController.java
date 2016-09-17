package com.kxind.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.net.NioBlockingSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kxind.biz.UsersBiz;
import com.kxind.domain.Users;

@Controller("UsersController")
@RequestMapping("/users")
public class UsersController {
	@Autowired
	@Qualifier("UsersBiz")
	private UsersBiz UsersBiz;

	public UsersBiz getUsersBiz() {
		return UsersBiz;
	}

	public void setUsersBiz(UsersBiz usersBiz) {
		UsersBiz = usersBiz;
	}

	// 查询所有的用户
	@RequestMapping("/findall.html")
	public String findAll(Model model) {
		System.out.println("进入了控制层");
		List<Users> userslist = this.UsersBiz.findAll();
		model.addAttribute("usersList", userslist);
		return "user/show";
	}

	// 查询某一id的用户
	@RequestMapping("/findById{id}.html")
	public String findById(@PathVariable int id, HttpServletRequest request) {
		Users users = UsersBiz.findById(id);
		request.setAttribute("user", users);
		return "user/info";
	}

	// 添加新用户
	@RequestMapping("/save.html")
	public String save(Users users) {
		this.UsersBiz.save(users);
		return "redirect:findall.html";
	}

	// 删除用户
	@RequestMapping("/delete{id}.html")
	public String delete(@PathVariable int id) {
          this.UsersBiz.delete(id);
		return "redirect:findall.html";
	}
	//修改用户,并返回给修改界面
	@RequestMapping("/update{id}.html")
    public String update(@PathVariable int id,Model model){
		    Users users=this.UsersBiz.findById(id);
		model.addAttribute("user",users);
		    return "user/update";
	}
	//修改界面修改的值
	@RequestMapping("/update.html")
    public String update(Users users){
		  this.UsersBiz.update(users);
		    return  "redirect:findall.html";
	}
}
