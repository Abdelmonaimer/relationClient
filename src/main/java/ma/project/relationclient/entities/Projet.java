package ma.project.relationclient.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String description;
    @ManyToOne
    private Admin admin;
    @ManyToOne
    private Client client;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contrat_id", referencedColumnName = "id")
    private Contrat contrat;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facture_id", referencedColumnName = "id")
    private Facture facture;

    @OneToMany(mappedBy = "projet", fetch = FetchType.LAZY)
    private List<Membre> membres;
    @OneToMany(mappedBy = "projet", fetch = FetchType.LAZY)
    private List<Tache> taches;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
