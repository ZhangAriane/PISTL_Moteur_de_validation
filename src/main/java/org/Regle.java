package org;

public class Regle {
    String context;
    String champ;
    String categorie;
    String regleType;
    String expression;

    public Regle(String context, String champ, String categorie, String regleType, String expression) {
        this.context = context;
        this.champ = champ;
        this.categorie = categorie;
        this.regleType = regleType;
        this.expression = expression;
    }

    public String getContext() {
        return context;
    }

    public String getChamp() {
        return champ;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getRegleType() {
        return regleType;
    }

    public String getExpression() {
        return expression;
    }
}
