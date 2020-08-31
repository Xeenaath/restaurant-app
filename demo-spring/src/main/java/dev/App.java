package dev;

import dev.dao.DaoArrayList;
import dev.dao.DaoBlague;
import dev.dao.IDao;
import dev.metier.IService;
import dev.metier.Service1;
import dev.presentation.Ihm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // C'est moi qui aie le contrôle
        // Je crée les objets
        IDao dao = new DaoBlague();

        Scanner scanner = new Scanner(System.in);
        IService service = new Service1(dao);

        Ihm ihm = new Ihm(service, scanner);

        ihm.demarrer();
    }
}
