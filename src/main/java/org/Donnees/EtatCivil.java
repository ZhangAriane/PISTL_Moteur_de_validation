package org.Donnees;

import java.util.Date;

public class EtatCivil {
    private InformationPersonnelle.Status status;
    private InformationPersonnelle.Sexe sexe;
    private String nom;
    private String nomUsage;
    private InformationPersonnelle.Parent OrigineNomUsage;
    private String prenom;
    private String prenomUsuel;
    private Date dateNaissance;
    private String villeNaissance;
    private int departementNaissance;
    private String paysNaissance;
    private Double taille;
    private InformationPersonnelle.Yeux couleurYeux;


    public InformationPersonnelle.Status getStatus() {
        return status;
    }

    public void setStatus(InformationPersonnelle.Status status) {
        this.status = status;
    }

    public InformationPersonnelle.Sexe getSexe() {
        return sexe;
    }

    public void setSexe(InformationPersonnelle.Sexe sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomUsage() {
        return nomUsage;
    }

    public void setNomUsage(String nomUsage) {
        this.nomUsage = nomUsage;
    }

    public InformationPersonnelle.Parent getOrigineNomUsage() {
        return OrigineNomUsage;
    }

    public void setOrigineNomUsage(InformationPersonnelle.Parent origineNomUsage) {
        OrigineNomUsage = origineNomUsage;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenomUsuel() {
        return prenomUsuel;
    }

    public void setPrenomUsuel(String prenomUsuel) {
        this.prenomUsuel = prenomUsuel;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    public int getDepartementNaissance() {
        return departementNaissance;
    }

    public void setDepartementNaissance(int departementNaissance) {
        this.departementNaissance = departementNaissance;
    }

    public String getPaysNaissance() {
        return paysNaissance;
    }

    public void setPaysNaissance(String paysNaissance) {
        this.paysNaissance = paysNaissance;
    }

    public Double getTaille() {
        return taille;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    public InformationPersonnelle.Yeux getCouleurYeux() {
        return couleurYeux;
    }

    public void setCouleurYeux(InformationPersonnelle.Yeux couleurYeux) {
        this.couleurYeux = couleurYeux;
    }
}
