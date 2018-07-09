package cn.jsmoon.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jsmoon.model.User;
import cn.jsmoon.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request)throws Exception{
		User resultUser = userService.login(user);
		if(resultUser.getId()==null) {
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "账号或者密码错误!");
			return "/login";
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", resultUser);
			return "redirect:/main.jsp";
		}
	}
}
