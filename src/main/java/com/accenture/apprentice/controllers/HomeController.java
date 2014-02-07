package com.accenture.apprentice.controllers;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accenture.apprentice.model.Reguserstbl;
import com.accenture.apprentice.service.AddUserInterface;
import com.accenture.apprentice.service.AddUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@Resource
	private AddUserInterface addUserInterface;
	
	@Resource
	private AddUserService addUserService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	String currentUserName;


		/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginHome(Model model) {

		String numberOfUsers = addUserService.getNumberOfUsers();
		
		model.addAttribute("numberOfUsers", numberOfUsers);
		
		
		return "loginHome";
	}
		
		
	@RequestMapping(value = "/registerPageGet", method = RequestMethod.GET)
	public String register(Model model){
						
		String numberOfUsers = addUserService.getNumberOfUsers();
		
		model.addAttribute("numberOfUsers", numberOfUsers);
		
		return "register";
	}
	

	@RequestMapping(value = "/HomePageGet", method = RequestMethod.GET)
	public String homePageGet(Model model){
		
		
		//logger.info("Users: " + foundUsers.get(0));
		
	//	model.addAttribute("foundUsers", foundUsers);
		
		String numberOfUsers = addUserService.getNumberOfUsers();
		model.addAttribute("currentUserName", currentUserName);
		model.addAttribute("numberOfUsers", numberOfUsers);
		
		return "homepage";
	}
	
	
	@RequestMapping(value = "/viewAllPageGet", method = RequestMethod.GET)
	public String viewAll(@ModelAttribute Reguserstbl user, Model model){
		
		
		List<Reguserstbl> userList = addUserInterface.displayAllUsers();		
		
		String numberOfUsers = addUserService.getNumberOfUsers();
		model.addAttribute("currentUserName", currentUserName);		
		model.addAttribute("numberOfUsers", numberOfUsers);
		model.addAttribute("userList", userList);
		
		return "viewAll";
	}
	
	@RequestMapping(value = "/updatePageGet", method = RequestMethod.GET)
	public String updatePageGet(Model model, Reguserstbl userFound){
		
		logger.info(currentUserName);
		
		userFound = addUserInterface.updateUserGet(currentUserName);
		
		String name = userFound.getName();
		String userName = userFound.getUserName();
		String password = userFound.getPassword();
		
		model.addAttribute("name", name);
		model.addAttribute("userName", userName);
		model.addAttribute("password", password);
		
		model.addAttribute("currentUserName", currentUserName);
				
		return "update";
	}
	
	
	
	@RequestMapping(value = "/searchUserGet", method = RequestMethod.GET)
	public String searchUserGet(Model model){
		
	
		String numberOfUsers = addUserService.getNumberOfUsers();
		model.addAttribute("numberOfUsers", numberOfUsers);
				
		return "search";
	
	}
	

	@RequestMapping(value = "/searchUserPost", method = RequestMethod.POST)
	public String searchUserPost(Model model, Reguserstbl userSearch){		
		
		String searchCriteria = userSearch.getSearch();
						
		List<Reguserstbl> foundUsers = addUserService.search(searchCriteria, searchCriteria, searchCriteria, searchCriteria); 
		
			String numberOfUsers = addUserService.getNumberOfUsers();
			
			model.addAttribute("foundUsers",foundUsers);
			model.addAttribute("numberOfUsers",numberOfUsers);
			
			return "search";
	
	}
	
	
	
	@RequestMapping(value = "/registerPage", method = RequestMethod.POST)
	public String registerAdd(@ModelAttribute("userAttribute") Reguserstbl user, Model model){		
					
		addUserService.addNewUser(user);
		
		String numberOfUsers = addUserService.getNumberOfUsers();
		
		model.addAttribute("numberOfUsers",numberOfUsers);
				
		return "loginHome";
	}
	
	
	@RequestMapping(value = "/loginHomePost", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("loginAttribute") Reguserstbl user, Model model){		
		
		String userName = user.getUserName();
		String password = user.getPassword();
		
		user = addUserInterface.loginUser(userName, password);

		if(user == null){
			return "redirect: /";
		}
		else{
			currentUserName = user.getUserName();
			return "redirect:/HomePageGet ";
		}
		
	}
	
	
	@RequestMapping(value = "/updatePagePost", method = RequestMethod.POST)
	public String updatePagePost(Model model, Reguserstbl userNew, Reguserstbl userFound){
				
		userFound = addUserInterface.updateUserGet(currentUserName);
			
		long idToUpdate  = userFound.getId();
		
		addUserInterface.updateUser(userNew, idToUpdate);
		
		return "redirect:/HomePageGet";
	}
	
	
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model, HttpServletRequest request) {
	
	HttpSession session = request.getSession(false);
		if(session!=null){
			session.invalidate();
		}
		
		return "redirect:/";
    }
	
	

	
	
}
