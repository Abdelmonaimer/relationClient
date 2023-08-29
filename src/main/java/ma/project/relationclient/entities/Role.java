package ma.project.relationclient.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;

    @ManyToMany(cascade=CascadeType.PERSIST)
    @JoinTable(name="user_role",
            joinColumns = { @JoinColumn(name="role_id") },
            inverseJoinColumns = { @JoinColumn(name="user_id") })
    private Set<User> user = new HashSet<User>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


}
