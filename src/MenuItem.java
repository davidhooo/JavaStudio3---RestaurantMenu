package src;

import java.util.ArrayList;
import java.util.Objects;

public class MenuItem {
    private String name;
    private String category;
    private Double price;
    private ArrayList<String> ingredientList = new ArrayList<String>();
    private Boolean newItem;

    public MenuItem(String name, String category, Double price, String[] ingredientArray, Boolean newItem) {
        this.name = name;
        this.category = category;
        this.price = price;
        for (String ingredient : ingredientArray) {
            this.ingredientList.add(ingredient);
        }
        this.newItem = newItem;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() { return this.category; }

    public Double getPrice() { return this.price; }

    public ArrayList<String> getIngredients() {
        return this.ingredientList;
    }

    public Boolean getNewItem() {
        return this.newItem;
    }

    public String isNew() {
        if (this.newItem == true) {
            return " - NEW ITEM!";
        } else {
            return " - Classic Liang's Dish";}
    }

    public String displayDish() {
        return "Dish Name: " + this.name + "\nCategory: " + this.category + "\nPrice: " + this.price + "\nIngredients: " + this.ingredientList + "\nNew Item: " + this.newItem;
    }

    protected void setName(String name) { this.name = name; }

    protected void setCategory(String category) { this.category = category; }

    protected void setPrice(Double price) { this.price = price; }

    protected void setIngredients(String ingredient) {
        this.ingredientList.add(ingredient);
    }

    protected void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) &&
                Objects.equals(category, menuItem.category) &&
                Objects.equals(price, menuItem.price) &&
                Objects.equals(ingredientList, menuItem.ingredientList) &&
                Objects.equals(newItem, menuItem.newItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price, ingredientList, newItem);
    }
}

