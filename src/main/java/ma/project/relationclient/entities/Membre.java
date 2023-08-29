package ma.project.relationclient.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Membre extends User{
    private String specialite;
    private String poste;

    @OneToMany(mappedBy = "membre", fetch = FetchType.LAZY)
    private List<Tache> tache;
    @ManyToOne
    private Projet projet;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
