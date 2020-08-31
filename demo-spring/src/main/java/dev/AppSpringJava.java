package dev;

import dev.config.AppConfig;
import dev.presentation.Ihm;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpringJava {

    public static void main(String[] args) {

        // Avec Spring le contrôle est "inversé"
        // => "Inversion de contrôle"
        // => C'est Spring qui crée les objets d'infrastructures (dao, service, ...)

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)){
            // Utilisation des beans
            Ihm ihm = context.getBean(Ihm.class);
            ihm.demarrer();
        }




    }
}
