package dev.presentation;

import dev.metier.IService;

import java.util.Scanner;

public class Ihm {

    private IService service;
    private Scanner scanner;

    public Ihm(IService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }

    public void demarrer() {
        System.out.println("Saisie : ");
        String saisie = this.scanner.next();

        this.service.sauvegarder(saisie);

        System.out.println("Affichage de la liste");
        for (String texte : this.service.lister()) {
            System.out.println(texte);
        }
    }
}
