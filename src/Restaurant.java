package src;

import java.io.File;
import java.text.SimpleDateFormat;

public class Restaurant {
    public static void main(String[] args) {
        File file = new File("src/MenuItem.java");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        Menu menu = new Menu();
        System.out.println("Welcome to Liang's Bistro, the 4th Best Vietnamese Restaurant in the Tampa Bay Area!");
        System.out.println("17515 Bruce B Downs Blvd, \nTampa, FL 33647");

        System.out.println("\nMENU");

        System.out.println("\nAPPETIZERS");
        System.out.println(menu.dish1.getName() + menu.dish1.isNew());
        System.out.println(menu.dish2.getName() + menu.dish2.isNew());

        System.out.println("\nENTREES");
        System.out.println(menu.dish3.getName() + menu.dish3.isNew());
        System.out.println(menu.dish4.getName() + menu.dish4.isNew());

        System.out.println("\nDESSERTS");
        System.out.println(menu.dish5.getName() + menu.dish5.isNew());
        System.out.println(menu.dish6.getName() + menu.dish6.isNew());

        System.out.println("\nMenu Last Updated: " + sdf.format(file.lastModified()));
    }
}
