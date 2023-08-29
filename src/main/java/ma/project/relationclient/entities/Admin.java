package ma.project.relationclient.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Admin extends User{

    @OneToMany(mappedBy = "admin", fetch = FetchType.LAZY)
    private List<Projet> projets;
}
