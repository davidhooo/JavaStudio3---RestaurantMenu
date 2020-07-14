package src;

public class Menu {
    MenuItem dish1 = new MenuItem("Gouda Red Pepper Soup", "Appetizer", 3.25, new String[] {"gouda cheese", "red bell peppers", "tomatoes"}, false);
    MenuItem dish2 = new MenuItem("Mini Corndogs","Appetizer", 6.50, new String[] {"hot dogs","batter","salt"}, true);

    MenuItem dish3 = new MenuItem("Chicken Fried Rice", "Entree", 12.95, new String[] {"rice", "chicken breast", "olive oil"}, true);
    MenuItem dish4 = new MenuItem("Pho Special", "Entree", 14.95, new String[] {"rice noodles", "beef broth", "star enise"}, false);

    MenuItem dish5 = new MenuItem("New York Style Cheese Cake", "Dessert", 4.25, new String[] {"cream cheese", "graham cracker crust"}, false);
    MenuItem dish6 = new MenuItem("Tiramisu", "Dessert", 4.25, new String[] {"coffee", "lady finger cookies", "chocolate mousse"}, true);
}

