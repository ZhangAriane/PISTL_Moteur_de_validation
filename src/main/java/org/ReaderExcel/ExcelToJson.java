package org.ReaderExcel;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelToJson {

    public static void convertExcelToJson(String filePath) throws IOException{
        FileInputStream fis = new FileInputStream(new File(filePath));

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);  // Charger la première feuille

        List<Map<String, Object>> regleValidationList = new ArrayList<>();
        Map<String, Map<String, Object>> contextMap = new HashMap<>();

        // Parcourir les lignes de la feuille Excel
        for (int i = 1; i <= sheet.getLastRowNum()-1; i++) {
            Row row = sheet.getRow(i);

            String context = row.getCell(0).getStringCellValue();
            String champ = row.getCell(1).getStringCellValue();
            String categorie = row.getCell(2).getStringCellValue();
            String regle = row.getCell(4).getStringCellValue();

            // Structure contextuelle pour le JSON
            contextMap.putIfAbsent(context, new HashMap<>());
            Map<String, Object> contextEntry = contextMap.get(context);
            contextEntry.putIfAbsent("context", context);
            contextEntry.putIfAbsent("categories", new ArrayList<>());

            // Gestion des catégories
            List<Map<String, Object>> categories = (List<Map<String, Object>>) contextEntry.get("categories");
            Map<String, Object> categorieMap = categories.stream()
                    .filter(cat -> cat.get("categorie").equals(categorie))
                    .findFirst()
                    .orElse(null);

            if (categorieMap == null) {
                categorieMap = new HashMap<>();
                categorieMap.put("categorie", categorie);
                categorieMap.put("champs", new ArrayList<>());
                categories.add(categorieMap);
            }

            // Ajout des champs et des règles
            List<Map<String, String>> champs = (List<Map<String, String>>) categorieMap.get("champs");
            Map<String, String> champMap = new HashMap<>();
            champMap.put("champ", champ);
            champMap.put("regle", regle);
            champs.add(champMap);
        }

        // Convertir en List
        regleValidationList.addAll(contextMap.values());

        // Créer l'objet final JSON
        Map<String, Object> finalJson = new HashMap<>();
        finalJson.put("regle_validation", regleValidationList);

        // Convertir en JSON et l'écrire dans un fichier
        ObjectMapper mapper = new ObjectMapper();
        Path currentDirectoryPath = FileSystems.getDefault().getPath("");
        String jsonFileName = currentDirectoryPath.toAbsolutePath().toString() + "/src/main/resources/config.json";
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFileName), finalJson);

        workbook.close();
        fis.close();

        System.out.println("Conversion Excel vers JSON terminée !\n");
    }
}
