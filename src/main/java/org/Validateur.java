package org;

import org.Donnees.*;
import org.mvel2.MVEL;
import java.util.List;

public class Validateur {
    List<Regle> regles;

    public Validateur(List<Regle> regles) {
        this.regles = regles;
    }


    /**
     * Vérifie si informationPersonnelle respect les règles
     * @param informationPersonnelle
     * @return true si les règles sont respecté, sinon false
     */
    public boolean valide(InformationPersonnelle informationPersonnelle){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(informationPersonnelle.getContext().equals( regles.get(i).context)){
                System.out.println(regles.get(i).getExpression());
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,informationPersonnelle);
            }
        }
        return res;
    }

    public boolean valide(DonneesPersonnelles donneesPersonnelles){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(donneesPersonnelles.getContext().equals( regles.get(i).context)){
                if(!valideEtatCivil(donneesPersonnelles.getEtatCivil())) {
                    System.out.println("Etat civil non valide");
                    return false;
                }
                else
                    System.out.println("Etat civil valide");

                if(!valideCoordonnee(donneesPersonnelles.getCoordonnee())){
                    System.out.println("Coordonnée non valide");
                    return false;
                }
                else
                    System.out.println("Coordonnée valide");

                if(!valideFiliation(donneesPersonnelles.getFiliation())){
                    System.out.println("Filiation non valide");
                    return false;
                }
                else
                    System.out.println("Filiation valide");

                if(!valideNationalite(donneesPersonnelles.getNationalite())){
                    System.out.println("Nationalité non valide");
                    return false;
                }
                else
                    System.out.println("Nationalité valide");

                if(!valideResponsableLegal(donneesPersonnelles.getResponsableLegal())){
                    System.out.println("Responsable légal non valide non valide");
                    return false;
                }
                else
                    System.out.println("Responsable valide");

                if(!valideIdentite(donneesPersonnelles.getIdentite())){
                    System.out.println("Identité non valide");
                    return false;
                }
                else
                    System.out.println("Identité valide");

                if(!valideAncienTitre(donneesPersonnelles.getAncienTitre())){
                    System.out.println("Ancien titre non valide");
                    return false;
                }
                else
                    System.out.println("Ancien titre valide");

                if(!valideFiscalite(donneesPersonnelles.getFiscalite())){
                    System.out.println("Fiscalité non valide");
                    return false;
                }
                else
                    System.out.println("Fiscalité valide");

                return true;
            }
        }
        return res;
    }

    private boolean valideEtatCivil(EtatCivil etatCivil){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("etat_civil")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,etatCivil);
            }
        }
        return res;
    }

    private boolean valideCoordonnee(Coordonnee coordonnee){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("coordonnee")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,coordonnee);
            }
        }
        return res;
    }

    private boolean valideFiliation(Filiation filiation){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("filiation")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,filiation);
            }
        }
        return res;
    }

    private boolean valideNationalite(Nationalite nationalite){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("nationalite")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,nationalite);
            }
        }
        return res;
    }

    private boolean valideResponsableLegal(ResponsableLegal responsableLegal){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("responsable_legal")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,responsableLegal);
            }
        }
        return res;
    }

    private boolean valideIdentite(Identite identite){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("identite")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,identite);
            }
        }
        return res;
    }


    private boolean valideAncienTitre( AncienTitre ancienTitre){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("ancien_titre")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,ancienTitre);
            }
        }
        return res;
    }

    private boolean valideFiscalite( Fiscalite fiscalite){
        boolean res = true;
        for(int i=0; i< regles.size();i++){
            if(regles.get(i).categorie.equals("fiscalite")){
                res = res & (Boolean) MVEL.eval(regles.get(i).expression,fiscalite);
            }
        }
        return res;
    }
}
