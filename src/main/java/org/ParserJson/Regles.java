package org.ParserJson;

import java.util.List;

public class Regles {
    private String context;
    private List<Categorie> categories;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public List<Categorie> getCategories() {
        return categories;
    }


    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }
}

