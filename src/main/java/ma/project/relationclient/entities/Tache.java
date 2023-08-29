package ma.project.relationclient.entities;

import javax.persistence.*;


@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String etat;
    private String nom;



    @ManyToOne
    private Membre membre;
    @ManyToOne
    private Projet projet;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



}
