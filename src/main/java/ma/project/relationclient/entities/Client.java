package ma.project.relationclient.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client extends User{

    private String numTel;
    private String cin;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facture_id", referencedColumnName = "id")
    private Facture facture;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Document> documents;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Projet> projets;

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
