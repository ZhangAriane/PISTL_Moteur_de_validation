package org;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChargeFichier {

    /**
     * Charge le fichier des mots clé en java
     * @param filePath chemin du fichier des mots clé json
     * @return l'ensemble des mots clé
     */
    public static Map<String,String> chargeMotCle(String filePath){
        Map<String,String> motCles = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            motCles = objectMapper.readValue(new File(filePath), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Charger les mot clé du json terminé");
        return motCles;
    }


    /**
     * Méthode pour remplacer les mots-clés dans l'expression
     * @param expression l'expression en langage naturel
     * @param motCles l'ensemble des mots clé
     * @return l'expression en java
     */
    public static String convertToTechnicalExpression(String expression, Map<String,String> motCles) {
        String technicalExpression = expression;
        String[] regles = expression.split("et");

        // Remplacement des mots-clés par leurs équivalents techniques
        for (Map.Entry<String, String> entry : motCles.entrySet()) {
            technicalExpression = technicalExpression.replace(entry.getKey(), entry.getValue());
        }

        return technicalExpression;
    }

    /**
     * Charge l'ensemble des règles du fichier excel en java
     * @param filePath chemin du fichier excel
     * @param motCles l'ensemble des mots clé
     * @return la liste des règles
     * @throws IOException
     */
    public static List<Regle> chargeRegle(String filePath, Map<String,String> motCles) throws IOException {
        FileInputStream fis = new FileInputStream(new File(filePath));

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);  // Charger la première feuille

        List<Regle> regleValidationList = new ArrayList<>();

        // Parcourir les lignes de la feuille Excel
        for (int i = 1; i <= sheet.getLastRowNum()-1; i++) {
            Row row = sheet.getRow(i);

            String context = row.getCell(0).getStringCellValue();
            String champ = row.getCell(1).getStringCellValue();
            String categorie = row.getCell(2).getStringCellValue();
            String regleType = row.getCell(3).getStringCellValue();
            String expression = row.getCell(4).getStringCellValue();

            String regle = convertToTechnicalExpression(expression,motCles);

            regleValidationList.add(new Regle(context,champ,categorie,regleType,regle));
        }
        workbook.close();
        fis.close();

        System.out.println("Charger les règles du excel terminé");
        return regleValidationList;
    }
}
