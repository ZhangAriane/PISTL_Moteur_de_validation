package org.donneesPersonnelles.donneePersonelle;


public class DonneesPersonnelles {

    public enum Context{
        PERMIER_DEMANDE_PASSEPORT,
        RENOUVELLEMENT_PASSEPORT,
        PERMIER_DEMANDE_CARTE_IDENTITE,
        RENOUVELLEMENT_CARTE_IDENTITE

    }

    private String context;
    private EtatCivil etatCivil;

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

}
