package com.viz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viz.beans.UserBean;
import com.viz.dao.UserDao;
import com.viz.service.UserService;

@Controller
public class UserController {
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ModelAndView search(HttpServletRequest request, HttpServletResponse response,HttpSession session)
	{
		String name=request.getParameter("user");
		List<UserBean> userlist=UserService.getUsers(name);
		session.setAttribute("userlist",userlist );
		return new ModelAndView("searchresult", "users", userlist);
	}
	@RequestMapping(value="/savetodb", method=RequestMethod.POST)
	public ModelAndView save(HttpSession session)
	{
		List<UserBean> userlist=(List<UserBean>) session.getAttribute("userlist");
		System.out.println(UserDao.saveUser(userlist));
		return new ModelAndView("datasaved");
	}
	@RequestMapping(value="/show")
	public ModelAndView showusers()
	{
		List<UserBean> userlist=UserDao.showUsers();
		return new ModelAndView("userview","userslist",userlist);
	}

}
