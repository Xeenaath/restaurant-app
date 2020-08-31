package dev.dao;

import java.util.List;

public interface IDao {

    /**
     * Sauvegarder un texte.
     *
     * @param texte un texte à sauvegarder
     */
    void sauvegarder(String texte);

    /**
     *
     * @return la liste des textes sauvegardés
     */
    List<String> lister();

}
