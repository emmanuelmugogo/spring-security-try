package com.emmanuel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepository  extends CrudRepository<Role, Integer>{
	
	Role findByRole(String role);

}
