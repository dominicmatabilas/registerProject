package com.accenture.apprentice.service;

import java.util.List;

import com.accenture.apprentice.controllers.HomeController;
import com.accenture.apprentice.model.Reguserstbl;
import com.accenture.apprentice.repos.UserRepository;
import com.accenture.apprentice.service.AddUserInterface;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class AddUserService implements AddUserInterface{
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource
	private UserRepository userRepository;
		
	/*Get the number of users*/
	
	public String getNumberOfUsers(){
		
		long numberOfUsers = userRepository.count();
		return String.valueOf(numberOfUsers);
	}
	
	/*Add User*/
	public void addNewUser(Reguserstbl addUser){
		userRepository.save(addUser);		
	}
		
	
	/*login User*/
	public Reguserstbl loginUser(String userName, String password){
		
		Reguserstbl user;
		
		user = userRepository.findByuserNameAndPassword(userName, password);
		
		if(user == null){
			return (null);
		}
		else{
			return (user);
		}
		
			
	}
	
	/*display all Users*/
	public List<Reguserstbl> displayAllUsers(){
		
		List<Reguserstbl> allUsers  = userRepository.findAll();
		
		return (allUsers);
	
	}
	
	/*display current user*/
	
	public Reguserstbl updateUserGet(String userName){
		
		Reguserstbl foundUser;
		
		foundUser = userRepository.findByuserName(userName);
			
		return (foundUser);
	}
	
	/*update user*/
	public void updateUser(Reguserstbl userNew, long idToEdit){
		
		userNew.setId(idToEdit);
		userRepository.save(userNew);
						
	}
	
	public List<Reguserstbl> search(String searchCriteria, String searchCriteria2, String searchCriteria3, String searchCriteria4){
		
		//List<Reguserstbl> searchUsers  = userRepository.findByNameLike(searchCriteria);
		
		List<Reguserstbl> searchUsers  = userRepository.findByNameLikeOrNameStartingWithOrNameEndingWithOrNameContaining(searchCriteria, searchCriteria2, searchCriteria3, searchCriteria4);
		
		if(searchUsers == null){
			logger.info("i'm here!");
			return (null);
		}
		else{
			return (searchUsers);
		}
	
	}
	
	
}
	
	

