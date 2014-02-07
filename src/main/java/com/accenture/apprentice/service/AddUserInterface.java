package com.accenture.apprentice.service;

import java.util.List;

import com.accenture.apprentice.model.Reguserstbl;

public interface AddUserInterface {

	public String getNumberOfUsers();
	public void addNewUser(Reguserstbl addUser);
	public Reguserstbl loginUser(String userName, String password);
	public List<Reguserstbl> displayAllUsers();
	public Reguserstbl updateUserGet(String userName);
	public void updateUser(Reguserstbl userNew, long idToEdit);
	public List<Reguserstbl> search(String searchCriteria, String searchCriteria2, String searchCriteria3, String searchCriteria4);
	
}
