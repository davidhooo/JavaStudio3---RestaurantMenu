package src;

import java.util.ArrayList;

public class MenuItem {
    private String name;
    private ArrayList<String> ingredientList = new ArrayList<String>();
    private Boolean newItem;

    public MenuItem(String name, String[] ingredientArray, Boolean newItem) {
        this.name = name;
        for (String ingredient : ingredientArray) {
            this.ingredientList.add(ingredient);
        }
        this.newItem = newItem;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredientList;
    }

    public Boolean getNewItem() {
        return this.newItem;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setIngredients(String ingredient) {
        this.ingredientList.add(ingredient);
    }

    protected void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }
}

