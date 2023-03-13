package services;

import models.Role;
import dataaccess.RoleDB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaz Baliola
 */
public class RoleService {
    private final RoleDB accessRoles = new RoleDB();
    
    //Get all roles
 
    public List<Role> getAll() throws Exception {
        List<Role> roles;
        
        roles = accessRoles.getAll();
        
        return roles;
    }
    
    //Get specific role by roleID
  
    public Role get(int roleID) throws Exception {
        Role role;
        
        role = accessRoles.get(roleID);
        
        return role;
    }
}