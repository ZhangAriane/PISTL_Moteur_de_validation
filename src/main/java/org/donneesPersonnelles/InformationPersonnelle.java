package org.donneesPersonnelles;

import java.util.Date;

public class InformationPersonnelle {


    protected enum Sexe {
        HOMME,
        FEMME
    }

    protected enum Status {
        MINEUR,
        MAJEUR
    }

    protected enum Yeux {
        BLEUE,
        NOIRE,
        MARRON,
        VERT
    }

    protected enum Parent {
        PERE,
        MERE
    }
    /*---------------------------------------------------------------*/
    /*                           Attribute                           */
    /*---------------------------------------------------------------*/

    /*---------------------------------------------------------------*/
    /*  Catégorie : état civil, coordoonée, filiation, nationalité,  */
    /*  ressponsable légal,identité, ancien titre, fiscalité         */
    /*---------------------------------------------------------------*/

    private String context;


    //Etat civil
    private Status status;
    private Sexe sexe;
    private String nom;
    private String nomUsage;
    private Parent OrigineNomUsage;
    private String prenom;
    private String prenomUsuel;
    private Date dateNaissance;
    private String villeNaissance;
    private int departementNaissance;
    private String paysNaissance;
    private Double taille;
    private Yeux couleurYeux;

    //Coordonnée
    private int numTelephone;
    private String rue;
    private String ville;
    private int departement;
    private String pays;

    //Filiation


    //Nationalité
    private String nationalite;

    //Responsable légal
    private String nomRepresentantLegal;
    private String prenomRepresentantLegal;
    private Date dateNaissanceResponsableLegal;
    private String lieuNaissanceResponsableLegal;
    private String nationaliteResponsableLegal;

    //Identité

    //Ancien titre

    //Fiscalité


    /*---------------------------------------------------------------*/
    /*                       Getter et setter                        */
    /*---------------------------------------------------------------*/

     public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
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

    public String getNomUsage() {
        return nomUsage;
    }

    public void setNomUsage(String nomUsage) {
        this.nomUsage = nomUsage;
    }

    public Parent getOrigineNomUsage() {
        return OrigineNomUsage;
    }

    public void setOrigineNomUsage(Parent origineNomUsage) {
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

    public Yeux getCouleurYeux() {
        return couleurYeux;
    }

    public void setCouleurYeux(Yeux couleurYeux) {
        this.couleurYeux = couleurYeux;
    }

    public int getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(int numTelephone) {
        this.numTelephone = numTelephone;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getNomRepresentantLegal() {
        return nomRepresentantLegal;
    }

    public void setNomRepresentantLegal(String nomRepresentantLegal) {
        this.nomRepresentantLegal = nomRepresentantLegal;
    }

    public String getPrenomRepresentantLegal() {
        return prenomRepresentantLegal;
    }

    public void setPrenomRepresentantLegal(String prenomRepresentantLegal) {
        this.prenomRepresentantLegal = prenomRepresentantLegal;
    }

    public Date getDateNaissanceResponsableLegal() {
        return dateNaissanceResponsableLegal;
    }

    public void setDateNaissanceResponsableLegal(Date dateNaissanceResponsableLegal) {
        this.dateNaissanceResponsableLegal = dateNaissanceResponsableLegal;
    }

    public String getLieuNaissanceResponsableLegal() {
        return lieuNaissanceResponsableLegal;
    }

    public void setLieuNaissanceResponsableLegal(String lieuNaissanceResponsableLegal) {
        this.lieuNaissanceResponsableLegal = lieuNaissanceResponsableLegal;
    }

    public String getNationaliteResponsableLegal() {
        return nationaliteResponsableLegal;
    }

    public void setNationaliteResponsableLegal(String nationaliteResponsableLegal) {
        this.nationaliteResponsableLegal = nationaliteResponsableLegal;
    }
}