package org.Donnees;

public class DonneesPersonnelles {
    private String context;
    private EtatCivil etatCivil;
    private Coordonnee coordonnee;
    private  Filiation filiation;
    private Nationalite nationalite;
    private ResponsableLegal responsableLegal;
    private Identite identite;
    private AncienTitre ancienTitre;
    private Fiscalite fiscalite;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public EtatCivil getEtatCivil() {
        return etatCivil;
    }

    public void setEtatCivil(EtatCivil etatCivil) {
        this.etatCivil = etatCivil;
    }

    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    public void setCoordonnee(Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }

    public Filiation getFiliation() {
        return filiation;
    }

    public void setFiliation(Filiation filiation) {
        this.filiation = filiation;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    public ResponsableLegal getResponsableLegal() {
        return responsableLegal;
    }

    public void setResponsableLegal(ResponsableLegal responsableLegal) {
        this.responsableLegal = responsableLegal;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public AncienTitre getAncienTitre() {
        return ancienTitre;
    }

    public void setAncienTitre(AncienTitre ancienTitre) {
        this.ancienTitre = ancienTitre;
    }

    public Fiscalite getFiscalite() {
        return fiscalite;
    }

    public void setFiscalite(Fiscalite fiscalite) {
        this.fiscalite = fiscalite;
    }
}
