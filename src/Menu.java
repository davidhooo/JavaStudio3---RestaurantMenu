package src;

public class Menu {
    public static void main(String[] args) {

        MenuItem dish1 = new MenuItem("Chicken Fried Rice", new String[] {"rice", "chicken breast", "olive oil"}, true);
        MenuItem dish2 = new MenuItem("Pho Special", new String[] {"rice noodles", "beef broth", "star enise"}, false);

        System.out.println(dish1.getName());
        System.out.println(dish1.getIngredients());
        System.out.println(dish1.getNewItem());

        System.out.println(dish2.getName());
        System.out.println(dish2.getIngredients());
        System.out.println(dish2.getNewItem());
    }


}

