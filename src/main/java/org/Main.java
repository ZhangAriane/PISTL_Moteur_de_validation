package org;

import org.Donnees.Coordonnee;
import org.Donnees.DonneesPersonnelles;
import org.Donnees.EtatCivil;
import org.Donnees.InformationPersonnelle;
import org.apache.poi.poifs.filesystem.DocumentOutputStream;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static org.ChargeFichier.chargeMotCle;
import static org.ChargeFichier.chargeRegle;


public class Main {


    public static void main(String[] args) throws IOException {
        //charge les mots clé
        Path currentDirectoryPath = FileSystems.getDefault().getPath("");
        String motCleFilePath = currentDirectoryPath.toAbsolutePath().toString() + "/src/main/resources/motCle.json";
        Map<String,String> motCles = chargeMotCle(motCleFilePath);


        //charge les règles
        String excelFilePath = currentDirectoryPath.toAbsolutePath().toString() + "/src/main/resources/config.xlsx";
        List<Regle>  regles = chargeRegle(excelFilePath,motCles);

        //Création de donnée
//        InformationPersonnelle informationPersonnelle = new InformationPersonnelle();
//        informationPersonnelle.setContext("premier_demande_passeport_mineur");
//        informationPersonnelle.setNom("Zhang");
//        informationPersonnelle.setPrenom("Ariane");
//        informationPersonnelle.setRue("56 rue victor hugo");
//        informationPersonnelle.setVille("paris");
//        informationPersonnelle.setPays("france");
//
//        Validateur validateur = new Validateur(regles);
//        Boolean res = validateur.valide(informationPersonnelle);
//
//        System.out.println("\nRésultat de validation : " + res);

//        for(Regle regle : regles){
//            System.out.println(regle.categorie);
//        }

        //Création de donnée
        EtatCivil etatCivil = new EtatCivil();
        etatCivil.setNom("Zhang");
        etatCivil.setPrenom("Ariane");
        Coordonnee coordonnee = new Coordonnee();
        coordonnee.setRue("55 rue henri barbusse");
        coordonnee.setVille("Paris");
        coordonnee.setPays("France");
        DonneesPersonnelles donneesPersonnelles = new DonneesPersonnelles();
        donneesPersonnelles.setContext("premier_demande_passeport_mineur");
        donneesPersonnelles.setEtatCivil(etatCivil);
        donneesPersonnelles.setCoordonnee(coordonnee);

        Validateur validateur = new Validateur(regles);
        Boolean res2 =  validateur.valide(donneesPersonnelles);
        System.out.println("\nRésultat de validation : " + res2);


    }

}
