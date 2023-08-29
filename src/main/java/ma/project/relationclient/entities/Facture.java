package ma.project.relationclient.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Double prix;

    @OneToOne(mappedBy = "facture")
    private Client client;

    @OneToMany(mappedBy = "facture", fetch = FetchType.LAZY)
    private List<Paiement> paiements;
    @OneToOne(mappedBy = "facture")
    private Projet projet;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
