package org.ParserJson;

import java.util.List;

public class Categorie {
    private String categorie;
    private List<Champ> champs;

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<Champ> getChamps() {
        return champs;
    }

    public void setChamps(List<Champ> champs) {
        this.champs = champs;
    }
}


