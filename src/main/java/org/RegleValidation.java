package org;

public class RegleValidation {
    private String context;
    private String champ;
    private String categorie;
    private String regleType;
    private String expression;

    public RegleValidation(String context, String champ, String categorie, String regleType, String expression) {
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
