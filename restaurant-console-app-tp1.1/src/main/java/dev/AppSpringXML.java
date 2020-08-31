package dev;

import dev.ihm.Menu;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class AppSpringXML {

    public static void main(String[] args) {
/*
        try {

        } catch() {

        }

        // try with resources
        try (expression) { // impléments AutoCloseable

        }
*/

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config-memoire.xml")) {
            // récupération du bean Menu
            Menu menu = context.getBean(Menu.class);

            menu.afficher();
        } // fermeture du contexte Spring => context.close()

        // try => try with resources (Java 7)

    }
}
