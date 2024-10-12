package org.donneesPersonnelles.donneePersonelle;

import java.util.Date;

public class EtatCivil {


    private Status status;
    private Sexe sexe;
    private String nom;
    private String nomUsage;
    private Parent OriginNomUsage;
    private String prenom;
    private String prenomUsuel;
    private Date dateNaissance;
    private String villeNaissance;
    private int departementNaissance;
    private String paysNaissance;
    private Double taille;
    private Yeux couleurYeux;

    protected enum Sexe {
        HOMME,
        FEMME
    }

    protected enum Status{
        MINEUR,
        MAJEUR
    }

    protected enum Yeux{
        BLEUE,
        NOIRE,
        MARRON,
        VERT
    }

    protected enum Parent{
        PERE,
        MERE
    }


    public String getNomUsage() {
        return nomUsage;
    }

    public void setNomUsage(String nomUsage) {
        this.nomUsage = nomUsage;
    }

    public Parent getOriginNomUsage() {
        return OriginNomUsage;
    }

    public void setOriginNomUsage(Parent originNomUsage) {
        OriginNomUsage = originNomUsage;
    }

    public String getPrenomUsuel() {
        return prenomUsuel;
    }

    public void setPrenomUsuel(String prenomUsuel) {
        this.prenomUsuel = prenomUsuel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public Yeux getCouleurYeux() {
        return couleurYeux;
    }

    public void setCouleurYeux(Yeux couleurYeux) {
        this.couleurYeux = couleurYeux;
    }
}
