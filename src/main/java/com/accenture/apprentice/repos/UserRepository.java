package com.accenture.apprentice.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.apprentice.model.Reguserstbl;

public interface UserRepository extends JpaRepository <Reguserstbl, Long> 
{
	public Reguserstbl findByuserName(String userName); 
	public Reguserstbl findByuserNameAndPassword(String userName, String password);
	//public List<Reguserstbl> findByNameLike(String searchCriteria);
	public List<Reguserstbl> findByNameLikeOrNameStartingWithOrNameEndingWithOrNameContaining(String searchCriteria, String searchCriteria2, String searchCriteria3, String searchCriteria4);
}
