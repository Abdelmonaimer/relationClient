package ma.project.relationclient.entities;

import javax.persistence.*;

@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String methode;
    @ManyToOne
    private Facture facture;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }
}
