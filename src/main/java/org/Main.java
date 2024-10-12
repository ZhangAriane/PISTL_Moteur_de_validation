package org;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ParserJson.Categorie;
import org.ParserJson.Champ;
import org.ParserJson.RegleValidation;
import org.ParserJson.Regles;
import org.ReaderExcel.ExcelToJson;
import org.donneesPersonnelles.InformationPersonnelle;
import org.mvel2.MVEL;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class Main {


    public static Boolean valide(InformationPersonnelle informationPersonnelle, String filePath){
        Boolean resultat = true;
        //récupère le fichier de configuration


        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Lire et mapper le fichier JSON vers un objet Java
            RegleValidation regleValidation = objectMapper.readValue(new File(filePath), RegleValidation.class);

            //Accéder aux données et les afficher
            for (Regles context : regleValidation.getRegle_validation()) {

                if(informationPersonnelle.getContext().equals(context.getContext())) {
                    for (Categorie categorie : context.getCategories()) {
                        for (Champ champ : categorie.getChamps()) {

                            String champNom = champ.getChamp();
                            String expression = champ.getRegle();
                            resultat = (Boolean) MVEL.eval(expression,informationPersonnelle);
                            System.out.println("Expression : " + expression);
                            System.out.println("Resulat : "  + resultat);
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultat;
    }


    public static void main(String[] args) throws IOException {
        //Création de donnée
        InformationPersonnelle informationPersonnelle = new InformationPersonnelle();
        informationPersonnelle.setContext("premier_demande_passeport_mineur");
        informationPersonnelle.setNom("Zhang");
        informationPersonnelle.setPrenom("Ariane");
        informationPersonnelle.setRue("56 rue victor hugo");
        informationPersonnelle.setVille("paris");
        informationPersonnelle.setPays("france");

        Path currentDirectoryPath = FileSystems.getDefault().getPath("");

        //convertie le fichier excel en json
        String excelFilePath = currentDirectoryPath.toAbsolutePath().toString() + "/src/main/resources/config.xlsx";
        ExcelToJson.convertExcelToJson(excelFilePath);

        //lecture du fichier json et validation des informations personnelles
        String jsonFilePath = currentDirectoryPath.toAbsolutePath().toString() + "/src/main/resources/config.json";
        System.out.println("\nRésultat de validation : " + valide(informationPersonnelle,jsonFilePath));
    }

}
