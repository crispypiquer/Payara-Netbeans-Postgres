
package com.mycompany.testwebapp.services;

import com.mycompany.testwebapp.entities.User;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped

public class DataService {
    @PersistenceContext(unitName="My_Persistence_Unit")
    EntityManager em;
    
    @Transactional
    public User createUser(int id, String name){
        User newUser = new User(id, name);
        em.persist(newUser);
        em.flush();
        return newUser;
    }
    
    public List<User> getAllUsers(){
        return em.createNamedQuery("User.all", User.class).getResultList();
    }
}
