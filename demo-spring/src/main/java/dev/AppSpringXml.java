package dev;

import dev.dao.DaoBlague;
import dev.dao.IDao;
import dev.metier.IService;
import dev.metier.Service1;
import dev.presentation.Ihm;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class AppSpringXml {

    public static void main(String[] args) {

        // Avec Spring le contrôle est "inversé"
        // => "Inversion de contrôle"
        // => C'est Spring qui crée les objets d'infrastructures (dao, service, ...)

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

        // Utilisation des beans
        Ihm ihm = context.getBean(Ihm.class);
        Ihm ihm2 = context.getBean(Ihm.class);
        Ihm ihm3 = context.getBean(Ihm.class);
        ihm.demarrer();

        // Fermeture du contexte Spring
        context.close();
    }
}
