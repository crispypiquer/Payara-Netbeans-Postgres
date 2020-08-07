
package com.mycompany.testwebapp.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.NamedQuery;
import javax.persistence.metamodel.SingularAttribute;

@Entity
@Table(name = "nombres")
@NamedQuery(name = "User.all", query = "SELECT us from User us order by us.id")
public class User implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nombre", nullable=false)
    private String nombre;
    
    public User() {
    }

    public User(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public User(SingularAttribute<User, Integer> id, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
    
