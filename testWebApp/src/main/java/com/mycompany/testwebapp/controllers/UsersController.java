
package com.mycompany.testwebapp.controllers;

import com.mycompany.testwebapp.entities.User;
import com.mycompany.testwebapp.services.DataService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class UsersController {
    
    @Inject
    DataService dataService;
    
    private List<User> allUsers;
    
    @PostConstruct
    public void initialize(){
        this.allUsers = dataService.getAllUsers();
    }
    
    public List<User> getAllUsers() {
        return allUsers;
    }
    
}
